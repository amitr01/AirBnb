package com.airbnb.projects.airBnbWebApp.controller;

import com.airbnb.projects.airBnbWebApp.dto.HotelDto;
import com.airbnb.projects.airBnbWebApp.dto.HotelInfoDto;
import com.airbnb.projects.airBnbWebApp.dto.HotelInfoRequestDto;
import com.airbnb.projects.airBnbWebApp.dto.HotelSearchRequest;
import com.airbnb.projects.airBnbWebApp.service.HotelService;
import com.airbnb.projects.airBnbWebApp.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class HotelBrowseController {

    private final InventoryService inventoryService;
    private final HotelService hotelService;

    @GetMapping("/search")
    public ResponseEntity<Page<HotelDto>> searchHotel(@RequestBody HotelSearchRequest hotelSearchRequest) {
        Page<HotelDto> page = inventoryService.searchHotels(hotelSearchRequest);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId, @RequestBody HotelInfoRequestDto hotelInfoRequestDto) {
        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId, hotelInfoRequestDto));
    }
}
