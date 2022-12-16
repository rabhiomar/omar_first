package com.example.demo.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.models.patient;
import com.example.demo.services.ordonnancementservices;
import com.example.demo.services.patientservices;
import com.example.demo.services.rdvservices;

@Controller
public class patientController {
	
	@Autowired 
	private patientservices patientService;
	@Autowired 
	private rdvservices rdvservice;
	@Autowired 
	private ordonnancementservices ordsev;
	
	SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd ");
	Date date = new Date(System.currentTimeMillis());
	String a = date.toString();
	String b="2020-11-03";
	
	
	
	
	
	//Get All patient
@GetMapping("patient")
public String findAll(Model model){		
model.addAttribute("patient", patientService.rrr(PageRequest.of(0,1)));
return "patient";
}






//Add patient
@PostMapping(value="add-patient")
public String addNew(patient patient) {
	 
	String s="";
	s= patient.getNumtel_pat().toString();
	String zz=rdvservice.SendSMS("CAB_MEDICAL", s, "Bonjour "+patient.getNom_pat()+" "+patient.getPren_pat()+". Votre rendez-vous avec le Docteur Durand est ");
	System.out.println("------------------------------------------------"+zz);
	patientService.save(patient);
	return "redirect:/patients";
}	

@RequestMapping(value="patient/update", method = {RequestMethod.PUT, RequestMethod.GET})
public String update(patient patient) {
	patientService.save(patient);
	return "redirect:/patients";
}

@RequestMapping(value="patient/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
public String delete(Integer id) {
	patientService.deletee(id);
	return "redirect:/patient";
}



@GetMapping("editprofile/{id}")
	public String showOne(@PathVariable int id,Model model) {
   	
	model.addAttribute("patient", patientService.findbyidd(id));
	
	
	String count=  patientService.LastPiste(a);
	model.addAttribute("count", count);
	
    String panding = rdvservice.listpanding(a);	
	model.addAttribute("panding", panding);
	
	String visit = rdvservice.listvisite(a);
	model.addAttribute("visit", visit);
	
	    //model.addAttribute("bulkss", bulkservice.findById(1).ifPresent(o -> model.addAttribute("bulk", o)));
	    return "editprofile";
	}


@GetMapping("edite")
public String showOney() {
	


    //model.addAttribute("bulkss", bulkservice.findById(1).ifPresent(o -> model.addAttribute("bulk", o)));
    return "edite";
}

@GetMapping("editprofile")
public String showOn(Model model) {
	String count=  patientService.LastPiste(a);
	model.addAttribute("count", count);
	
    String panding = rdvservice.listpanding(a);	
	model.addAttribute("panding", panding);
	
	String visit = rdvservice.listvisite(a);
	model.addAttribute("visit", visit);
	
    return "editprofile";
}



@RequestMapping(value="edite_patient/{id}", method = {RequestMethod.PUT, RequestMethod.GET})
public String updateUser(patient p, @PathVariable int id,Model model) {

	System.out.println("********"+id);
    Optional<patient> userFromDb = patientService.findById(id);
    System.out.println("********"+userFromDb.get().getNum_pat());
    System.out.println("********"+userFromDb.get().getSex_pat());
    userFromDb.get().setAdr_pat(p.getAdr_pat());
    userFromDb.get().setDat_pat(p.getDat_pat());
    userFromDb.get().setMail_pat(p.getMail_pat());
    userFromDb.get().setNom_pat(p.getNom_pat());
    userFromDb.get().setNumtel_pat(p.getNumtel_pat());
    userFromDb.get().setPren_pat(p.getPren_pat());
    userFromDb.get().setSex_pat(p.getSex_pat());
    patientService.save(userFromDb.get());
    
    
    
    
    
    String count=  patientService.LastPiste(a);
	model.addAttribute("count", count);
	
    String panding = rdvservice.listpanding(a);	
	model.addAttribute("panding", panding);
	
	String visit = rdvservice.listvisite(a);
	model.addAttribute("visit", visit);
    
    
return "redirect:/patients";
	
}






@PutMapping("edite_patient")
public String updateStudent(@RequestParam("id") int id, patient p) {
	 System.out.println("********"+id);
    patient note = patientService.findbyidd(id);
    System.out.println("********"+p.getDat_pat().toString());
    note.setAdr_pat(p.getAdr_pat());
    
    return "patients";
}




}
