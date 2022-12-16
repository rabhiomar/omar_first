package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.models.patient;
import com.example.demo.models.rdv;
import com.example.demo.services.patientservices;
import com.example.demo.services.rdvservices;


@Controller
public class rdvController {
	
	@Autowired 
	private rdvservices rdvService;
	@Autowired 
	private patientservices patientService;

		
		//Get All rdv
	@GetMapping("rdv")
	public String findAll(Model model){		
	model.addAttribute("countries", rdvService.findAll());
	return "rdv";
			}


	@RequestMapping("rdv/findById") 
	@ResponseBody
	public Optional<rdv> findById(Integer id)
	{
		return rdvService.findById(id);
	}

	//Add rdv
	@PostMapping(value="book-appointment")
	public String addNew(rdv rdv ,Model model) {
		model.addAttribute("patient", patientService.findAll());
	
		rdvService.save(rdv);
		
		
		return "redirect:/indexx";
	}	

	@RequestMapping(value="rdv/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(rdv rdv) {
		rdvService.save(rdv);
		return "redirect:/rdv";
	}

	@RequestMapping(value="rdv/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		rdvService.deletee(id);
		return "redirect:/rdv";
	}


	}

