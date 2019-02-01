package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;


@SpringBootApplication

public class TestApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository ;

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.save(new User("nom1", "prenom1"));
		userRepository.save(new User("nom2", "prenom2"));
		
	}

}

