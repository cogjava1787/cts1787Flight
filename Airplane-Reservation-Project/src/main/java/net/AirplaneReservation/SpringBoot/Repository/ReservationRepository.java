package net.AirplaneReservation.SpringBoot.Repository;

import net.AirplaneReservation.SpringBoot.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long>{
}
