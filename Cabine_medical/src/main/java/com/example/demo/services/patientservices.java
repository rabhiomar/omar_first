package com.example.demo.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.models.patient;
import com.example.demo.repositories.patientRipository;


@Service
public class patientservices {

	@Autowired
	private patientRipository repo;
	
	//Get All patient
		public List<patient> findAll(){
			return repo.findAll();
		}	
		
		//Get patient By Id
		public Optional<patient> findById(int id) {
			return repo.findById(id);
		}	
		
		//Delete patient
		public void deletee(int id) {
			repo.deleteById(id);
		}
		
		//Update patient
		public void save( patient patient) {
			repo.save(patient);
		}
		
		public String LastPiste(String date) {	
	        return repo.LastPiste(date);
			}

		public patient findbyidd(Integer id) {	
	        return repo.findbyidd(id);
			}

		public List<patient> rrr(PageRequest pageRequest) {	
	        return repo.rrr(pageRequest);
			}
		
		public List<patient> selectbynum(PageRequest pageRequest) {	
	        return repo.selectbynum(pageRequest);
			}
}

