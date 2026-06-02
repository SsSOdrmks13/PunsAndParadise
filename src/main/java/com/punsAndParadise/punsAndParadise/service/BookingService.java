package com.punsAndParadise.punsAndParadise.service;

import com.punsAndParadise.punsAndParadise.dto.BookingDto;
import com.punsAndParadise.punsAndParadise.dto.BookingRequest;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);
}
