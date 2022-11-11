package com.example.languagesandtechnologies.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Table(name = "languages")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LanguagesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany  (mappedBy = "languagesEntity")
    private List<TechnologiesEntity> technologiesEntities;

}
