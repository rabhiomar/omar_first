package com.example.demo;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.services.ordonnancementservices;
import com.example.demo.services.patientservices;
import com.example.demo.services.rdvservices;



@Controller
public class ApplicationCotroller {
	
	
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
	@GetMapping("/index")
	 public String  getapp(Model model) {
		model.addAttribute("patient", patientService.findAll());
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		String panding = ordsev.Laste();
		

		 return "index";
	 }
	@GetMapping("/indexx")
	 public String  getappp(Model model) {
		model.addAttribute("patient", patientService.findAll());
		
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		
	    String panding = rdvservice.listpanding(a);	
		model.addAttribute("panding", panding);
		
		String visit = rdvservice.listvisite(a);
		model.addAttribute("visit", visit);
		 return "indexx";
		 
		 
		 
		 
	 }
	
	
	@GetMapping("/i")
	public String get() {
		
	return "ful/index";
	}
	
	
	@RequestMapping(value="/jsoncalendar", method=RequestMethod.GET) 
	public ModelAndView jsoncalendar() {
		return new ModelAndView("jsoncalendar");
	}
	
	@GetMapping("/doctor-schedule")
	 public String  getdoctorschedule(Model model) {

		model.addAttribute("patient", patientService.findAll());
		
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		
	    String panding = rdvservice.listpanding(a);	
		model.addAttribute("panding", panding);
		
		String visit = rdvservice.listvisite(a);
		model.addAttribute("visit", visit);
		 return "doctor-schedule";
	 }
	
	@GetMapping("/book-appointment")
	 public String  getbookappointment(Model model) {

		model.addAttribute("patient", patientService.findAll());
		
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		
	    String panding = rdvservice.listpanding(a);	
		model.addAttribute("panding", panding);
		
		String visit = rdvservice.listvisite(a);
		model.addAttribute("visit", visit);
		 return "book-appointment";
	 }
	
	
	@GetMapping("/doctors")
	 public String  getdoctors(Model model) {

		model.addAttribute("patient", patientService.findAll());
		
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		
	    String panding = rdvservice.listpanding(a);	
		model.addAttribute("panding", panding);
		
		String visit = rdvservice.listvisite(a);
		model.addAttribute("visit", visit);
		 return "doctors";
	 }
	
	
	@GetMapping("/add-doctor")
	 public String  getadddoctor(Model model) {

		model.addAttribute("patient", patientService.findAll());
		
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		
	    String panding = rdvservice.listpanding(a);	
		model.addAttribute("panding", panding);
		
		String visit = rdvservice.listvisite(a);
		model.addAttribute("visit", visit);
		 return "add-doctor";
	 }
	
	@GetMapping("/profile")
	 public String  getprofile(Model model) {

		model.addAttribute("patient", patientService.findAll());
		
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		
	    String panding = rdvservice.listpanding(a);	
		model.addAttribute("panding", panding);
		
		String visit = rdvservice.listvisite(a);
		model.addAttribute("visit", visit);
		 return "profile";
	 }
	
	@GetMapping("/login")
	public String login() {
		return"login";
	}
	
	@GetMapping("/logout")
	public String gohome() {
		return"logout";
	}
	
	
	
	
	
	@GetMapping("/patients")
	public String gopatients(Model model) {

		model.addAttribute("patient", patientService.rrr(PageRequest.of(0,1000)));
		
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		
	    String panding = rdvservice.listpanding(a);	
		model.addAttribute("panding", panding);
		
		String visit = rdvservice.listvisite(a);
		model.addAttribute("visit", visit);
		return"patients";
	}
	
	
	
	
	
	@GetMapping("/add-patient")
	public String goaddpatients(Model model) {
model.addAttribute("patient", patientService.findAll());
		
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		
	    String panding = rdvservice.listpanding(a);	
		model.addAttribute("panding", panding);
		
		String visit = rdvservice.listvisite(a);
		model.addAttribute("visit", visit);
		return"add-patient";
	}
	
	
	
	
	
	@GetMapping("/patient-profile")
	public String gopatientprofile(Model model) {
model.addAttribute("patient", patientService.findAll());
		
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		
	    String panding = rdvservice.listpanding(a);	
		model.addAttribute("panding", panding);
		
		String visit = rdvservice.listvisite(a);
		model.addAttribute("visit", visit);
		return"patient-profile";
	}
	
	
	
	
	@GetMapping("/patient-invoice")
	public String gopatientinvoice(Model model) {

		model.addAttribute("patient", patientService.findAll());
		
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		
	    String panding = rdvservice.listpanding(a);	
		model.addAttribute("panding", panding);
		
		String visit = rdvservice.listvisite(a);
		model.addAttribute("visit", visit);
		return"patient-invoice";
	}
	
	
	
	
	@GetMapping("/payments")
	public String gopayments() {
		return"payments";
	}

	
	
	
	
	@GetMapping("/add-payments")
	public String goaddpayments() {
		return"add-payments";
	}
	
	
	
	
	@GetMapping("/mail-inbox")
	public String gomailinbox() {
		return"mail-inbox";
	}
	
	
	
	
	@GetMapping("/reports")
	public String goreports(Model model) {
model.addAttribute("patient", patientService.findAll());
		
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		
	    String panding = rdvservice.listpanding(a);	
		model.addAttribute("panding", panding);
		
		String visit = rdvservice.listvisite(a);
		model.addAttribute("visit", visit);
		return"reports";
	}
	
	
	
	
	@GetMapping("/widgets")
	public String gowidgets(Model model) {
model.addAttribute("patient", patientService.findAll());
		
		String count=  patientService.LastPiste(a);
		model.addAttribute("count", count);
		
	    String panding = rdvservice.listpanding(a);	
		model.addAttribute("panding", panding);
		
		String visit = rdvservice.listvisite(a);
		model.addAttribute("visit", visit);
		
		return"widgets";
	}
	
	
	
	
	
	
	
	
	
}
