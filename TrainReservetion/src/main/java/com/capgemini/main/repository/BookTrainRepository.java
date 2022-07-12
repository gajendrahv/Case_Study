package com.capgemini.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.main.model.Booking;

public interface BookTrainRepository extends MongoRepository<Booking, Integer>{

	
	
	

}
