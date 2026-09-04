package com.airbnb.projects.airBnbWebApp.service;

import com.airbnb.projects.airBnbWebApp.dto.HotelDto;
import com.airbnb.projects.airBnbWebApp.dto.HotelPriceDto;
import com.airbnb.projects.airBnbWebApp.dto.HotelSearchRequest;
import com.airbnb.projects.airBnbWebApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void intializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
