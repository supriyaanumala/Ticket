package com.supriya.TicketBokking.Mapper;

import com.supriya.TicketBokking.Dto.TicketDTO;
import com.supriya.TicketBokking.Entity.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.awt.*;

@Mapper(componentModel="spring")
public interface TicketMapper {
    TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);
    @Mapping(source = "passenger.id" , target = "id")
    TicketDTO toDto(Ticket ticket);
    @Mapping(source = "id",target = "passenger.id")
    Ticket toEntity(TicketDTO ticketDTO);
}
