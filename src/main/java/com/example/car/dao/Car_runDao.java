package com.example.car.dao;

import com.example.car.entity.Car_run;

import java.util.List;

public interface Car_runDao  {
    public List<Car_run> listAll();
    public void insert(Car_run car_run);
}
