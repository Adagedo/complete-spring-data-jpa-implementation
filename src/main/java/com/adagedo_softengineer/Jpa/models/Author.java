package com.adagedo_softengineer.Jpa.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true) // allow you to call the super class for the data implementation
@Data // create getters and setters for us behind the scene
@NoArgsConstructor // creates a No argument constructor
@AllArgsConstructor // creates constructor with arguments
@SuperBuilder
@Entity
public class Author extends BaseEntity{

    private Integer id;

    @Column(nullable = false, length=20)
    private String firstname;

    @Column(nullable = false, length = 20)
    private String lastname;

    @Column(unique=true, nullable=false)
    private String email;

    private Integer age;

    @Column(updatable=false)
    private LocalDateTime createdAt;

    @Column(insertable = false)
    private LocalDateTime lastModified;

    @ManyToMany(
        mappedBy = "authors"
    )
    private List<Course> Courses;

}
