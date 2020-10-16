package com.test.dao;

import com.test.model.Person;

import java.util.List;

/**
 * The Class PersonDAO
 *
 * @author Kris Sunu Purnandaru
 */
public interface PersonDAO {
    void addPerson(Person p);

    void updatePerson(Person p);

    List<Person> listPersons();

    Person getPersonById(int id);

    void removePerson(int id);
}
