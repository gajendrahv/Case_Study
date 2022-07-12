package com.capgemini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.model.Train;
import com.capgemini.main.service.AdminService;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/addTrain")
	public Train addTrain(@RequestBody Train train) {
		return adminService.addTrain(train);
		
	}
	
	@GetMapping("/getAllTrains")
	public List<Train> getAllTrains(){
		return  adminService.getAllTrains();
		
	}
	
	@PostMapping("/updateTrain/{trainId}")
	public Train updateTrain(@RequestBody Train train, @PathVariable("trainId") int trainId) {
		return  adminService.updateTrain(trainId, train);
		
	}
	
	@DeleteMapping("/deleteTrain/{trainId}")
	public String deleteTrain(@RequestBody Train train, @PathVariable("trainId") int trainId) {
		 adminService.deleteTrain(trainId);
		return "Train deleted successfully";
		
	}

}
