package com.rhdes.covid.controller;

import com.rhdes.covid.model.Post;
import com.rhdes.covid.model.User;
import com.rhdes.covid.repository.PostRepository;
import com.rhdes.covid.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CommunityController {

	@Autowired
	private PostRepository postRepo;

	@GetMapping("/community")
	public Iterable<Post> getRecentPosts() {
		return postRepo.findAll();
	}

}
