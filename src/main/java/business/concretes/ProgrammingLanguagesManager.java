package business.concretes;

import business.abstracts.ProgrammingLanguageService;
import business.requests.languagesRequest.CreateLanguage;
import business.requests.languagesRequest.DeleteLanguage;
import business.requests.languagesRequest.UpdateLanguage;
import business.responses.GetAllLanguageResponse;
import dataAccess.abstracts.LanguagesRepository;
import entities.LanguagesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public LanguagesEntity getById(int id) throws Exception {

        Optional<LanguagesEntity> languages = languagesRepository.findById(id);
        if (languages.isPresent()) {
            return languagesRepository.findById(id).get();
        }
        else throw new Exception("Language not found");
    }


    @Override
    public void delete(DeleteLanguage deleteLanguage) {
        LanguagesEntity languages = languagesRepository.findById(deleteLanguage.getId()).get();
        languagesRepository.delete(languages);
    }

    @Override
    public void update(UpdateLanguage updateLanguage) throws Exception {
        LanguagesEntity languages = languagesRepository.findById(updateLanguage.getId()).get();
        if (isNameEmpty(updateLanguage.getName())) {
            throw new Exception("Programming language cannot be empty");


        } else if (isNameExist(updateLanguage.getName())) {
            throw new Exception("Program name cannot be repeated");

        }

        languagesRepository.save(languages);
    }


    @Override
    public void add(CreateLanguage createLanguage) throws Exception {
        LanguagesEntity languages = new LanguagesEntity();
        languages.setName(createLanguage.getName());

        if (isNameExist(createLanguage.getName())) {
            throw new Exception("Program name cannot be repeated");

        } else if (isNameEmpty(createLanguage.getName())) {
            throw new Exception("Programming language cannot be empty");
        }
        languagesRepository.save(languages);
    }

    public boolean isNameExist(String languageName) {
        List<LanguagesEntity> languagesEntities = languagesRepository.findAll();
        for (LanguagesEntity languages : languagesEntities) {
            if (languages.getName().equals(languageName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isNameEmpty(String languageName) {
        if (languageName.isEmpty() || languageName.isBlank()) {
            return true;
        }
        return false;
    }


}
