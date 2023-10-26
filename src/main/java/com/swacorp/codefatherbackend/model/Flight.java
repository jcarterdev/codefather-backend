package com.swacorp.codefatherbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Flight{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Airline airline;
    @ManyToOne
    private Airport departureAirport;
    @ManyToOne
    private Airport arrivalAirport;
    private Date departureTime;
    private Date arrivalTime;
    @ManyToOne
    private Aircraft aircraft;
}
