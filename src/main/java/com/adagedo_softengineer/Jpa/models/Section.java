package com.adagedo_softengineer.Jpa.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;

    @OneToMany(
        mappedBy = "section"
    )
    private List<Lecture> lectures;

}
