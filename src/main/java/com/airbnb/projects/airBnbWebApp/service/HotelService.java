package com.airbnb.projects.airBnbWebApp.service;

import com.airbnb.projects.airBnbWebApp.dto.HotelDto;
import com.airbnb.projects.airBnbWebApp.dto.HotelInfoDto;
import com.airbnb.projects.airBnbWebApp.dto.HotelInfoRequestDto;
import com.airbnb.projects.airBnbWebApp.entity.Hotel;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHoteById(Long id);

    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId, HotelInfoRequestDto hotelInfoRequestDto);
}
