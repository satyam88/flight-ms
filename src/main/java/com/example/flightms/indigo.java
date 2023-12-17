package com.example.flightms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indigo {
    @GetMapping("/indigo")
    public String getData() {return  "Please book flight from Indigo 15% discount" ; }
}