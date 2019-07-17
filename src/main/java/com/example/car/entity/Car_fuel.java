package com.example.car.entity;

public class Car_fuel {
    private String carnumber;
    private double sumDistance,sumFuel,avgFuel;

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public double getSumDistance() {
        return sumDistance;
    }

    public void setSumDistance(double sumDistance) {
        this.sumDistance = sumDistance;
    }

    public double getSumFuel() {
        return sumFuel;
    }

    public void setSumFuel(double sumFuel) {
        this.sumFuel = sumFuel;
    }

    public double getAvgFuel() {
        return avgFuel;
    }

    public void setAvgFuel(double avgFuel) {
        this.avgFuel = avgFuel;
    }
}
