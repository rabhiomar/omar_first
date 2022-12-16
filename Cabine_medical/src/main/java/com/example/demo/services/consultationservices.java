package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.consultation;
import com.example.demo.repositories.consultationRepository;

@Service
public class consultationservices {
	
	@Autowired
	private consultationRepository repo;
	
	//Get All consultation
		public List<consultation> findAll(){
			return repo.findAll();
		}	
		
		//Get consultation By Id
		public Optional<consultation> findById(int id) {
			return repo.findById(id);
		}	
		
		//Delete consultation
		public void deletee(int id) {
			repo.deleteById(id);
		}
		
		//Update consultation
		public void save( consultation consultation) {
			repo.save(consultation);
		}


}