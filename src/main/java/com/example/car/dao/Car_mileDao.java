package com.example.car.dao;

import com.example.car.entity.Car_mile;

import java.util.List;

public interface Car_mileDao {
   public List<Car_mile>getAllRecords();
   public void insert(Car_mile car_mile);
}
