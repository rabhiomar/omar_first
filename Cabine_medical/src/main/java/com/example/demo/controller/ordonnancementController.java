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

import com.example.demo.models.ordonnancement;
import com.example.demo.models.patient;
import com.example.demo.services.ordonnancementservices;
import com.example.demo.services.patientservices;

@Controller
public class ordonnancementController {
	
	@Autowired 
	private ordonnancementservices ordonnancementService;

	//Get All patient
	@GetMapping("ordonnancementService")
	public String findAll(Model model){		
	model.addAttribute("patient", ordonnancementService.findAll());
	return "ordonnancementService";
			}

	@RequestMapping("ordonnancementService/findById") 
	@ResponseBody
	public Optional<ordonnancement> findById(Integer id)
	{
		return ordonnancementService.findById(id);
	}

	//Add patient
	@PostMapping(value="ordonnancementService/addNew")
	public String addNew(ordonnancement ordonnancement) {
		ordonnancementService.save(ordonnancement);
		return "redirect:/ordonnancementService";
	}	

	@RequestMapping(value="ordonnancement/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(ordonnancement ordonnancement) {
		ordonnancementService.save(ordonnancement);
		return "redirect:/patient";
	}

	@RequestMapping(value="ordonnancement/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		ordonnancementService.deletee(id);
		return "redirect:/ordonnancement";
	}

	}

