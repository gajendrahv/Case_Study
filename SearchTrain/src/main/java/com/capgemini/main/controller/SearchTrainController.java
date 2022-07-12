package com.capgemini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.model.Train;
import com.capgemini.main.repository.SearchTrainRepository;

@RestController
@RequestMapping("/search")
public class SearchTrainController {
	
	@Autowired
	SearchTrainRepository searchTrainRepo;
	
	@GetMapping("/train/{trainFrom}/{trainTo}")
	public List<Train> getAllTrainByData(@RequestBody Train train,@PathVariable("trainFrom") String trainFrom,
			@PathVariable("trainTo") String trainTo){
				
		return searchTrainRepo.getAllTrainByData(trainFrom, trainTo);
		
	}

}
