package com.customQuery.customQuery.DAO;

import com.customQuery.customQuery.entities.Flight;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.relational.core.dialect.MySqlDialect;
import org.springframework.stereotype.Repository;
import net.sf.jsqlparser.expression.Expression;

import java.util.List;

@Repository
public interface FlightDAO extends JpaRepository<Flight, Long> {
   @Query(value = "SELECT * FROM flights ",nativeQuery = true)
    List<Flight> searchAllFlight();
//non riesco a farla funzionare,ho aggiunto e tolto dipendenze
// che richiedevano per la risouluzione del problema ma niente
}
