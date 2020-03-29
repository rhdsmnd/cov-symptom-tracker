package com.rhdes.covid.controller;

import com.rhdes.covid.model.Symptom;
import com.rhdes.covid.repository.SymptomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SymptomsController {

	@Autowired
	private SymptomsRepository symptomRepo;

	@GetMapping("/symptom/{id}")
	public Optional<Symptom> getSymptom(@PathVariable long id) {
		return symptomRepo.findById(id);
	}

	@PutMapping("/symptom")
	public Long createSymptom(@RequestBody Symptom Symptom) {
		return symptomRepo.save(Symptom).getId();
	}

	@DeleteMapping("/symptom/{id}")
	public void deleteSymptom(@PathVariable long id) {
		symptomRepo.deleteById(id);
	}
}
