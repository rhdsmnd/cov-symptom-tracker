package com.rhdes.covid.controller;

import com.rhdes.covid.model.Post;
import com.rhdes.covid.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class PostController {

    @Autowired
    private PostRepository postRepo;

    @GetMapping("/post/{id}")
    public Optional<Post> getPost(@PathVariable long id) {
        return postRepo.findById(id);
    }

    @PutMapping("/post")
    public Long createPost(@RequestBody Post post) {
        return postRepo.save(post).getId();
    }

    @DeleteMapping("/post/{id}")
    public void deletePost(@PathVariable long id) {
        postRepo.deleteById(id);
    }
}
