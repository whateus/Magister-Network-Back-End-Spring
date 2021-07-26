package com.generation.magisterNetwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.magisterNetwork.model.Comentario;
import com.generation.magisterNetwork.repository.ComentarioRepository;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/comentarios")
public class ComentarioController {
	
	@Autowired
	private ComentarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Comentario>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Comentario> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	
	@PostMapping
	public ResponseEntity<Comentario> post (@RequestBody Comentario comentario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(comentario));
	}
	
	@PutMapping
	public ResponseEntity<Comentario> put (@RequestBody Comentario comentario){
		return ResponseEntity.ok(repository.save(comentario));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	

}