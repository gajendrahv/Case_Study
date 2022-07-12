package com.capgemini.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.main.model.Train;

public interface AdminRepository extends MongoRepository<Train,Integer>{
	
	

}
