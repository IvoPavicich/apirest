package com.ex.apirest.services;

import com.ex.apirest.model.Person;
import com.ex.apirest.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;
    public void createPerson(Person person){
        personRepository.save(person);
    }


}

