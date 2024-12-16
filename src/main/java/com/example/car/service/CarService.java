package com.example.car.service;

import com.example.car.dto.CarDTO;

import java.util.List;

public interface CarService {
    public CarDTO saveCar(CarDTO carDTO);

    public boolean deleteCar(Long id);

    public List<CarDTO> getCarByModel(String model);


    public List<CarDTO> saveCars(List<CarDTO> carDTOS);
}

