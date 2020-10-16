package com.test.service;

import com.test.dao.PersonDAO;
import com.test.model.Person;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * The Class PersonServiceImpl
 *
 * @author Kris Sunu Purnandaru
 */

@Service
public class PersonServiceImpl implements PersonService {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    @Transactional
    public void addPerson(Person p) {
        this.personDAO.addPerson(p);
    }

    @Override
    @Transactional
    public void updatePerson(Person p) {
        this.personDAO.updatePerson(p);
    }

    @Override
    @Transactional
    public List<Person> listPersons() {
        return this.personDAO.listPersons();
    }

    @Override
    @Transactional
    public Person getPersonById(int id) {
        return this.personDAO.getPersonById(id);
    }

    @Override
    @Transactional
    public void removePerson(int id) {
        this.personDAO.removePerson(id);
    }
}
