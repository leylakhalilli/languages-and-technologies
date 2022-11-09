package com.example.languagesandtechnologies.dataAccess.abstracts;

import com.example.languagesandtechnologies.entities.TechnologiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologiesRepository extends JpaRepository<TechnologiesEntity, Integer> {
}
