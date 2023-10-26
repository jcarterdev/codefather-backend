package com.swacorp.codefatherbackend.controller;

import com.swacorp.codefatherbackend.model.Airport;
import com.swacorp.codefatherbackend.service.AirportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/airports")
public class AirportController {


    private final AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/")
    public List<Airport> getAllAirports(){
        return airportService.findAll();
    }
}
