package com.punsAndParadise.punsAndParadise.strategy;

import com.punsAndParadise.punsAndParadise.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
