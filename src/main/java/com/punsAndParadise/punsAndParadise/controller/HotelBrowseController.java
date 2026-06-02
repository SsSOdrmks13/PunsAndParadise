package com.punsAndParadise.punsAndParadise.controller;

import com.punsAndParadise.punsAndParadise.dto.HotelDto;
import com.punsAndParadise.punsAndParadise.dto.HotelInfoDto;
import com.punsAndParadise.punsAndParadise.dto.HotelSearchRequest;
import com.punsAndParadise.punsAndParadise.service.HotelService;
import com.punsAndParadise.punsAndParadise.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class HotelBrowseController {

    private final InventoryService inventoryService;
    private final HotelService hotelService;

    @GetMapping("/search")
    public ResponseEntity<Page<HotelDto>> searchHotels(@RequestBody HotelSearchRequest hotelSearchRequest){
        Page<HotelDto> page = inventoryService.searchHotels(hotelSearchRequest);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId){
        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId));
    }
}
