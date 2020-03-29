package com.rhdes.covid.repository;

import com.rhdes.covid.model.Symptom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomsRepository extends CrudRepository<Symptom, Long> {
}
