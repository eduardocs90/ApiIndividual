package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.entities.Aluno;
import com.residencia.biblioteca.repositories.AlunoRepository;

@Service
public class AlunoService {
// Crud
//metodo para recuperar todos os 
//recuperar aluno pela chave ptrimaria
// salvar um novo aluno
//atualizar um aluno
//deletar um aluno

	@Autowired // implenta tecnica de injeção de dependencia
	AlunoRepository alunoRep;

	public List<Aluno> listarAlunos() {
		return alunoRep.findAll();
	}

	public Aluno buscarAlunoPorId(Integer id) {
		return alunoRep.findById(id).get(); // metodo que busca um objeto pelo id
	}

	public Aluno salvarAluno(Aluno aluno) {
		return alunoRep.save(aluno);
	}

	public Aluno atualizarAluno(Aluno aluno) {
		return alunoRep.save(aluno);
	}

	public void deletarAluno(Aluno aluno) {
		alunoRep.delete(aluno);

	}
}
