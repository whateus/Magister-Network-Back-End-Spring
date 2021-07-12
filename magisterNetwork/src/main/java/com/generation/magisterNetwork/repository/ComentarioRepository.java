package com.generation.magisterNetwork.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.magisterNetwork.model.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long>{
	
	public List<Comentario>findAllByComentarioContainingIgnoreCase(String comentario);

}
