package com.geo.play.controller;

import com.geo.play.domain.Schedule;
import com.geo.play.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/schedule")
public class ScheduleController {
    @Autowired private ScheduleService scheduleService;

    @RequestMapping(value = "/getAllSchedule")
    List<Schedule> getAllSchedule(){
        List<Schedule> schedules = scheduleService.findAllSchedule();
        return schedules;
    }
}
