package business.concretes;

import business.abstracts.ProgrammingLanguageService;
import business.requests.languagesRequest.CreateLanguage;
import business.requests.languagesRequest.DeleteLanguage;
import business.requests.languagesRequest.GetByIdLanguage;
import business.requests.languagesRequest.UpdateLanguage;
import business.responses.GetAllLanguageResponse;
import business.responses.GetByIdLanguageResponse;
import dataAccess.abstracts.LanguagesRepository;
import entities.LanguagesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguagesManager implements ProgrammingLanguageService {
    private LanguagesRepository languagesRepository;

    @Autowired
    public ProgrammingLanguagesManager(LanguagesRepository languagesRepository) {
        this.languagesRepository = languagesRepository;
    }

    @Override
    public List<GetAllLanguageResponse> getAllLanguages() {
        List<GetAllLanguageResponse> allLanguageResponses = new ArrayList<>();
        List<LanguagesEntity> languagesEntityList = languagesRepository.findAll();

        for (LanguagesEntity languages : languagesEntityList) {
            GetAllLanguageResponse languageResponse = new GetAllLanguageResponse();
            languageResponse.setId(languages.getId());
            languageResponse.setName(languages.getName());

            allLanguageResponses.add(languageResponse);
        }
        return allLanguageResponses;
    }

    @Override
    public GetByIdLanguageResponse getById(GetByIdLanguage byIdLanguage) {
        return null;
    }


    @Override
    public void delete(DeleteLanguage deleteLanguage) {

    }

    @Override
    public void update(int id, UpdateLanguage updateLanguage) {

    }


    @Override
    public void add(CreateLanguage createLanguage) {
        LanguagesEntity languages = new LanguagesEntity();
        languages.setName(createLanguage.getName());
        this.languagesRepository.save(languages);
    }
}
