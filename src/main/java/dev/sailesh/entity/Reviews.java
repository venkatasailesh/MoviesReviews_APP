package dev.sailesh.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Document(collection ="reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Reviews {
 
	@Id
	private  ObjectId id;
	
	private String body;
	
	public Reviews(String body) {
		super();
		this.body = body;
	}

	
	
	
}
