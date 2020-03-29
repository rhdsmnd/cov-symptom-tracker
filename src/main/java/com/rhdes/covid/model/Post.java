package com.rhdes.covid.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.rhdes.covid.serializer.TsSerializer;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@CreationTimestamp
	@JsonSerialize(using = TsSerializer.class)
	private Timestamp ts;
	private Long userId;
	private String type;
	private String description;
	@OneToMany(mappedBy="postId", cascade = CascadeType.ALL)
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Timestamp getTs() {
		return ts;
	}

	public void setTs(Timestamp ts) {
		this.ts = ts;
	}
}
