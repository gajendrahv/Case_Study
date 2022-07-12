package com.capgemini.main.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.main.model.Train;

@Repository
public interface SearchTrainRepository extends MongoRepository<Train,Integer>{
	
	
	List<Train> getAllTrainByData(@Param("trainFrom") String trainFrom,@Param("trainTo") String trainTo);
	


}
