package com.example.car.controller;

import com.example.car.dao.*;
import com.example.car.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jofficesrc/webservice")
@EnableAutoConfiguration
public class WebServiceController {
    @Autowired
    Car_runDao car_runDao;
    @Autowired
    Car_repairDao car_repairDao;
    @Autowired
    Car_faultDao car_faultDao;
    @Autowired
    Driver_faultDao driver_faultDao;
    @Autowired
    Driver_fuelDao driver_fuelDao;
    @Autowired
    Car_fuelDao car_fuelDao;
    @Autowired
    Car_mileDao car_mileDao;
    @Autowired
    Car_InsuranceDao car_insuranceDao;
    @Autowired
    Car_AunnualDao car_aunnualDao;
    @Autowired
    Car_ArchiveDao car_archiveDao;

    @RequestMapping("/carArchiveService")
    public List<Car_run> getCar() {
        return car_runDao.listAll();
    }

    @RequestMapping("/carModifyService")
    public List<Car_repair> getRepair() {
        return car_repairDao.getAllRecords();
    }

    @RequestMapping("/driverErrorsStatisticService")
    public List<Driver_fault> getDriver() {
        return driver_faultDao.staPersonAll();
    }

    @RequestMapping("/carErrorsStatisticService")
    public List<Car_fault> getCar_fault() {
        return car_faultDao.staCarAll();
    }

    @RequestMapping("/carfuelService")
    public List<Car_fuel> getCar_fuel(){
        return car_fuelDao.staCarAll();
    }

    @RequestMapping("/driverfuelService")
    public List<Driver_fuel> getDriver_fuel(){
        return driver_fuelDao.staPersonAll();
    }

    @RequestMapping("/carMilesService")
    public List<Car_mile> getCar_Mile(){
        return car_mileDao.getAllRecords();
    }

    @RequestMapping("/carInsuranceService")
    public List<Car_Insurance> getCarInsurance(){
        return car_insuranceDao.getAllRecords();
    }

    @RequestMapping("/carAnnualInspectionService")
    public List<Car_Annual> getCarAnnual(){
        return car_aunnualDao.getAllRecords();
    }

    @RequestMapping("/carHistoryService")
    public List<Car_Archive> getCarArchive(){
        return car_archiveDao.listAll();
    }
}
