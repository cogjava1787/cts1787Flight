package net.AirplaneReservation.SpringBoot.Service;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.AirplaneReservation.SpringBoot.Entity.Flight;
import net.AirplaneReservation.SpringBoot.Repository.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepository repo;
	
	public FlightService() {
		System.out.println("FlightService init");
	}

	public List<Flight> fetchAllFlights(){
		System.out.println("Find all Flights");
		return repo.findAll();
	}
	public Flight getFlightById(int ID) {
		Optional<Flight> optional = repo.findById((long) ID);
		if(optional.isPresent()) {
			return optional.get();
		} else {		
			System.out.println("Could not find book with id "+ID);
			return null;
		}
	}
	public Flight updateFlight(Flight b)
	{
		return repo.save(b);
	}
	public Flight deleteFlight(Flight b)
	{
		return repo.save(b);
	}
	public Flight createFlight(Flight b) {
		return repo.save(b);
	}
	
}


