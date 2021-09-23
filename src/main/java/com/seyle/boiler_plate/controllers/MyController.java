package com.seyle.boiler_plate.controllers;

import com.seyle.boiler_plate.services.MyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/test")
@CrossOrigin
public class MyController {
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping(value = "/get")
    @ResponseBody
    public Object get() {
        return ResponseEntity.ok(this.myService.get());
    }

    @PostMapping(value = "/post")
    @ResponseBody
    public Object post() {
        return ResponseEntity.ok(this.myService.post());
    }
}
