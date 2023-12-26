package com.ex.apirest.controllers;

import com.ex.apirest.model.Person;
import com.ex.apirest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
