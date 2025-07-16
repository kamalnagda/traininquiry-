package com.traininquiry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traininquiry.entity.Train;
import com.traininquiry.service.TrainService;

@RestController
public class HomeController {

	@Autowired
	TrainService trainService ;
	
	@RequestMapping("/message")
	public String message() {
		
		return "working";
	}
	
	@RequestMapping("/add-train")
	public Train addTrain() {
		
		Train train = new Train();
		train.setId(1);
		train.setName("jodhpur indore");
		return trainService.createTrain(train);
	}
	
	@RequestMapping("/getList")
	public List<Train>  getAllTrain() {
		
		return trainService.getAllTrains();
	}
}
