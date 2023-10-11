package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.residencia.biblioteca.entities.Autor;
import com.residencia.biblioteca.repositories.AutorRepository;

@Service
public class AutorService {

	AutorRepository autorRep;
	
	public List<Autor> listarAutores() {
		return autorRep.findAll();
	}

	public Autor buscarAutorPorId(Integer id) {
		return autorRep.findById(id).orElse(null); // metodo que busca um objeto pelo id
	}

	public Autor salvarAutor(Autor autor) {
		return autorRep.save(autor);
	}

	public Autor atualizarAutor(Autor autor) {
		return autorRep.save(autor);
	}

	public Boolean deletarAutor(Autor autor) {
		if(autor == null)
			return false;
		
		Autor AutorExistente = buscarAutorPorId(autor.getCodigoAutor());
		
		if(AutorExistente == null)
			return false;
		
		autorRep.delete(autor);
		
		Autor AutorContinuaExistindo = 
				buscarAutorPorId(autor.getCodigoAutor());
		
		if(AutorContinuaExistindo == null)
			return true;

		return false;	
	}


}
