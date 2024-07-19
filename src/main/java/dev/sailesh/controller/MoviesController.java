package dev.sailesh.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.sailesh.entity.Movies;
import dev.sailesh.service.MovieService;


@RestController
@RequestMapping("/api/v1/movies")

public class MoviesController {
	
	@Autowired
	private MovieService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Movies>> allmovies() {
		return new ResponseEntity<List<Movies>>(service.getallmovies(),HttpStatus.OK);
	}
	
	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<Movies>> singleMovie(@PathVariable String imdbId) {
		return new ResponseEntity<Optional<Movies>>(service.getSingleMovie(imdbId),HttpStatus.OK);
	}
	
	
	

	
}
