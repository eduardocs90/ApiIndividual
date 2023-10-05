package com.residencia.biblioteca.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity // obrigatório na criação de entidades
@Table(name = "livro") // para identificar a qual tabela essa classe se refere la no banco de dados (é
						// opcional)
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // é usado pra gerar um valor automatico
	@Column(name = "codigolivro") // essa anotação (@) se refere a qual esse atributo se refere a uma coluna no
									// banco
	private Integer codigoLivro;

	@ManyToOne // cardinalidade entre emprestimo e aluno
	@JoinColumn(name = "codigoeditora", referencedColumnName = "codigoeditora")
	private Editora editora;

	@ManyToMany(mappedBy = "livro")
	private List<Emprestimo> emprestimo;


	@Column(name = "nomelivro")
	private String nomeLivro;

	@Column(name = "nomeautor")
	private String nomeAutor;

	@Column(name = "datadelancamento")
	private Date dataDeLancamento;

	@Column(name = "codigoisbn")
	private Integer codigoIsbn;

	public Integer getCodigoLivro() {
		return codigoLivro;
	}
	public List<Emprestimo> getEmprestimo() {
		return emprestimo;
	}
	
	public void setEmprestimo(List<Emprestimo> emprestimo) {
		this.emprestimo = emprestimo;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Date getDataDeLancamento() {
		return dataDeLancamento;
	}

	public void setDataDeLancamento(Date dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}

	public Integer getDcodigoIsbn() {
		return codigoIsbn;
	}

	public void setDcodigoIsbn(Integer dcodigoIsbn) {
		this.codigoIsbn = dcodigoIsbn;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Integer getCodigoIsbn() {
		return codigoIsbn;
	}

	public void setCodigoIsbn(Integer codigoIsbn) {
		this.codigoIsbn = codigoIsbn;
	}

	public void setCodigoLivro(Integer codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

}