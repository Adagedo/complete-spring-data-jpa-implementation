package com.adagedo_softengineer.Jpa.models;

import lombok.AllArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;



@EqualsAndHashCode(callSuper = true)
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@SuperBuilder
@Entity
@DiscriminatorValue(name="F")
public class File extends Resource{

    private String type;
}
