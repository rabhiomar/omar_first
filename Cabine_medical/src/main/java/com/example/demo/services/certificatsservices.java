package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.certificats;

import com.example.demo.repositories.certificatsRepository;


@Service
public class certificatsservices {

	@Autowired
	private certificatsRepository repo;
	
	
	//Get All assurance
		public List<certificats> findAll(){
			return repo.findAll();
		}	
		
		//Get assurance By Id
		public Optional<certificats> findById(int id) {
			return repo.findById(id);
		}	
		
		//Delete assurance
		public void deletee(int id) {
			repo.deleteById(id);
		}
		
		//Update Client
		public void save( certificats certificats) {
			repo.save(certificats);
		}


}
