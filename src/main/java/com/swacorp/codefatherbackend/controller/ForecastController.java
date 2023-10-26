package com.swacorp.codefatherbackend.controller;

import com.swacorp.codefatherbackend.model.Forecast;
import com.swacorp.codefatherbackend.service.ForecastService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class ForecastController {

    private final ForecastService forecastService;

    public ForecastController(ForecastService forecastService) {
        this.forecastService = forecastService;
    }

    @GetMapping("/forecasts/")
    public List<Forecast> getAllForecasts(){
        return forecastService.findAll();
    }

    @GetMapping("/forecasts/date/{strDate}")
    public List<Forecast> getForecastsByDate(@PathVariable String strDate) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(strDate);

        return forecastService.findByTimestamp(date);
    }

    @GetMapping("/forecasts/date/{startDate}/{endDate}")
    public List<Forecast> getForecastsByDate(@PathVariable String startDate, @PathVariable String endDate) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date start = sdf.parse(startDate);
        Date end = sdf.parse(endDate);

        return forecastService.findBetwenTimesamp(start, end);
    }

    @GetMapping("/forecasts/shift/{shift}")
    public List<Forecast> getForecastsByShift(@PathVariable String shift){
        return forecastService.findByPartOfDay(shift);
    }

}
