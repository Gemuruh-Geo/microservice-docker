package com.geo.play.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.UUID;

@RestController
public class TestingController {
    private String uuid;
    @PostConstruct
    public void init(){
        uuid = UUID.randomUUID().toString();
    }

    @GetMapping(value = "/testing")
    public String testing(){
        return uuid;
    }
}
