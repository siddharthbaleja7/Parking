package com.siddharth.parking.Dtos;

import com.siddharth.parking.models.Ticket;

public class ResponseDto {
    private Ticket ticket;
    private ResponseStatusEnum responseStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatusEnum getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatusEnum responseStatus) {
        this.responseStatus = responseStatus;
    }
}
