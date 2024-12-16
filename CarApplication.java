package com.example.car;

import com.example.car.dto.CarDTO;
import com.example.car.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CarApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
    }


    @Bean
    CommandLineRunner start(CarService carService) {
        return args -> {
            carService.saveCars(
                    List.of(
                            CarDTO.builder().model("Yaris Cross").matricul("451643T6").color("orange").price(197300).build(),
                            CarDTO.builder().model("Ford Mustang").matricul("642593O1").color("red").price(300000000).build(),
                            CarDTO.builder().model("Audi RS6").matricul("mz288304").color("white").price(1200000).build(),
                            CarDTO.builder().model("Jaguar XF").matricul("wa802293").color("black").price(34000000).build()
                    )

            );
        };
    }}