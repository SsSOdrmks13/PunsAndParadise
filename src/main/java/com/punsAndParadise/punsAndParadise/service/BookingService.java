package com.punsAndParadise.punsAndParadise.service;

import com.punsAndParadise.punsAndParadise.dto.BookingDto;
import com.punsAndParadise.punsAndParadise.dto.BookingRequest;
import com.punsAndParadise.punsAndParadise.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
