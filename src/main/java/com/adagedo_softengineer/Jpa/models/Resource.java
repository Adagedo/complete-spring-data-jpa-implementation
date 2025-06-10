package com.adagedo_softengineer.Jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscrimatorColumn;
import jakarta.persistence.Inheritance;
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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscrimatorColumn(name = resource_type)
public class Resource extends BaseEntity{


    private String name;

    private int size;

    private String url;
}
