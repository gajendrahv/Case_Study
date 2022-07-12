package com.capgemini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.model.Booking;
import com.capgemini.main.repository.BookTrainRepository;

@RestController
@RequestMapping("/book")
public class BookTrainController {
	
	@Autowired
	BookTrainRepository bookTrainRepo;
	
	@PostMapping("/booknow")
	public Booking bookFlight(@RequestBody Booking booking) {
		
		return bookTrainRepo.save(booking);
	}
	
	public List<Booking> getBookingById(@PathVariable("bookingId") int bookingId){
		return bookTrainRepo.findAll();
		
	}
	
	
	

}
