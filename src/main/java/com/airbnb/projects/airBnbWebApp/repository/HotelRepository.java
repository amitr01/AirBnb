package com.airbnb.projects.airBnbWebApp.repository;

import com.airbnb.projects.airBnbWebApp.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
