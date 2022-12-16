package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.models.assurance;
import com.example.demo.repositories.assuranceRepository;


@Service
public class assuranceservice {

	@Autowired
	private assuranceRepository repo;
	
	
	//Get All assurance
		public List<assurance> findAll(){
			return repo.findAll();
		}	
		
		//Get assurance By Id
		public Optional<assurance> findById(int id) {
			return repo.findById(id);
		}	
		
		//Delete assurance
		public void deletee(int id) {
			repo.deleteById(id);
		}
		
		//Update  assurance
		public void save( assurance assurance) {
			repo.save(assurance);
		}


}
