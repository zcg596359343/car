package com.example.car.dao;

import com.example.car.entity.Car_repair;

import java.util.List;

public interface Car_repairDao {
    public List<Car_repair> getAllRecords();
    public void insert(Car_repair car_repair);
}
