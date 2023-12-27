package com.ex.apirest.controllers;

import com.ex.apirest.services.PersonDTO;
import com.ex.apirest.model.Person;
import com.ex.apirest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;
    @PostMapping("/create")
    public Person create(@RequestBody Person person){
        return personService.createPerson(person);

    }
    @GetMapping("/persons")
    public List<Person> list(){
        return personService.showPerson();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        personService.deletePerson(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Person> find(@PathVariable int id){
        return personService.findPerson(id);
    }

    @PutMapping("/update/{id}")
    public Optional<Person> update(@RequestBody Person person, @PathVariable int id){

        return personService.updatePerson(person,id);
    }
    @PostMapping("/login")
    public PersonDTO login (@RequestBody Person person){
        return personService.login(person.getUser(), person.getPassword());
    }
}
