package com.airbnb.projects.airBnbWebApp.repository;

import com.airbnb.projects.airBnbWebApp.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest,Long> {
}
