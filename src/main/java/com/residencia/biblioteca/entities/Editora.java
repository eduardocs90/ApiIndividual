package com.residencia.biblioteca.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity // obrigatório na criação de entidades
@Table(name = "editora") // para identificar a qual tabela essa classe se refere la no banco de dados (é
							// opcional)
public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // é usado pra gerar um valor automatico
	@Column(name = "codigoEditora") // essa anotação (@) se refere a qual esse atributo se refere a uma coluna no
									// banco
	private Integer codigoEditora;

	@Column(name = "nome")
	private String nome;

	@Column(name = "imagenome")
	private String imageNome;

	@Column(name = "imagefilename")
	private String imageFileName;

	@Column(name = "imageurl")
	private String imageUrl;

	@OneToMany(mappedBy = "editora") // cardinalidade da lista
	private List<Emprestimo> livro;

	public List<Emprestimo> getLivro() {
		return livro;
	}

	public void setLivro(List<Emprestimo> livro) {
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