package com.siddharth.parking.Controller;

import com.siddharth.parking.Dtos.RequestDto;
import com.siddharth.parking.Dtos.ResponseDto;
import com.siddharth.parking.Dtos.ResponseStatusEnum;
import com.siddharth.parking.Exception.InvalidGateException;
import com.siddharth.parking.Service.TicketService;
import com.siddharth.parking.models.Ticket;

public class Tickets {
private TicketService ticketService;

    public Tickets(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public ResponseDto issueTicket(RequestDto requestDto) {
        Ticket ticket = null;
        try {
            ticket = ticketService.issueTicket(requestDto.getGateId(), requestDto.getVehicleNumber(), requestDto.getVehicleType(),
                    requestDto.getOwnerName());
        } catch (InvalidGateException e) {
            throw new RuntimeException(e);
        }

        ResponseDto responseDto = new ResponseDto();
        responseDto.setTicket(ticket);
        responseDto.setResponseStatus(ResponseStatusEnum.SUCCESS);

        return responseDto;
    }
}
