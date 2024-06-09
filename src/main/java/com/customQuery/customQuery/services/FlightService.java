package com.customQuery.customQuery.services;

import com.customQuery.customQuery.DAO.FlightDAO;
import com.customQuery.customQuery.entities.Flight;
import com.customQuery.customQuery.enums.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

@Service
public class FlightService {
    @Autowired
    private FlightDAO flightDAO;

    public Flight createFlight() {
        Flight newFlight = new Flight();
        newFlight.setDescription("Andata e Ritorno");
        newFlight.setFromAirport(generateRandomString());
        newFlight.setToAirport(generateRandomString());
        newFlight.setStatusEnum(StatusEnum.ONTIME);
        Flight fligtCreted = flightDAO.save(newFlight);
        return fligtCreted;
    }

    public String generateRandomString() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Palermo");
        stringList.add("Milano");
        stringList.add("Roma");
        stringList.add("Valencia");
        stringList.add("Bari");
        stringList.add("Verona");
        Random rand = new Random();
        int casuale = rand.nextInt(stringList.size());
        String randomString = stringList.get(casuale);
        return randomString;
    }
    public List<Flight> searchAllFlights(){
      return   flightDAO.searchAllFlight();

    }
}
