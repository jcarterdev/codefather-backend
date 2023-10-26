package com.swacorp.codefatherbackend.controller;

import com.swacorp.codefatherbackend.model.Flight;
import com.swacorp.codefatherbackend.service.FlightService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flights/")
    public List<Flight> getAllFlights(){
        return flightService.findAll();
    }
}
