package com.residencia.biblioteca.controllers;

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
import org.springframework.web.bind.annotation.RestController;

import com.residencia.biblioteca.entities.Editora;
import com.residencia.biblioteca.services.EditoraService;

@RestController
@RequestMapping("/editora")
public class EditoraController {
	@Autowired
	EditoraService editoraService; 
	
	@GetMapping
	public ResponseEntity<List<Editora>> listarEditoras(){
		return new ResponseEntity<> (editoraService.listarEditoras(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Editora> buscarEditoraPorId(@PathVariable Integer id) {
		Editora editora = editoraService.buscarEditoraPorId(id);
		if (editora == null)
		return new ResponseEntity<> (editora, HttpStatus.NOT_FOUND);
		
		else
			return new ResponseEntity<> (editora,HttpStatus.OK);
		
	}
	@PostMapping
	public ResponseEntity<Editora> salvar(@RequestBody Editora Editora) {
		return new ResponseEntity<> (editoraService.salvarEditora(Editora), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Editora> atualizar(@RequestBody Editora Editora) {
		return new ResponseEntity<> (editoraService.atualizarEditora(Editora), HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deletarEditora(@RequestBody Editora Editora) {
		editoraService.deletarEditora(Editora);
		return new ResponseEntity<> ("Deletado com Sucesso", HttpStatus.OK);
		
	}

}
