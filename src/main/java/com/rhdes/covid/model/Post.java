package com.rhdes.covid.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type;
	private String description;
	@OneToMany(mappedBy="postId")
	private List<UserSymptoms> userSymptoms;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<UserSymptoms> getUserSymptoms() {
		return userSymptoms;
	}

	public void setUserSymptoms(List<UserSymptoms> userSymptoms) {
		this.userSymptoms = userSymptoms;
	}
}
