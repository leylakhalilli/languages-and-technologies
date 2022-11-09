package com.example.languagesandtechnologies.business.concretes;

import com.example.languagesandtechnologies.business.abstracts.SubTechnologyService;
import com.example.languagesandtechnologies.dataAccess.abstracts.TechnologiesRepository;
import com.example.languagesandtechnologies.entities.TechnologiesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
