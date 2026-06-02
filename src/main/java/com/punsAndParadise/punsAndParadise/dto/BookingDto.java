package com.punsAndParadise.punsAndParadise.dto;

import com.punsAndParadise.punsAndParadise.entity.Hotel;
import com.punsAndParadise.punsAndParadise.entity.Room;
import com.punsAndParadise.punsAndParadise.entity.User;
import com.punsAndParadise.punsAndParadise.entity.enums.BookingStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

public class BookingDto {

    private Long id;
    private Hotel hotel;
    private Room room;
    private User user;
    private Integer roomsCount;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BookingStatus bookingStatus;
    private Set<GuestDto> guests;

}
