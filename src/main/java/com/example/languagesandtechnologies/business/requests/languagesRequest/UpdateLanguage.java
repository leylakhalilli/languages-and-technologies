package com.example.languagesandtechnologies.business.requests.languagesRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLanguage {
    private int id;
    private String name;

}
