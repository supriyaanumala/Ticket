package com.supriya.TicketBokking.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@Table(name="tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;
    private String ticketNum;
    private double ticketPrice;
    private String ticketStatus;

    public Ticket() {
    }

    public Ticket(Integer id, Passenger passenger, String ticketNum, double ticketPrice, String ticketStatus) {
        this.id = id;
        this.passenger = passenger;
        this.ticketNum = ticketNum;
        this.ticketPrice = ticketPrice;
        this.ticketStatus = ticketStatus;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

}
