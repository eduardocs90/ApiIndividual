package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.entities.Livro;
import com.residencia.biblioteca.repositories.LivroRepository;
@Service
public class LivroService {

	// Crud
	//metodo para recuperar todos os 
	//recuperar aluno pela chave ptrimaria
	// salvar um novo aluno
	//atualizar um aluno
	//deletar um aluno

		@Autowired // implenta tecnica de injeção de dependencia
		LivroRepository livroRep;

		public List<Livro> listarLivros() {
			return livroRep.findAll();
		}

		public Livro buscarLivroPorId(Integer id) {
			return livroRep.findById(id).orElse(null); // metodo que busca um objeto pelo id
		}

		public Livro salvarLivro(Livro livro) {
			return livroRep.save(livro);
		}

		public Livro atualizarLivro(Livro livro) {
			return livroRep.save(livro);
		}

		public void deletarLivro(Livro livro) {
			livroRep.delete(livro);

		}

}
