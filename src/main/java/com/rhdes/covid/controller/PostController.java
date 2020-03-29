package com.rhdes.covid.controller;

import com.rhdes.covid.model.Post;
import com.rhdes.covid.model.UserSymptoms;
import com.rhdes.covid.repository.PostRepository;
import com.rhdes.covid.repository.UserSymptomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    private PostRepository postRepo;
    @Autowired
    private UserSymptomsRepository userSymptomsRepo;

    @GetMapping("/post/{id}")
    public Optional<Post> getPost(@PathVariable long id) {
        return postRepo.findById(id);
    }

    @PutMapping("/post")
    public Long createPost(@RequestBody Post post) {
        long postId = postRepo.save(post).getId();

        if (post.getUserSymptoms() != null) {
            for (UserSymptoms symptom : post.getUserSymptoms()) {
                symptom.setPostId(postId);
                userSymptomsRepo.save(symptom);
            }
        }

        return postId;
    }

    @DeleteMapping("/post/{id}")
    public void deletePost(@PathVariable long id) {
        postRepo.deleteById(id);
    }
}
