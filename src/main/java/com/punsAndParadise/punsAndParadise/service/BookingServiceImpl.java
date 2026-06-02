package com.punsAndParadise.punsAndParadise.service;

import com.punsAndParadise.punsAndParadise.dto.BookingDto;
import com.punsAndParadise.punsAndParadise.dto.BookingRequest;
import com.punsAndParadise.punsAndParadise.entity.Hotel;
import com.punsAndParadise.punsAndParadise.entity.Inventory;
import com.punsAndParadise.punsAndParadise.entity.Room;
import com.punsAndParadise.punsAndParadise.exception.ResourceNotFoundException;
import com.punsAndParadise.punsAndParadise.repository.BookingRepository;
import com.punsAndParadise.punsAndParadise.repository.HotelRepository;
import com.punsAndParadise.punsAndParadise.repository.InventoryRepository;
import com.punsAndParadise.punsAndParadise.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService{

    private final BookingRepository bookingRepository;
    private final HotelRepository hotelRepository;
    private final RoomRepository roomRepository;
    private final InventoryRepository inventoryRepository;

    @Override
    @Transactional
    public BookingDto initialiseBooking(BookingRequest bookingRequest) {
        Hotel hotel = hotelRepository.findById(bookingRequest.getHotelId()).orElseThrow(() ->
                new ResourceNotFoundException("Hotel not found with id : {}" + bookingRequest.getHotelId())
        );

        Room room = roomRepository.findById(bookingRequest.getRoomId()).orElseThrow(() ->
                new ResourceNotFoundException("Room not found with id : {}" + bookingRequest.getRoomId())
        );

        List<Inventory> inventoryList = inventoryRepository.findAndLockAvailableInventory(room.getId(),
                bookingRequest.getCheckInDate(), bookingRequest.getCheckOutDate(), bookingRequest.getRoomsCount());

        Long daysCount = ChronoUnit.DAYS.between(bookingRequest.getCheckInDate(), bookingRequest.getCheckOutDate()) + 1;

        if(inventoryList.size() != daysCount){
            throw new IllegalStateException("Room is not available anymore");
        }
    }
}
