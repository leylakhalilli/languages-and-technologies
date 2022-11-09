package com.example.languagesandtechnologies.dataAccess.abstracts;

import com.example.languagesandtechnologies.entities.LanguagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguagesRepository extends JpaRepository<LanguagesEntity,Integer> {
}
