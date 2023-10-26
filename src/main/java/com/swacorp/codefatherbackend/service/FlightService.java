package com.swacorp.codefatherbackend.service;

import com.swacorp.codefatherbackend.model.Flight;
import com.swacorp.codefatherbackend.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class FlightService {


    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> findAll(){
        return StreamSupport.stream(flightRepository.findAll().spliterator(), false)
                .toList();
    }

}
