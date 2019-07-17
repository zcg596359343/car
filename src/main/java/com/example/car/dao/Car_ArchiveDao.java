package com.example.car.dao;

import com.example.car.entity.Car_Archive;

import java.util.List;

public interface Car_ArchiveDao {
   public List<Car_Archive> listAll();
   public void insert(Car_Archive car_archive);
}
