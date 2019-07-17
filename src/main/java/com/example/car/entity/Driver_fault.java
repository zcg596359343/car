package com.example.car.entity;

public class Driver_fault {
    private String driverName;
    private double allsumtask,dtcsumtask,avgrate;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getAllsumtask() {
        return allsumtask;
    }

    public void setAllsumtask(double allsumtask) {
        this.allsumtask = allsumtask;
    }

    public double getDtcsumtask() {
        return dtcsumtask;
    }

    public void setDtcsumtask(double dtcsumtask) {
        this.dtcsumtask = dtcsumtask;
    }

    public double getAvgrate() {
        return avgrate;
    }

    public void setAvgrate(double avgrate) {
        this.avgrate = avgrate;
    }
}
