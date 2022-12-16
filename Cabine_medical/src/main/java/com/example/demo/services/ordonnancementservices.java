package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.models.ordonnancement;
import com.example.demo.repositories.ordonnancementRepository;

@Service
public class ordonnancementservices {

	@Autowired
	private ordonnancementRepository repo;
	
	//Get All ordonnancement
		public List<ordonnancement> findAll(){
			return repo.findAll();
		}	
		
		//Get ordonnancement By Id
		public Optional<ordonnancement> findById(int id) {
			return repo.findById(id);
		}	
		
		//Delete ordonnancement
		public void deletee(int id) {
			repo.deleteById(id);
		}
		
		//Update ordonnancement
		public void save( ordonnancement ordonnancement) {
			repo.save(ordonnancement);
		}

		public String Laste() {	
	        return repo.Last();
			}
}



