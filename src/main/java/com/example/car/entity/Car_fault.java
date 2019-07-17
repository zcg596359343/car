package com.example.car.entity;

public class Car_fault {
   private String carnumber;
   private double allsumtask,dtcsumtask,avgrate;

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
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
