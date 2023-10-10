package com.residencia.biblioteca.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
				property = "codigoEditora"
		)
@Entity 
@Table(name = "editora") 
public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "codigoeditora") 
	private Integer codigoEditora;

	@Column(name = "nome")
	private String nome;

	@Column(name = "imagem_nome")
	private String imagemNome;

	@Column(name = "imagem_filename")
	private String imagemFileName;

	@Column(name = "imagem_url")
	private String imagemUrl;
	
	/*@JsonManagedReference(value = "editora-livro-ref")*/
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
		return imagemNome;
	}

	public void setImageNome(String imageNome) {
		this.imagemNome = imageNome;
	}

	public String getImageFileName() {
		return imagemFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imagemFileName = imageFileName;
	}

	public String getImageUrl() {
		return imagemUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imagemUrl = imageUrl;
	}

}