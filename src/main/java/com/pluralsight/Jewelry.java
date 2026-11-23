package com.pluralsight.assets;

public class Jewelry extends Asset {
    private double value;
    public Jewelry(String description,
                   String dateAcquired,
                   double originalCost,
                   double value) {
        super(description, dateAcquired, originalCost);
        this.value = value;
    }

    public double getJewelryValue() {
        return value;
    }
    public void setJewelryValue(double value) {
        this.value = value;
    }
    @Override
    public double getValue() {
        return value;
    }