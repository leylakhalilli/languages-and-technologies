package com.example.languagesandtechnologies.business.requests.technologiesRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateSubTechnology {
    private int id;
    private String newName;
}
