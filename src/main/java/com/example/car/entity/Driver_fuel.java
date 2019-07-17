package com.example.car.entity;

public class Driver_fuel {
    private String driverName;
    private double sumDistance,sumFuel,avgFuel;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
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
