package net.AirplaneReservation.SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.AirplaneReservation.SpringBoot.Entity.Flight;
import net.AirplaneReservation.SpringBoot.Service.FlightService;

@RestController
	public class FlightController {

		@Autowired
		private FlightService service;
		
		
		public FlightController(FlightService service) {
			super();
			this.service = service;
		}

		@GetMapping("/Flights")
		public List<Flight> fetchAllFlights(){
			return service.fetchAllFlights();
		}
		
		@GetMapping("/Flights/{ID}")
		public Flight getFlight(@PathVariable int ID) {
			return service.getFlightById(ID);
		}
		
		@PostMapping("/Flights")
		public Flight saveFlight(@RequestBody Flight Flight) {
			return service.createFlight(Flight);
		}
		
		@PutMapping("/Flights/{id}")
		public Flight updateFlight(@RequestBody Flight Flight) {
			return service.updateFlight(Flight);
		}
		
		@DeleteMapping("/Flights/{id}")
		public Flight deleteFlight(@PathVariable Flight Flight) {
			return service.deleteFlight(Flight);
		}
	}

