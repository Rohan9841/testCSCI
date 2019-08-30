package com.csci.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.csci.demo.data.IngredientRepository;
import com.csci.demo.data.Recipe;
import com.csci.demo.domain.Ingredient;

@SpringBootApplication
public class RecipeApplication {

	@Bean
	  public CommandLineRunner dataLoader(IngredientRepository repo) {
	    return new CommandLineRunner() {
	      @Override
	      public void run(String... args) throws Exception {
	        repo.save(new Ingredient("tm","Tomato"));
	        repo.save(new Ingredient("on","Onion"));
	        repo.save(new Ingredient("ap","Apple"));
	        repo.save(new Ingredient("gp","Grape"));
	      }
	    };
}
	public static void main(String[] args) {
		SpringApplication.run(RecipeApplication.class, args);
	}

}
