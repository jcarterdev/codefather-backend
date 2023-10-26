package com.swacorp.codefatherbackend.controller;

import com.swacorp.codefatherbackend.model.Schedule;
import com.swacorp.codefatherbackend.service.ScheduleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/schedules/")
    public List<Schedule> getAllSchedules(){
        return scheduleService.findAll();
    }
}
