package dev.sailesh.service;
import dev.sailesh.entity.Reviews;

public interface ReviewService {

		public Reviews createReview(String reviewBody,String imdbId);

	}
