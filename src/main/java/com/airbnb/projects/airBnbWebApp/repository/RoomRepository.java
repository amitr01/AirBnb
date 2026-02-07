package com.airbnb.projects.airBnbWebApp.repository;

import com.airbnb.projects.airBnbWebApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
}
