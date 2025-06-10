package com.adagedo_softengineer.Jpa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;



@EqualsAndHashCode(callSuper = true)
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@SuperBuilder
@Entity
@DiscriminatorValue("T")
public class Text extends Resource{

    private String content;
}
