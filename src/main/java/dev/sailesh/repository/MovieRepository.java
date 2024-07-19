package dev.sailesh.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import dev.sailesh.entity.Movies;

public interface MovieRepository extends MongoRepository<Movies,ObjectId> {

	Optional<Movies> findMovieByimdbId(String imdbId);
}
