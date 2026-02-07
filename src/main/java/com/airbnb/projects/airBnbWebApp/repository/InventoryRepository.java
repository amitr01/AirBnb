package com.airbnb.projects.airBnbWebApp.repository;

import com.airbnb.projects.airBnbWebApp.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {
}
