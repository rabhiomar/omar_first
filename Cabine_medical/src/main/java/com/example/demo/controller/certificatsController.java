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

import com.example.demo.models.certificats;
import com.example.demo.models.consultation;
import com.example.demo.services.certificatsservices;
import com.example.demo.services.consultationservices;

@Controller
public class certificatsController {

	@Autowired 
	private certificatsservices certificatsService;

	//Get All consultation
	@GetMapping("certificats")
	public String findAll(Model model){		
	model.addAttribute("certificats", certificatsService.findAll());
	return "certificats";
			}



	@RequestMapping("certificats/findById") 
	@ResponseBody
	public Optional<certificats> findById(Integer id)
	{
		return certificatsService.findById(id);
	}

	//Add consultation
	@PostMapping(value="certificats/addNew")
	public String addNew(certificats consultation) {
		certificatsService.save(consultation);
		return "redirect:/certificats";
	}	

	@RequestMapping(value="certificats/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(certificats consultation) {
		certificatsService.save(consultation);
		return "redirect:/certificats";
	}

	@RequestMapping(value="certificats/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		certificatsService.deletee(id);
		return "redirect:/certificats";
	}




	}


