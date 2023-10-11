package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.entities.Editora;
import com.residencia.biblioteca.repositories.EditoraRepository;
@Service
public class EditoraService {

	// Crud
	//metodo para recuperar todos os 
	//recuperar aluno pela chave ptrimaria
	// salvar um novo aluno
	//atualizar um aluno
	//deletar um aluno

		@Autowired // implenta tecnica de injeção de dependencia
		EditoraRepository editoraRep;

		public List<Editora> listarEditoras() {
			return editoraRep.findAll();
		}

		public Editora buscarEditoraPorId(Integer id) {
			return editoraRep.findById(id).orElse(null); // metodo que busca um objeto pelo id
		}

		public Editora salvarEditora(Editora editora) {
			return editoraRep.save(editora);
		}

		public Editora atualizarEditora(Editora editora) {
			return editoraRep.save(editora);
		}

		public Boolean deletarEditora(Editora editora) {
			if(editora == null)
				return false;
			
			Editora editoraExistente = buscarEditoraPorId(editora.getCodigoEditora());
			
			if(editoraExistente == null)
				return false;
			
			editoraRep.delete(editora);
			
			Editora editoraContinuaExistindo = 
					buscarEditoraPorId(editora.getCodigoEditora());
			
			if(editoraContinuaExistindo == null)
				return true;

			return false;	
		}


}
