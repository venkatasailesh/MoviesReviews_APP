package dev.sailesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.sailesh.entity.Movies;
import dev.sailesh.repository.MovieRepository;


@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository repo;
	
	@Override
	public List<Movies> getallmovies() {
		return repo.findAll();
	}

	@Override
	public Optional<Movies> getSingleMovie(String imdbId) {
		
		return repo.findMovieByimdbId(imdbId);
	}
	

}
