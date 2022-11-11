package com.example.languagesandtechnologies.business.responses;

import com.example.languagesandtechnologies.entities.TechnologiesEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllLanguageResponse {
    private int id;
    private String name;
    private List<TechnologiesEntity> technologiesEntities;
}
