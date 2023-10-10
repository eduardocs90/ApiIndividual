package com.residencia.biblioteca.entities;

import java.util.Date;
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

@JsonIdentityInfo( // Configuração para serialização JSON
    generator = ObjectIdGenerators.PropertyGenerator.class, // Usa um gerador de identidade baseado em propriedade
    property = "numeroMatriculaAluno" // Propriedade usada como identificador
)
@Entity // Define que essa classe é uma entidade JPA (representa uma tabela no banco de dados)
@Table(name = "aluno") // Especifica o nome da tabela no banco de dados
public class Aluno {

    @Id // Define que o campo abaixo é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia (Serial) de geração de valores para a chave primária (neste caso, auto-incremento)
    @Column(name = "numeromatriculaaluno") // Especifica o nome da coluna no banco de dados
    private Integer numeroMatriculaAluno; // Declaração de um campo para armazenar o número de matrícula do aluno

    @Column(name = "nome") // Especifica o nome da coluna no banco de dados
    private String nome; // Declaração de um campo para armazenar o nome do aluno

    @Column(name = "datanascimento") 
    private Date dataNascimento; 
    @Column(name = "cpf") 
    private String cpf; 

    @Column(name = "logradouro")
    private String logradouro; 

    @Column(name = "numerologradouro") 
    private String NumeroLogradouro; 

    @Column(name = "complemento") 
    private String complemento; 

    @Column(name = "bairro") 
    private String bairro; 

    @Column(name = "cidade") 
    private String cidade; 
    
    @OneToMany(mappedBy = "aluno") // Define uma relação de um-para-muitos com a entidade Emprestimo, onde esta é a entidade proprietária
    private List<Emprestimo> emprestimos; // Declaração de uma lista para armazenar os empréstimos associados a este aluno

	public Integer getNumeroMatriculaAluno() {
		return numeroMatriculaAluno;
	}

	public void setNumeroMatriculaAluno(Integer numeroMatriculaAluno) {
		this.numeroMatriculaAluno = numeroMatriculaAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumeroLogradouro() {
		return NumeroLogradouro;
	}

	public void setNumeroLogradouro(String numeroLogradouro) {
		NumeroLogradouro = numeroLogradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

}
