package com.airbnb.projects.airBnbWebApp.service;

import com.airbnb.projects.airBnbWebApp.dto.HotelDto;
import com.airbnb.projects.airBnbWebApp.entity.Hotel;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);
}
