package com.example.demo.models;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num_pat;
	public patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	private String nom_pat;
	private String pren_pat;
	private String Dat_pat;
	private String sex_pat;
	private String adr_pat;
	private String numtel_pat;
	private  String mail_pat;
	

	 
	
	
	
	public patient(int num_pat, String nom_pat, String pren_pat, String dat_pat, String sex_pat, String adr_pat,
			String numtel_pat, String mail_pat) {
		super();
		this.num_pat = num_pat;
		this.nom_pat = nom_pat;
		this.pren_pat = pren_pat;
		Dat_pat = dat_pat;
		this.sex_pat = sex_pat;
		this.adr_pat = adr_pat;
		this.numtel_pat = numtel_pat;
		this.mail_pat = mail_pat;
	}
	public int getNum_pat() {
		return num_pat;
	}
	public void setNum_pat(int num_pat) {
		this.num_pat = num_pat;
	}
	public String getNom_pat() {
		return nom_pat;
	}
	public void setNom_pat(String nom_pat) {
		this.nom_pat = nom_pat;
	}
	public String getPren_pat() {
		return pren_pat;
	}
	public void setPren_pat(String pren_pat) {
		this.pren_pat = pren_pat;
	}
	public String getDat_pat() {
		return Dat_pat;
	}
	public void setDat_pat(String dat_pat) {
		Dat_pat = dat_pat;
	}
	public String getSex_pat() {
		return sex_pat;
	}
	public void setSex_pat(String sex_pat) {
		this.sex_pat = sex_pat;
	}
	public String getAdr_pat() {
		return adr_pat;
	}
	public void setAdr_pat(String adr_pat) {
		this.adr_pat = adr_pat;
	}
	public String getNumtel_pat() {
		return numtel_pat;
	}
	public void setNumtel_pat(String numtel_pat) {
		this.numtel_pat = numtel_pat;
	}
	public String getMail_pat() {
		return mail_pat;
	}
	public void setMail_pat(String mail_pat) {
		this.mail_pat = mail_pat;
	}
	
	
	
	
	
}