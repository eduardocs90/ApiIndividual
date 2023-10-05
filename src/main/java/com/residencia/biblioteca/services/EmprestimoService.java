package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.residencia.biblioteca.entities.Emprestimo;
import com.residencia.biblioteca.repositories.EmprestimoRepository;

public class EmprestimoService {

	// Crud
	//metodo para recuperar todos os 
	//recuperar aluno pela chave ptrimaria
	// salvar um novo aluno
	//atualizar um aluno
	//deletar um aluno

		@Autowired // implenta tecnica de injeção de dependencia
		EmprestimoRepository emprestimoRep;

		public List<Emprestimo> listarEmprestimo() {
			return emprestimoRep.findAll();
		}

		public Emprestimo buscarEmprestimoPorId(Integer id) {
			return emprestimoRep.findById(id).get(); // metodo que busca um objeto pelo id
		}

		public Emprestimo salvarEmprestimo(Emprestimo emprestimo) {
			return emprestimoRep.save(emprestimo);
		}

		public Emprestimo atualizarEmpretimo (Emprestimo emprestimo) {
			return emprestimoRep.save(emprestimo);
		}

		public void deletarEmprestimo(Emprestimo emprestimo) {
			emprestimoRep.delete(emprestimo);

		}

}
