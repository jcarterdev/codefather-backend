package com.swacorp.codefatherbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Forecast {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String partOfDay;
    private Date timestamp;
    private Integer numberOfFlights;

}





