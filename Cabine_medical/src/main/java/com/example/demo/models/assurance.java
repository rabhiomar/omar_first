package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class assurance {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer assur_id;
	private String assur_type;
	private String assur_datevali;
	
	
	public assurance() {
		super();
		// TODO Auto-generated constructor stub
	}


	public assurance(Integer assur_id, String assur_type, String assur_datevali) {
		super();
		this.assur_id = assur_id;
		this.assur_type = assur_type;
		this.assur_datevali = assur_datevali;
	}


	public Integer getAssur_id() {
		return assur_id;
	}


	public void setAssur_id(Integer assur_id) {
		this.assur_id = assur_id;
	}


	public String getAssur_type() {
		return assur_type;
	}


	public void setAssur_type(String assur_type) {
		this.assur_type = assur_type;
	}


	public String getAssur_datevali() {
		return assur_datevali;
	}


	public void setAssur_datevali(String assur_datevali) {
		this.assur_datevali = assur_datevali;
	}
	
	
	

}
