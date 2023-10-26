package com.swacorp.codefatherbackend.repository;


import com.swacorp.codefatherbackend.model.Airport;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AirportRepository extends CrudRepository<Airport, Long> {

    List<Airport> findAll();
}
