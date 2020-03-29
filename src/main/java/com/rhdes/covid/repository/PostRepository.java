package com.rhdes.covid.repository;

import com.rhdes.covid.model.Post;
import com.rhdes.covid.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}
