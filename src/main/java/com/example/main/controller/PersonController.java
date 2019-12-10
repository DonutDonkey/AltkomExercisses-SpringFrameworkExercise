package com.example.main.controller;

import com.example.main.entity.Person;
import com.example.main.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/getPeople")
    public Iterable<Person> personIterable() { return personRepository.findAll(); }
}
