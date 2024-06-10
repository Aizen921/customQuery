package com.customQuery.customQuery.DAO;

import com.customQuery.customQuery.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface FlightDAO extends JpaRepository<Flight, Long> {
   @Query("SELECT f FROM Flight f")
    List<Flight> searchAllFlight();

}
