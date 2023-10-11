package com.residencia.biblioteca.controllers; // Define o pacote ao qual esta classe pertence

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.residencia.biblioteca.entities.Aluno;
import com.residencia.biblioteca.services.AlunoService;

@RestController // Marca esta classe como um controlador do Spring MVC
@RequestMapping("/alunos") // Mapeia a rota base para todas as rotas nesta classe
public class AlunoController {
	
	@Autowired // Injeta automaticamente uma instância do AlunoService
	AlunoService alunoService; 
	
	@GetMapping // Rota para a operação de listagem de alunos
	public ResponseEntity<List<Aluno>> listarAlunos(){
		return new ResponseEntity<> (alunoService.listarAlunos(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}") // Rota para a operação de busca de aluno por ID
	public ResponseEntity<Aluno> buscarPorId(@PathVariable Integer id) {
		Aluno aluno = alunoService.buscarAlunoPorId(id);
		if(aluno == null)
		
		return new ResponseEntity<> (aluno,HttpStatus.NOT_FOUND);
		
		else 
			return new ResponseEntity<> (aluno,HttpStatus.OK);
		}
	
	@GetMapping("/porid") // Rota para a operação de busca de aluno por ID usando um parâmetro de requisição
	public ResponseEntity<Aluno> buscarAlunoPorId(@RequestParam Integer id) {
		return new ResponseEntity<> (alunoService.buscarAlunoPorId(id), HttpStatus.OK);
		
	}
	@PostMapping // Rota para a operação de criação de um novo aluno
	public ResponseEntity<Aluno> salvar(@RequestBody Aluno aluno) {
		return new ResponseEntity<> (alunoService.salvarAluno(aluno), HttpStatus.CREATED);
	}
	
	@PutMapping // Rota para a operação de atualização de um aluno existente
	public ResponseEntity<Aluno> atualizar(@RequestBody Aluno aluno) {
		return new ResponseEntity<> (alunoService.atualizarAluno(aluno), HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deletarLivro(@RequestBody Aluno aluno) {
		if(alunoService.deletarAluno(aluno))
			return new 
					ResponseEntity<>("{\"msg\":\"Deletado com Sucesso\"}", 
							HttpStatus.OK);
		else 
			return new 
					ResponseEntity<>("{\"msg\":\"Não foi possível deletar\"}", 
							HttpStatus.BAD_REQUEST);		
	}
}
