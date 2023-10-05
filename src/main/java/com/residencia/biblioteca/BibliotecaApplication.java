package com.residencia.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //Sempre que tiver uma palavra com @ isso é uma anotação(da nome ao que o codigo vai executar)
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);//linha de codigo pra subir a API
		
		
	}

}
