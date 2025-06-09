package com.adagedo_softengineer.Jpa.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data // create getters and setters for us behind the scene
@NoArgsConstructor // creates a No argument constructor
@AllArgsConstructor // creates constructor with arguments
@SuperBuilder
@Entity
public class BaseEntity {

    @Id
    @GeneratedValue // auto generate our id
    @Column(unique = true)
        private Integer id;

    private LocalDateTime createdAt;

    private LocalDateTime lastModifiedAt;

    private String createBy;

    private String lastModifiedBy;

}
