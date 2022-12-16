package com.example.demo.repositories;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.patient;


@Repository
public interface patientRipository extends JpaRepository<patient, Integer> {
	 
     

	
	@Query("SELECT COUNT(*) FROM patient a WHERE Dat_pat=?1 ")
	public String LastPiste(String date);
	
	@Query("SELECT a FROM patient a  WHERE a.num_pat=?1 ")
	public patient findbyidd(Integer id);
	
	@Query("SELECT a FROM patient a  WHERE a.num_pat=?1 ")
	public patient update(Integer id);
	
	@Query(" select a from patient a  order by a.nom_pat asc ")
	public List<patient> rrr(PageRequest pageRequest);
	
	@Query(" select a from patient a  order by a.num_pat asc ")
	public List<patient> selectbynum(PageRequest pageRequest);
	
	
	
}
