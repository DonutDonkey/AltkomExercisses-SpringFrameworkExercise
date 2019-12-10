package com.example.main.repository;

import com.example.main.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findById(long id);
}
