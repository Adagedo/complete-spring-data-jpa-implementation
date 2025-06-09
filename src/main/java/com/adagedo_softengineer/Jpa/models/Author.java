package com.adagedo_softengineer.Jpa.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // implements getters for the author fields 
@Setter // implements setters
@NoArgsConstructor // creates a No argument constructor
@AllArgsConstructor // creates constructor with arguments
@Entity
public class Author {

    @Id
    @GeneratedValue // auto generate our id
    @Column(unique = true)
    private Integer id;

    @Column(nullable = false, length=20)
    private String firstname;

    @Column(nullable = false, length = 20)
    private String lastname;

    @Column(unique=true, nullable=false)
    private String email;

    private Integer age;

    @Column(updatable=false, nullable=false)
    private LocalDateTime createdAt;

    @Column(insertable = false)
    private LocalDateTime lastModified;

}
