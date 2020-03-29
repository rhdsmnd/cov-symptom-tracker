package com.rhdes.covid.controller;

import com.rhdes.covid.model.UserSymptoms;
import com.rhdes.covid.repository.UserSymptomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserSymptomsController {

    @Autowired
    private UserSymptomsRepository userSymptomsRepo;

    @GetMapping("/user-symptoms/{id}")
    public Optional<UserSymptoms> getUserSymptoms(@PathVariable long id) {
        return userSymptomsRepo.findById(id);
    }

    @PutMapping("/user-symptoms")
    public Long createUserSymptoms(@RequestBody UserSymptoms UserSymptoms) {
        return userSymptomsRepo.save(UserSymptoms).getId();
    }

    @DeleteMapping("/user-symptoms/{id}")
    public void deleteUserSymptoms(@PathVariable long id) {
        userSymptomsRepo.deleteById(id);
    }
}
