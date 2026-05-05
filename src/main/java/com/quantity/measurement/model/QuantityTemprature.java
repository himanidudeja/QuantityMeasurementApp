package com.quantity.measurement.model;

import com.quantity.measurement.enumsImpl.TempratureUnit;

public class QuantityTemprature {

    private final Quantity<TempratureUnit> quantity;

    public QuantityTemprature(double value, TempratureUnit unit) {
        this.quantity = new Quantity<>(value, unit);
    }

    public double getValue() {
        return quantity.getValue();
    }

    public TempratureUnit getUnit() {
        return quantity.getUnit();
    }

    public QuantityTemprature toConvert(TempratureUnit targetUnit) {
        Quantity<TempratureUnit> result = quantity.toConvert(targetUnit);
        return new QuantityTemprature(result.getValue(), result.getUnit());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof QuantityTemprature)) {
            return false;
        }
        return this.quantity.equals(((QuantityTemprature) o).quantity);
    }
}