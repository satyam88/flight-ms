package com.example.flightms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class airindia {
    @GetMapping("/airindia")
    public String getData() {return  "Please book flight from airindia 15% discount" ; }
}