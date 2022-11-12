package com.example.languagesandtechnologies.business.requests.technologiesRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateSubTechnology {
    private String name;
    private String programmingLanguageName;
    private int programmingLanguageId;


}
