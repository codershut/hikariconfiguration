package com.hikaricpconfiguration.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hikaricpconfiguration.model.EmdModel;
import com.hikaricpconfiguration.service.HikariRepo;

@RestController
public class TestingHikariController {
	public static final Logger log = LogManager.getLogger(TestingHikariController.class);
	
	@Autowired
	HikariRepo hikariRepo;
	
	@PostMapping("/postData")
	public void postDataHikari(@RequestBody EmdModel emdModel) {
		try {
			System.err.println("Received Request"+emdModel);
			hikariRepo.save(emdModel);
			log.info("Data Saved {}",emdModel);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		
	}
}
