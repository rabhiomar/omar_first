package com.example.demo.models;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class consultation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cons_id;
	private Date cons_date;
	private String pat_nom;
	private String pat_pren;

}
