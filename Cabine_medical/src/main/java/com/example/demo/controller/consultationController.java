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

import com.example.demo.models.consultation;

import com.example.demo.services.consultationservices;


@Controller
public class consultationController {

	@Autowired 
	private consultationservices consultationService;

	//Get All consultation
	@GetMapping("consultation")
	public String findAll(Model model){		
	model.addAttribute("consultation", consultationService.findAll());
	return "consultation";
			}



	@RequestMapping("consultation/findById") 
	@ResponseBody
	public Optional<consultation> findById(Integer id)
	{
		return consultationService.findById(id);
	}

	//Add consultation
	@PostMapping(value="consultation/addNew")
	public String addNew(consultation consultation) {
		consultationService.save(consultation);
		return "redirect:/consultation";
	}	

	@RequestMapping(value="consultation/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(consultation consultation) {
		consultationService.save(consultation);
		return "redirect:/consultation";
	}

	@RequestMapping(value="consultation/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		consultationService.deletee(id);
		return "redirect:/consultation";
	}




	}

