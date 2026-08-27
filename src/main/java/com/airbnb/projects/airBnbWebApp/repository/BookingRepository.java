package com.airbnb.projects.airBnbWebApp.repository;

import com.airbnb.projects.airBnbWebApp.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
