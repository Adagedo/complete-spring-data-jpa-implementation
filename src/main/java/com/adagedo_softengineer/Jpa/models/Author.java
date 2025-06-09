package com.adagedo_softengineer.Jpa.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // implements getters for the author fields 
@Setter // implements setters
@NoArgsConstructor // creates a No argument constructor
@AllArgsConstructor // creates constructor with arguments
public class Author {

    private Integer id;

    private String firstname;

    private String lastname;

    private String email;

    private Integer age;

}
