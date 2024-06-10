package com.customQuery.customQuery.controllers;

import com.customQuery.customQuery.entities.Flight;
import com.customQuery.customQuery.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;
    @PostMapping("/")
    public ResponseEntity<List<Flight>> addFlight(){
        List<Flight> newFlights = flightService.createFlights();
        return ResponseEntity.status(HttpStatus.CREATED).body(newFlights);
    }
    @GetMapping("/list")
    public List<Flight> getAllFlight(){
       return flightService.searchAllFlights();
    }
}
