package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class rdv {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_rdv;
	public rdv() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String rdv_date;
	private Integer patient_num ;
	private Integer traite=0 ;
	

	
	
	public rdv(Integer id_rdv, String rdv_date, Integer patient_num,int traite) {
		super();
		this.id_rdv = id_rdv;
		this.rdv_date = rdv_date;
		this.patient_num = patient_num;
		this.traite=0;
	}
	public Integer getTraite() {
		return traite;
	}
	public void setTraite(Integer traite) {
		this.traite = traite;
	}
	public Integer getId_rdv() {
		return id_rdv;
	}
	public void setId_rdv(Integer id_rdv) {
		this.id_rdv = id_rdv;
	}
	public String getRdv_date() {
		return rdv_date;
	}
	public void setRdv_date(String rdv_date) {
		this.rdv_date = rdv_date;
	}
	public Integer getpatient_num() {
		return patient_num;
	}
	public void setpatient_num(Integer patient_num) {
		this.patient_num = patient_num;
	}
	

}
