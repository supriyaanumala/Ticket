package com.supriya.TicketBokking.Service;


import com.supriya.TicketBokking.Entity.Passenger;
import com.supriya.TicketBokking.Entity.Ticket;
import com.supriya.TicketBokking.Mapper.TicketMapper;
import com.supriya.TicketBokking.Repository.PassengerRepository;
import com.supriya.TicketBokking.Repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TicketService {

    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private TicketRepository ticketRepository;
    private final TicketMapper ticketMapper = TicketMapper.INSTANCE;


    public String generateTicketNumber() {
        return UUID.randomUUID().toString(); // Generates a random UUID
    }

    public Ticket bookTicket(Passenger passenger) {
        Passenger savedPassenger = passengerRepository.save(passenger);
         Ticket ticket1 = new Ticket();
         ticket1.setPassenger(savedPassenger);
         ticket1.setTicketNum(generateTicketNumber());
         ticket1.setTicketPrice(300.00);
         ticket1.setTicketStatus("CONFIRMED");
         Ticket savedTicket = ticketRepository.save(ticket1);
         return savedTicket;
    }

    public Ticket getTicket(Integer ticketId) {
        Optional<Ticket> optionalTicket = ticketRepository.findById(ticketId);
        if (optionalTicket.isPresent()) {
            return optionalTicket.get(); //Return the ticket if found
        } else {
            throw new RuntimeException("Ticket ID is " + ticketId + " not found");
        }
    }
}
