package com.example.car.dao;

import com.example.car.entity.Car_Insurance;

import java.util.List;

public interface Car_InsuranceDao {
    public List<Car_Insurance> getAllRecords();
    public void insert(Car_Insurance car_insurance);
}
