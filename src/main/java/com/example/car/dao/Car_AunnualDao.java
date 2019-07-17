package com.example.car.dao;

import com.example.car.entity.Car_Annual;

import java.util.List;

public interface Car_AunnualDao {
   public List<Car_Annual> getAllRecords();
   public void insert(Car_Annual car_annual);
}
