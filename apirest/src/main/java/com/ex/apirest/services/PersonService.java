package com.ex.apirest.services;


import com.ex.apirest.model.Person;
import com.ex.apirest.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void deletePerson(int id){
        personRepository.deleteById(id);
    }
    public Optional<Person> findPerson(int id){
        return personRepository.findById(id) ;
    }
    public Optional<Person> updatePerson(Person person, int id){
        return personRepository.findById(id)
                .map(persons-> {
                    persons.setEmail(persons.getEmail());
                    persons.setFirstname(persons.getFirstname());
                    persons.setLastname(persons.getLastname());
                    return personRepository.save(person);
                });
    }
    public PersonDTO login(String user,String password ){

        Person person;
        person = personRepository.findByUserAndPassword(user,password);
        return new PersonDTO(person.getId(),
                person.getFirstname(),
                person.getLastname(),
                person.getEmail());
    }


}

