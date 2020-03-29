package com.rhdes.covid.repository;

import com.rhdes.covid.model.UserSymptoms;
import org.springframework.data.repository.CrudRepository;

public interface UserSymptomsRepository extends CrudRepository<UserSymptoms, Long> {
}
