package com.example.languagesandtechnologies.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "technologies")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TechnologiesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name="languagesEntity_id")
    private LanguagesEntity languagesEntity;
}
