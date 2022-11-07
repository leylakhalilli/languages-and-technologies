package business.concretes;

import business.abstracts.ProgrammingLanguageService;
import dataAccess.abstracts.LanguagesRepository;
import entities.LanguagesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguagesManager implements ProgrammingLanguageService {
    private LanguagesRepository languagesRepository;

    @Autowired
    public ProgrammingLanguagesManager(LanguagesRepository languagesRepository) {
        this.languagesRepository = languagesRepository;
    }

    @Override
    public List<LanguagesEntity> getAllLanguages() {
        return null;
    }

    @Override
    public LanguagesEntity getById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public LanguagesEntity update(int id, LanguagesEntity languagesEntity) {
        return null;
    }

    @Override
    public LanguagesEntity add(LanguagesEntity languagesEntity) {
        return null;
    }
}
