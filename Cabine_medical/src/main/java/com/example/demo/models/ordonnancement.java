package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ordonnancement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ordon_id;
	public ordonnancement() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Date ordon_date;
	private String nom_medcin;
	private String pat_nom;
	private String pat_pren;
	public ordonnancement(Integer ordon_id, Date ordon_date, String nom_medcin, String pat_nom, String pat_pren) {
		super();
		this.ordon_id = ordon_id;
		this.ordon_date = ordon_date;
		this.nom_medcin = nom_medcin;
		this.pat_nom = pat_nom;
		this.pat_pren = pat_pren;
	}
	public Integer getOrdon_id() {
		return ordon_id;
	}
	public void setOrdon_id(Integer ordon_id) {
		this.ordon_id = ordon_id;
	}
	public Date getOrdon_date() {
		return ordon_date;
	}
	public void setOrdon_date(Date ordon_date) {
		this.ordon_date = ordon_date;
	}
	public String getNom_medcin() {
		return nom_medcin;
	}
	public void setNom_medcin(String nom_medcin) {
		this.nom_medcin = nom_medcin;
	}
	public String getPat_nom() {
		return pat_nom;
	}
	public void setPat_nom(String pat_nom) {
		this.pat_nom = pat_nom;
	}
	public String getPat_pren() {
		return pat_pren;
	}
	public void setPat_pren(String pat_pren) {
		this.pat_pren = pat_pren;
	}
	

}
