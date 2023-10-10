package com.residencia.biblioteca.entities; // Define o pacote ao qual esta classe pertence

import java.math.BigDecimal; // Importa classes necessárias
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@JsonIdentityInfo( // Configuração para serialização JSON
    generator = ObjectIdGenerators.PropertyGenerator.class, // Usa um gerador de identidade baseado em propriedade
    property = "codigoEmprestimo" // Propriedade usada como identificador
)
@Entity // Anotação para informar que esta classe é uma entidade no banco de dados
@Table(name = "emprestimo") // Especifica o nome da tabela correspondente no banco de dados
public class Emprestimo {
	@Id // Anotação para indicar que este campo é a chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática do valor da chave primária
	@Column(name = "codigoemprestimo") // Nome da coluna correspondente no banco de dados
	private Integer codigoEmprestimo;
	
	@ManyToOne // Relacionamento muitos-para-um com a entidade Aluno
	@JoinColumn(name = "numeromatriculaaluno", referencedColumnName = "numeromatriculaaluno")
	private Aluno aluno;

	@ManyToOne  // Relacionamento muitos-para-um com a entidade Livro
	@JoinColumn(name = "codigolivro", referencedColumnName = "codigolivro")
	private Livro livro;

	@Column(name = "dataemprestimo") // Campo de data do empréstimo
	private Date dataEmprestimo;

	@Column(name = "dataentrega")
	private Date dataEntrega;

	@Column(name = "valoremprestimo")
	private BigDecimal valorEmprestimo;

	public Integer getCodigoEmprestimo() {
		return codigoEmprestimo;
	}

	public void setCodigoEmprestimo(Integer codigoEmprestimo) {
		this.codigoEmprestimo = codigoEmprestimo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public BigDecimal getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(BigDecimal valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
