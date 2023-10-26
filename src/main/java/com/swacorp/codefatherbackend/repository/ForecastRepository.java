package com.swacorp.codefatherbackend.repository;

import com.swacorp.codefatherbackend.model.Forecast;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ForecastRepository extends CrudRepository<Forecast, Long> {

    List<Forecast> findByPartOfDay(String partOfDay);
    List<Forecast> findByTimestamp(Date timestamp);
}
