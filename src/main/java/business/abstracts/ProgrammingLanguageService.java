package business.abstracts;

import business.requests.languagesRequest.CreateLanguage;
import business.requests.languagesRequest.DeleteLanguage;
import business.requests.languagesRequest.GetByIdLanguage;
import business.requests.languagesRequest.UpdateLanguage;
import business.responses.GetAllLanguageResponse;
import business.responses.GetByIdLanguageResponse;
import entities.LanguagesEntity;

import java.util.List;

public interface ProgrammingLanguageService {
    List<GetAllLanguageResponse> getAllLanguages();

    LanguagesEntity getById(int id) throws Exception;

    void delete(DeleteLanguage deleteLanguage);

    void update(UpdateLanguage updateLanguage) throws Exception;

    void add(CreateLanguage createLanguage) throws Exception;
}
