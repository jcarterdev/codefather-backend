package com.swacorp.codefatherbackend.service;

import com.swacorp.codefatherbackend.model.AircraftType;
import com.swacorp.codefatherbackend.model.Flight;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class FlightService {


    public List<Flight> getFlightList(LocalDate localDate){

        //default time zone
        ZoneId defaultZoneId = ZoneId.systemDefault();

        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

        Flight flight1 = Flight.builder()
                .id(1L)
                .date(date)
                .tailNuber(RandomStringUtils.random(5))
                .type(AircraftType.MAX7.name())
                .build();

        Flight flight2 = Flight.builder()
                .id(2L)
                .date(date)
                .tailNuber(RandomStringUtils.random(5))
                .type(AircraftType.MAX8.name())
                .build();

        Flight flight3 = Flight.builder()
                .id(3L)
                .date(date)
                .tailNuber(RandomStringUtils.random(5))
                .type(AircraftType.MAX7.name())
                .build();

        return Arrays.asList(flight1, flight2, flight3);

    }
}
