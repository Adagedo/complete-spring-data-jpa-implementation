package com.adagedo_softengineer.Jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Lecture extends BaseEntity{

    private String name;

    @ManyToOne
    @JoinColumn(name="section_id")
    private Section section;
}
