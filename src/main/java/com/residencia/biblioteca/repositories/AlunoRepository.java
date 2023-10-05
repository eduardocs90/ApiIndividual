package com.residencia.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residencia.biblioteca.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,Integer> {  //padrão de criar um repositorio para uma entidade 

}
