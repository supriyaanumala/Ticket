package com.supriya.TicketBokking.Dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PassengerDTO {

    private Integer id;
    private String name;
    private String email;
    private String start;
    private String destination;
    private String jDate;
    private String trainNum;
}
