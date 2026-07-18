package com.punsAndParadise.punsAndParadise.service;

import com.punsAndParadise.punsAndParadise.dto.HotelDto;
import com.punsAndParadise.punsAndParadise.dto.HotelPriceDto;
import com.punsAndParadise.punsAndParadise.dto.HotelSearchRequest;
import com.punsAndParadise.punsAndParadise.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
