package com.example.languagesandtechnologies.business.abstracts;

import com.example.languagesandtechnologies.business.requests.languagesRequest.CreateLanguage;
import com.example.languagesandtechnologies.business.requests.languagesRequest.DeleteLanguage;
import com.example.languagesandtechnologies.business.requests.languagesRequest.UpdateLanguage;
import com.example.languagesandtechnologies.business.responses.GetAllLanguageResponse;
import com.example.languagesandtechnologies.entities.LanguagesEntity;

import java.util.List;

public interface ProgrammingLanguageService {
    List<GetAllLanguageResponse> getAllLanguages();

    LanguagesEntity getById(int id) throws Exception;

    void delete(DeleteLanguage deleteLanguage);

    void update(UpdateLanguage updateLanguage) throws Exception;

    void add(CreateLanguage createLanguage) throws Exception;
}
