package com.supriya.TicketBokking.Mapper;

import com.supriya.TicketBokking.Dto.PassengerDTO;
import com.supriya.TicketBokking.Dto.TicketDTO;
import com.supriya.TicketBokking.Entity.Passenger;
import com.supriya.TicketBokking.Entity.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface PassengerMapper {

    @Mapper(componentModel="spring")
    public interface TicketMapper {
        PassengerMapper INSTANCE = Mappers.getMapper(PassengerMapper.class);
        PassengerDTO toDto(Passenger passenger);
        Passenger toEntity(PassengerDTO passengerDTO);
    }
}
