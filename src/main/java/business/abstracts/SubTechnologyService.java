package business.abstracts;

import entities.TechnologiesEntity;

import java.util.List;

public interface SubTechnologyService {
    List<TechnologiesEntity> getAllTechnology();

    TechnologiesEntity getTechnologyById(int id);

    TechnologiesEntity add(TechnologiesEntity technologiesEntity);

    void delete(int id);

    TechnologiesEntity update(int id, TechnologiesEntity technologiesEntity);

}
