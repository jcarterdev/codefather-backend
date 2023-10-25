package com.swacorp.codefatherbackend.controller;

import com.swacorp.codefatherbackend.model.Flight;
import com.swacorp.codefatherbackend.service.FlightService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController("/flight")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/daily/{strDate}")
    public List<Flight> getDailyFlights(@PathVariable String strDate){

        LocalDate localDate = LocalDate.parse(strDate);

        return flightService.getFlightList(localDate);

    }
}
