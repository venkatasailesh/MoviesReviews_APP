package dev.sailesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import dev.sailesh.entity.Movies;
import dev.sailesh.entity.Reviews;
import dev.sailesh.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	private ReviewRepository repo;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public Reviews createReview(String reviewBody, String imdbId) {
		Reviews review =repo.insert(new Reviews(reviewBody));
		
		mongoTemplate.update(Movies.class)
		.matching(Criteria.where("imdbId")
		.is(imdbId))
		.apply(new Update()
		.push("reviewsIds")
		.value(review))
		.first();
		
		return review;
	}

}
