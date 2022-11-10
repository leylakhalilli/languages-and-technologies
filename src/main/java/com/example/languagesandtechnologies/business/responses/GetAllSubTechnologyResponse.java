package com.example.languagesandtechnologies.business.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class GetAllSubTechnologyResponse {
    int id;
    String name;
    String programmingLanguageName;
}
