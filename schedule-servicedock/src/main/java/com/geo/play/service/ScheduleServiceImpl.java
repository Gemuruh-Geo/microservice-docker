package com.geo.play.service;

import com.geo.play.domain.Schedule;
import com.geo.play.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService{
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Override
    public List<Schedule> findAllSchedule() {
        return scheduleRepository.findAll();
    }
}
