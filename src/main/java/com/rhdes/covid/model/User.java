package com.rhdes.covid.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double lat;
	private double lon;
	@OneToMany(mappedBy="userId", cascade = CascadeType.ALL)
	private List<Post> userCase;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Post> getUserCase() {
		return userCase;
	}

	public void setUserCase(List<Post> userCase) {
		this.userCase = userCase;
	}
}
