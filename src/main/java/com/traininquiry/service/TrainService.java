package com.traininquiry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traininquiry.entity.Train;
import com.traininquiry.repository.TrainRepositoty;

@Service
public class TrainService {

	@Autowired
	TrainRepositoty trainRepositoty;

	public Train createTrain(Train train) {
	
		return trainRepositoty.save(train);
		
	}
	
	public List<Train> getAllTrains() {
		
		return trainRepositoty.findAll();
		
	}
	
}
