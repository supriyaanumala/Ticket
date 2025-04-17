package com.supriya.TicketBokking.Repository;

import com.supriya.TicketBokking.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
