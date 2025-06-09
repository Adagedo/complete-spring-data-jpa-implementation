package com.adagedo_softengineer.Jpa.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data // this annotations severs the same purpose as the getters ans setters
@Builder
@Entity
public class Section {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int order;

}
