package com.seyle.boiler_plate.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class MyServiceImpl implements MyService {

    @PostConstruct
    private void init() {
        log.info("MyService initialized");
    }

    @Override
    public String get() {
        log.info("Get method");
        return "Get method";
    }

    @Override
    public String post() {
        log.info("Post method");
        return "Post method";
    }
}
