package com.adagedo_softengineer.Jpa.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Section extends BaseEntity {

    private String name;

    private int order;

    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;

    @OneToMany(
        mappedBy = "section"
    )
    private List<Lecture> lectures;

    @OneToOne
    @JoinColumn(name="resource_id")
    private Resource resource;

}