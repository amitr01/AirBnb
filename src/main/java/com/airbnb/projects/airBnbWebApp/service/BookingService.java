package com.airbnb.projects.airBnbWebApp.service;

import com.airbnb.projects.airBnbWebApp.dto.BookingDto;
import com.airbnb.projects.airBnbWebApp.dto.BookingRequest;
import com.airbnb.projects.airBnbWebApp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto intialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);

}
