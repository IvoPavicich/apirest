package com.ex.apirest.controllers;

import com.ex.apirest.model.Person;
import com.ex.apirest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;
    @PostMapping("/create")
    public void create(@RequestBody Person person){
        personService.createPerson(person);
    }
}
