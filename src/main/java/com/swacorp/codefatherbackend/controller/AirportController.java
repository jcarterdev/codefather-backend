package com.swacorp.codefatherbackend.controller;

import com.swacorp.codefatherbackend.model.Airport;
import com.swacorp.codefatherbackend.repository.AirportRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/airports")
public class AirportController {


    private final AirportRepository airportRepository;

    public AirportController(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @GetMapping("/")
    public List<Airport> getAllAirports(){
        return airportRepository.findAll();
    }
}
