package com.pluralsight;


public class House extends Asset {
    private String address;
    private double currentValue;
    public House(String description,
                 String dateAcquired,
                 double originalCost,
                 String address,
                 double currentValue) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.currentValue = currentValue;
    }

    public String getAddress() {
        return address;
    }
    public double getCurrentValue() {
        return currentValue;
    }
    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    @Override
    public double getValue() {
        return currentValue;
    }
}