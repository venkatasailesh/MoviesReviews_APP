package dev.sailesh.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection= "movies")
public class Movies {
	@Id
	private ObjectId id;
	private String imdbId;
	private String title;
	private String releaseDate;
	private String trailerLink;
	private List<String> genres;
	private String poster;
	private List<String> backdrops;
	@DocumentReference
	private List<Reviews> reviewIds;
	
	
	
	
	


}
