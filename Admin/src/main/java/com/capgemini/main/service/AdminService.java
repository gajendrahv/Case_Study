package com.capgemini.main.service;

import java.util.List;

import com.capgemini.main.model.Train;

public interface AdminService {
	
	public Train addTrain(Train train);
	
	public Train updateTrain(int trainId,Train train);
	
	public List<Train> getAllTrains();
	
	public String deleteTrain(int trainId);

}
