package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.entities.Emprestimo;
import com.residencia.biblioteca.repositories.EmprestimoRepository;
@Service
public class EmprestimoService {


		@Autowired // implenta tecnica de injeção de dependencia
		EmprestimoRepository emprestimoRep;

		public List<Emprestimo> listarEmprestimos() {
			return emprestimoRep.findAll();
		}

		public Emprestimo buscarEmprestimoPorId(Integer id) {
			return emprestimoRep.findById(id).orElse(null); // metodo que busca um objeto pelo id
		}

		public Emprestimo salvarEmprestimo(Emprestimo emprestimo) {
			return emprestimoRep.save(emprestimo);
		}

		public Emprestimo atualizarEmprestimo (Emprestimo emprestimo) {
			return emprestimoRep.save(emprestimo);
		}

		public void deletarEmprestimo(Emprestimo emprestimo) {
			emprestimoRep.delete(emprestimo);

		}

}
