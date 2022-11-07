package business.abstracts;

import entities.LanguagesEntity;

import java.util.List;

public interface ProgrammingLanguageService {
    List<LanguagesEntity> getAllLanguages();

    LanguagesEntity getById(int id);

    void delete(int id);

    LanguagesEntity update(int id, LanguagesEntity languagesEntity);

    LanguagesEntity add(LanguagesEntity languagesEntity);
}
