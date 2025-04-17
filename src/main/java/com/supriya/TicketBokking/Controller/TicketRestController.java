package com.supriya.TicketBokking.Controller;

import com.supriya.TicketBokking.Entity.Passenger;
import com.supriya.TicketBokking.Entity.Ticket;
import com.supriya.TicketBokking.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketRestController {

    private TicketService ticketService;
    @PostMapping("/bookTicket")
    public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) {

        Ticket ticket = ticketService.bookTicket(passenger);
        return new ResponseEntity<>(ticket, HttpStatus.CREATED);
    }
    @GetMapping("/ticketId/{ticketId}")
    public ResponseEntity<Ticket> getTicket(@PathVariable Integer ticketId) {
        Ticket ticket = ticketService.getTicket(ticketId);
        return ResponseEntity.ok(ticket);
    }
    // @GetMapping("/ticket/{ticketNum}")
// public ResponseEntity<Ticket> getTicket(@PathVariable("ticketId") String ticketId) {
// Ticket ticket = ticketService.getTicket(ticketId);
// return new ResponseEntity<>(ticket, HttpStatus.OK);
// }
 }
