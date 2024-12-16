package com.example.car.mapper;

import com.example.car.dao.entities.Car;
import com.example.car.dto.CarDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CarMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Car fromCarDtoToCar(CarDTO carDTO){
        return mapper.map(carDTO, Car.class);
    }

    public CarDTO fromCarToCarDto(Car car){
        return mapper.map(car, CarDTO.class);
    }
}
