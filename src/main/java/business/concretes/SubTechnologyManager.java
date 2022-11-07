package business.concretes;

import business.abstracts.SubTechnologyService;
import dataAccess.abstracts.TechnologiesRepository;
import entities.TechnologiesEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubTechnologyManager implements SubTechnologyService {
    private TechnologiesRepository technologiesRepository;

    @Autowired
    public SubTechnologyManager(TechnologiesRepository technologiesRepository) {
        this.technologiesRepository = technologiesRepository;
    }

    @Override
    public List<TechnologiesEntity> getAllTechnology() {
        return null;
    }

    @Override
    public TechnologiesEntity getTechnologyById(int id) {
        return null;
    }

    @Override
    public TechnologiesEntity add(TechnologiesEntity technologiesEntity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public TechnologiesEntity update(int id, TechnologiesEntity technologiesEntity) {
        return null;
    }
}
