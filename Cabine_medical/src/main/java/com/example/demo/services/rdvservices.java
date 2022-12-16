package com.example.demo.services;


import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.rdv;
import com.example.demo.repositories.rdvRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.sql.ResultSet;
import java.util.Timer;





@Service
public class rdvservices {

	@Autowired
	private rdvRepository repo;
	
	
	//Get All rdv
		public List<rdv> findAll(){
			return repo.findAll();
		}	
		
		//Get ordonnancement By Id
		public Optional<rdv> findById(int id) {
			return repo.findById(id);
		}	
		
		//Delete ordonnancement
		public void deletee(int id) {
			repo.deleteById(id);
		}
		
		//Update ordonnancement
		public void save( rdv rdv) {
			repo.save(rdv);
		}
		public String listpanding(String date) {	
	        return repo.listepanding(date);
			}

		
		public String listvisite(String date) {	
	        return repo.listevisite(date);
			}
		
		
		public static String SendSMS(String sender ,String receiver, String message) {
			String s= "";
			try {
				String SendUrl = "http://192.168.1.80:8802/httpApi/httpapi_omar.jsp?sender="+ URLEncoder.encode(sender, "UTF-8")+ "&receiver="+ receiver+ "&message="+ URLEncoder.encode(message, "UTF-8")+ "&apikey=123456789";

				URL url = new URL(SendUrl);
				URLConnection connection = url.openConnection();
				connection.setDoOutput(true);
				BufferedReader in = new BufferedReader(new InputStreamReader(
						connection.getInputStream()));

				String inputLine;
				while ((inputLine = in.readLine()) != null) {
					System.out.print(inputLine); // For more traces
					s="ok";
				}
				in.close();
				//return s;
			}

			catch (Exception e) {

				e.printStackTrace();

			}
			return s;

		}
		

}
