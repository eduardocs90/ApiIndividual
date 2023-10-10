package com.residencia.biblioteca.repositories; // Define o pacote ao qual esta interface pertence

import org.springframework.data.jpa.repository.JpaRepository; // Importa a interface JpaRepository do Spring Data JPA

import com.residencia.biblioteca.entities.Aluno; // Importa a entidade Aluno

public interface AlunoRepository extends JpaRepository<Aluno,Integer> {  
    // Define uma interface que estende JpaRepository, indicando que ela manipula entidades do tipo Aluno
    // O tipo de identificador é Integer (ID) 

}
