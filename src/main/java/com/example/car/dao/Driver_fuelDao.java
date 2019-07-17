package com.example.car.dao;

import com.example.car.entity.Driver_fuel;

import java.util.List;

public interface Driver_fuelDao {
    List<Driver_fuel> staPersonAll();
    public void insert(Driver_fuel driver_fuel);
}
