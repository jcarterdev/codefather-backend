package com.swacorp.codefatherbackend.service;

import com.swacorp.codefatherbackend.model.Schedule;
import com.swacorp.codefatherbackend.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public List<Schedule> findAll(){
        return StreamSupport.stream(scheduleRepository.findAll().spliterator(), false)
                .toList();
    }
}
