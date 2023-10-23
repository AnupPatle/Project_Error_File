package com.greatlearning.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.model.GreatLearning;

@SpringBootApplication
public class SpringBootLibraryDesignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("Hello spring boot");
		System.out.println("Hello dev tools");
	}

	@Override
	public void run(String... args) throws Exception {
		 
	}

}
