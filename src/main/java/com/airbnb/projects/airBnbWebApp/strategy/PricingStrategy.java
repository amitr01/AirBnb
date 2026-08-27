package com.airbnb.projects.airBnbWebApp.strategy;

import com.airbnb.projects.airBnbWebApp.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
