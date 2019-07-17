package com.example.car.dao;

import com.example.car.entity.Car_fuel;

import java.util.List;

public interface Car_fuelDao {
    List<Car_fuel> staCarAll();
    public void insert(Car_fuel car_fuel);
}
