package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class certificats {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer num_certif;
	public certificats() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Date date_certif;
	private String com_certif;
	private Integer jour_nom;
	public certificats(Integer num_certif, Date date_certif, String com_certif, Integer jour_nom) {
		super();
		this.num_certif = num_certif;
		this.date_certif = date_certif;
		this.com_certif = com_certif;
		this.jour_nom = jour_nom;
	}
	public Integer getNum_certif() {
		return num_certif;
	}
	public void setNum_certif(Integer num_certif) {
		this.num_certif = num_certif;
	}
	public Date getDate_certif() {
		return date_certif;
	}
	public void setDate_certif(Date date_certif) {
		this.date_certif = date_certif;
	}
	public String getCom_certif() {
		return com_certif;
	}
	public void setCom_certif(String com_certif) {
		this.com_certif = com_certif;
	}
	public Integer getJour_nom() {
		return jour_nom;
	}
	public void setJour_nom(Integer jour_nom) {
		this.jour_nom = jour_nom;
	}
	
	
	
	
}
