package com.punsAndParadise.punsAndParadise.strategy;

import com.punsAndParadise.punsAndParadise.entity.Inventory;

import java.math.BigDecimal;

public class BasePricingStrategy implements PricingStrategy{

    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        return inventory.getRoom().getBasePrice();
    }
}
