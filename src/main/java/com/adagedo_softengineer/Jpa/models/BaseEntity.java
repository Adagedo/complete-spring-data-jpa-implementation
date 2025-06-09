package com.adagedo_softengineer.Jpa.models;

import java.time.LocalDateTime;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

    private LocalDateTime createdAt;

    private LocalDateTime lastModifiedAt;

    private String createBy;

    private String lastModifiedBy;

}
