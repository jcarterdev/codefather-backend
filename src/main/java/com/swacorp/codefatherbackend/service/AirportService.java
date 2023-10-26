package com.swacorp.codefatherbackend.service;

import com.swacorp.codefatherbackend.model.Airport;
import com.swacorp.codefatherbackend.repository.AirportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class AirportService {


    private final AirportRepository airportRepository;

    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<Airport> findAll(){
        return StreamSupport.stream(airportRepository.findAll().spliterator(), false)
                .toList();
    }
}
