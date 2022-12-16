package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ordonnancement;

@Repository
public interface ordonnancementRepository extends JpaRepository<ordonnancement, Integer> {
	@Query("SELECT COUNT(*) FROM ordonnancement ")
	public String Last();
}
