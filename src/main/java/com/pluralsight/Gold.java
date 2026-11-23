package com.pluralsight.assets;

public class Gold extends Asset {
    private double weight;
    private double pricePerOunce;

    public Gold(String description,
                String dateAcquired,
                double originalCost,
                double weight,
                double pricePerOunce) {
        super(description, dateAcquired, originalCost);
        this.weight = weight;
        this.pricePerOunce = pricePerOunce;
    }

    public double getWeight() {
        return weight;
    }

    public double getPricePerOunce() {
        return pricePerOunce;
    }

    public void setPricePerOunce(double pricePerOunce) {
        this.pricePerOunce = pricePerOunce;
    }

    @Override
    public double getValue() {
        return weight * pricePerOunce;
    }
}