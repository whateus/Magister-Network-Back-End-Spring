package com.generation.magisterNetwork.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.magisterNetwork.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	
	public List<Tema>findAllByDisciplinaTemaContainingIgnoreCase(String disciplinaTema);

}
