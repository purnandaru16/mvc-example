package com.test.service;

import com.test.model.Person;

import java.util.List;

/**
 * The Class PersonService
 *
 * @author Kris Sunu Purnandaru
 */
public interface PersonService {
    void addPerson(Person p);

    void updatePerson(Person p);

    List<Person> listPersons();

    Person getPersonById(int id);

    void removePerson(int id);
}
