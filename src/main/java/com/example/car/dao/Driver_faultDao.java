package com.example.car.dao;

import com.example.car.entity.Driver_fault;

import java.util.List;

public interface Driver_faultDao {
    List<Driver_fault> staPersonAll();
    public void insert(Driver_fault driver_fault);
}
