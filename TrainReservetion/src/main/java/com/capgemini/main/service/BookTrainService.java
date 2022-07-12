package com.capgemini.main.service;

import java.util.List;

import com.capgemini.main.model.Booking;

public interface BookTrainService {
	
	public Booking bookTrain(Booking booking);
	
	public List<Booking> getTrainByBookingId(int bookingId);
	
	public String cancelBooking(int bookingId);
	

}
