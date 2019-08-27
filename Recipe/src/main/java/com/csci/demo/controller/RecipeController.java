package com.csci.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.csci.demo.data.Recipe;
import com.csci.demo.data.RecipeRepository;


@RepositoryRestController
@CrossOrigin(origins = "*")

public class RecipeController {

	private RecipeRepository repo;
	
	@Autowired
	public RecipeController(RecipeRepository repo) {
		this.repo = repo;
	}
	
	@PostMapping(consumes = "application/jsosn")
	@ResponseStatus(HttpStatus.CREATED)
	public Recipe saveRecipe(@RequestBody Recipe recipe) {
		return repo.save(recipe);
	}
}
