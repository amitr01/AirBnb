package com.airbnb.projects.airBnbWebApp.service;

import com.airbnb.projects.airBnbWebApp.dto.HotelDto;
import com.airbnb.projects.airBnbWebApp.entity.Hotel;
import com.airbnb.projects.airBnbWebApp.exception.ResourceNotFoundException;
import com.airbnb.projects.airBnbWebApp.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
@Slf4j
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;
    private final ModelMapper modelMapper;

   public HotelDto createNewHotel(HotelDto hotelDto){
       log.info("Creating a new hotel with name: {}",hotelDto.getName());
       Hotel hotel = modelMapper.map(hotelDto,Hotel.class);
       hotel.setActive(false);
       hotel = hotelRepository.save(hotel);
       log.info("Created a new hotel with ID:{}",hotelDto.getId());
       return modelMapper.map(hotel,HotelDto.class);
    }

    @Override
    public HotelDto getHotelById(Long id) {
        log.info("Getting the hotel with ID:{}",id);
        Hotel hotel = hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel" +
                "not found with ID:"+id));
        return modelMapper.map(hotel,HotelDto.class);
    }
}
