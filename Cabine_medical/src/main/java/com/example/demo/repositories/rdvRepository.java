package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.models.rdv;

@Repository
public interface rdvRepository extends JpaRepository<rdv, Integer>{
	
	
	@Query("SELECT COUNT(*) FROM rdv a where rdv_date=?1  and traite=0")
	public String listepanding(String date);
	
	
	@Query("SELECT COUNT(*) FROM rdv a where rdv_date=?1  and traite=1")
	public String listevisite(String date);
	
	

}
