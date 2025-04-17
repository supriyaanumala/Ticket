package com.supriya.TicketBokking.Dto;

import com.supriya.TicketBokking.Entity.Passenger;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {

    private Integer id;
    private Passenger passenger;
    private String ticketNum;
    private double ticketPrice;
    private String ticketStatus;
}
