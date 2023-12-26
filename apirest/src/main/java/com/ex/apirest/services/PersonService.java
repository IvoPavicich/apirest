package com.ex.apirest.services;

import com.ex.apirest.model.Person;
import com.ex.apirest.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;
    public Person createPerson(Person person){
        personRepository.save(person);
        return person;
    }

    public List<Person> showPerson(){
        return personRepository.findAll();

    }

}

