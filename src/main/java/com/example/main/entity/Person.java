package com.example.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
    /**
     * Annotations for id variable
     * @Id - JPA now recognizes id as Object's ID
     * @GeneratedValue - Idicated that ID should be generated automatically
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public  Long getId() { return id; }

    private String nameFirst;
    public  String getNameFirst() { return nameFirst; }

    private String nameLast;
    public  String getNameLast() { return nameLast; }

    /**
     * Exists only for JPA
     */
    protected Person() { }

    public Person(String nameFirst, String nameLast) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
    }

    @Override
    public String toString() {
        return String.format("Person[id= %d, firstName= '%s', lastName= '%s']",
                id, nameFirst, nameLast);
    }
}
