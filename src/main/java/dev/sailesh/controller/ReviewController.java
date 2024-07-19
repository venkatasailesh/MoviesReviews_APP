package dev.sailesh.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.sailesh.entity.Reviews;
import dev.sailesh.service.ReviewService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

	@Autowired
	private ReviewService service;
	
	@PostMapping
	public ResponseEntity<Reviews> createReviews (@RequestBody Map<String,String>payload) {
		
		return new ResponseEntity<Reviews>(service.createReview(payload.get("reviewBody"),payload.get("imdbId")),HttpStatus.CREATED);
	}
	
}
