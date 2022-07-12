package com.capgemini.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.model.Train;
import com.capgemini.main.repository.AdminRepository;
import com.capgemini.main.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository adminRepository;

	@Override
	public Train addTrain(Train train) {
		
		return adminRepository.save(train);
	}

	@Override
	public Train updateTrain(int trainId, Train train) {
		Optional<Train> findById = adminRepository.findById(trainId);
		if(findById.isPresent()) {
			Train trainModel = findById.get();
			if(train.getTrainName()!=null && !train.getTrainName().isEmpty())
				trainModel.setTrainName(train.getTrainName());
			if(train.getTrainFrom()!=null && !train.getTrainFrom().isEmpty())
				trainModel.setTrainFrom(train.getTrainFrom());
			if(train.getTrainTo()!=null && !train.getTrainTo().isEmpty())
				trainModel.setTrainTo(train.getTrainTo());
			if(train.getArrivesAtTime()!=null && !train.getArrivesAtTime().isEmpty())
				trainModel.setArrivesAtTime(train.getArrivesAtTime());
			if(train.getReachesAtTime()!=null && !train.getReachesAtTime().isEmpty())
				trainModel.setReachesAtTime(train.getReachesAtTime());
			return adminRepository.save(trainModel);
		}
		return null;
	}

	@Override
	public List<Train> getAllTrains() {
		
		return adminRepository.findAll();
	}

	@Override
	public String deleteTrain(int trainId) {
		adminRepository.deleteById(trainId);
		return "deleted successfully";
	}
	
	

}
