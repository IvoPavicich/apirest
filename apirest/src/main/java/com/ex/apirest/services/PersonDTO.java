package com.ex.apirest.services;

import lombok.Getter;
import lombok.Setter;


@Setter @Getter
public class PersonDTO {
    private int id;
    private String firstname;
    private String lastname;
    private String email;

    public PersonDTO(int id, String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public PersonDTO() {
    }
}
