package dev.sailesh.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import dev.sailesh.entity.Reviews;

public interface ReviewRepository extends MongoRepository<Reviews, ObjectId> {

}
