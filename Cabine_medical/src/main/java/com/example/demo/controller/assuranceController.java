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

import com.example.demo.models.assurance;
import com.example.demo.services.assuranceservice;


@Controller
public class assuranceController {
	
	@Autowired 
	private assuranceservice assuranceService;

	//Get All consultation
	@GetMapping("assurance")
	public String findAll(Model model){		
	model.addAttribute("assurance", assuranceService.findAll());
	return "assurance";
			}
	



	@RequestMapping("assurance/findById") 
	@ResponseBody
	public Optional<assurance> findById(Integer id)
	{
		return assuranceService.findById(id);
	}
	

	//Add consultation
	@PostMapping(value="assurance/addNew")
	public String addNew(assurance consultation) {
		assuranceService.save(consultation);
		return "redirect:/assurance";
	}
	

	@RequestMapping(value="assurance/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(assurance consultation) {
		assuranceService.save(consultation);
		return "redirect:/assurance";
	}
	

	@RequestMapping(value="assurance/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		assuranceService.deletee(id);
		return "redirect:/assurance";
	}


	}




