package com.adagedo_softengineer.Jpa;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.adagedo_softengineer.Jpa.models.Author;
import com.adagedo_softengineer.Jpa.models.AuthorRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// injecting the repository via the bean
	@Bean 
	public CommandLineRunner commandLineRunner(
		AuthorRepository repository
	)
	{
		return args -> {
			var author = Author.builder()
			.firstname("adagedo")
			.lastname("solomon")
			.email("ada@gmail.com").createdAt(LocalDateTime.now())
			.age(24).build();

			repository.save(author);
		};
	}

}
