package com.example.languagesandtechnologies.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByIdTechnology {
    private int id;
    private String name;
    private String language;

}
