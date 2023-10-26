package com.swacorp.codefatherbackend.service;

import com.swacorp.codefatherbackend.model.Forecast;
import com.swacorp.codefatherbackend.repository.ForecastRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ForecastService {

    private final ForecastRepository forecastRepository;

    public ForecastService(ForecastRepository forecastRepository) {
        this.forecastRepository = forecastRepository;
    }

    public List<Forecast> findAll(){
        return StreamSupport.stream(forecastRepository.findAll().spliterator(), false)
                .toList();
    }

    public List<Forecast> findByPartOfDay(String partOfDay){
        return forecastRepository.findByPartOfDay(partOfDay);
    }

    public List<Forecast> findByTimestamp(Date timestamp){
        return forecastRepository.findByTimestamp(timestamp);
    }

    public List<Forecast> findBetwenTimesamp(Date start, Date end){
        return forecastRepository.findByTimestampBetween(start, end);
    }
}
