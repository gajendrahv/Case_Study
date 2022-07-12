package com.capgemini.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.model.Booking;
import com.capgemini.main.repository.BookTrainRepository;
import com.capgemini.main.service.BookTrainService;

@Service
public class BookTrainServiceImpl implements BookTrainService{
	
	@Autowired
	BookTrainRepository bookTrainRepository;

	@Override
	public Booking bookTrain(Booking booking) {
		
		return bookTrainRepository.save(booking);
	}

	@Override
	public String cancelBooking(int bookingId) {
		bookTrainRepository.deleteById(bookingId);
		return "Booking cancelled successfully ";
	}

	@Override
	public List<Booking> getTrainByBookingId(int bookingId) {
		Optional<Booking> findById = bookTrainRepository.findById(bookingId);
		  if(findById.isPresent()) {
			  return bookTrainRepository.findAll();
		  }else
			  System.out.println("booking not present");
		return null;
	}

}
