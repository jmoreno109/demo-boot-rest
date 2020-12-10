package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PersonRepository;
import com.example.demo.model.Person;

@RestController
@RequestMapping("/persons")
public class DemoRestController {

	@Autowired
	PersonRepository personRepository;

	@GetMapping
	public List<Person> list() {
		return personRepository.findAll();
	}

	@PostMapping
	public void save(@RequestBody Person person) {
		personRepository.save(person);
	}

	@PutMapping
	public void update(@RequestBody Person person) {
		personRepository.save(person);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		personRepository.deleteById(id);
	}

}
