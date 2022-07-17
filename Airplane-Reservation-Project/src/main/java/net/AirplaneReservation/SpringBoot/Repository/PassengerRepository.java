package net.AirplaneReservation.SpringBoot.Repository;

import net.AirplaneReservation.SpringBoot.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
