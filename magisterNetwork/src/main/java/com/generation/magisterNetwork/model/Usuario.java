package com.generation.magisterNetwork.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String senha;
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String usuario;
	
	private String foto;
	
	private String tipo;
	
	private String profissao;
	
	private String fotoCapa;
	
	@OneToMany(mappedBy = "usuario",cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;
	
	@OneToMany(mappedBy = "usuario",cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Comentario> comentario;
	
	
	
	public String getProfissao() {
		return profissao;
	}
	
	public String getFotoCapa() {
		return fotoCapa;
	}

	public void setFotoCapa(String fotoCapa) {
		this.fotoCapa = fotoCapa;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}

	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}
	
	
	
}
