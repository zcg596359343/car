package com.example.car.dao;

import com.example.car.entity.Car_fault;

import java.util.List;

public interface Car_faultDao {
    List<Car_fault> staCarAll();
    public void insert(Car_fault car_fault);
}
