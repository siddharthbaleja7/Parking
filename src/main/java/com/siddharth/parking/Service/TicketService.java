package com.siddharth.parking.Service;

import com.siddharth.parking.Exception.InvalidGateException;
import com.siddharth.parking.Repository.GateRepo;
import com.siddharth.parking.models.Gate;
import com.siddharth.parking.models.Ticket;
import com.siddharth.parking.models.VehicleTypeEnum;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepo gateRepository;

    public TicketService(GateRepo gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleTypeEnum vehicleType, String ownerName) throws InvalidGateException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        if (optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());




        return null;
    }
}
