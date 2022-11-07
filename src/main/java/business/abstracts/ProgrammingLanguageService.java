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

    GetByIdLanguageResponse getById(GetByIdLanguage byIdLanguage);

    void delete(DeleteLanguage deleteLanguage);

    void update(int id, UpdateLanguage updateLanguage);

    void add(CreateLanguage createLanguage);
}
