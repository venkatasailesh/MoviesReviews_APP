package dev.sailesh.service;

import java.util.List;
import java.util.Optional;

import dev.sailesh.entity.Movies;

public interface MovieService {
	public List<Movies> getallmovies();
	public Optional<Movies> getSingleMovie(String imdbId);
}
