package com.residencia.biblioteca.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity 
@Table(name = "editora") 
public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "codigoEditora") 
	private Integer codigoEditora;

	@Column(name = "nome")
	private String nome;

	@Column(name = "imagenome")
	private String imageNome;

	@Column(name = "imagefilename")
	private String imageFileName;

	@Column(name = "imageurl")
	private String imageUrl;

	@OneToMany(mappedBy = "editora") 
	private List<Livro> livro;

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}

	public Integer getCodigoEditora() {
		return codigoEditora;
	}

	public void setCodigoEditora(Integer codigoEditora) {
		this.codigoEditora = codigoEditora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImageNome() {
		return imageNome;
	}

	public void setImageNome(String imageNome) {
		this.imageNome = imageNome;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}