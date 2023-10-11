package com.residencia.biblioteca.services; // Define o pacote ao qual esta classe pertence

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.entities.Aluno;
import com.residencia.biblioteca.repositories.AlunoRepository;

@Service // Indica que esta classe é um serviço gerenciado pelo Spring
public class AlunoService {

	@Autowired // Injeção de dependência: o Spring injeta automaticamente uma instância do
				// AlunoRepository
	AlunoRepository alunoRep;

	public List<Aluno> listarAlunos() {
		return alunoRep.findAll(); // Retorna todos os alunos do repositório
	}

	public Aluno buscarAlunoPorId(Integer id) {
		return alunoRep.findById(id).orElse(null); // Busca um aluno pelo ID, se não encontrar, retorna null
	}

	public Aluno salvarAluno(Aluno aluno) {
		return alunoRep.save(aluno); // Salva um novo aluno no repositório
	}

	public Aluno atualizarAluno(Aluno aluno) {
		return alunoRep.save(aluno); // Atualiza um aluno existente no repositório
	}

	public Boolean deletarAluno(Aluno aluno) {
		if (aluno == null) 
			return false;
		
		Aluno alunoExistente = buscarAlunoPorId(aluno.getNumeroMatriculaAluno());
		if (alunoExistente == null) 
			return false;
		
		alunoRep.delete(aluno); // Deleta um aluno do repositório

		Aluno alunoContinuaExistindo = buscarAlunoPorId(aluno.getNumeroMatriculaAluno());
		if (alunoContinuaExistindo == null) 
			return true;
		
		return false;
	}
	

}
