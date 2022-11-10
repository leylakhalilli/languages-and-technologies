package com.example.languagesandtechnologies.business.concretes;

import com.example.languagesandtechnologies.business.abstracts.SubTechnologyService;
import com.example.languagesandtechnologies.business.requests.technologiesRequest.CreateSubTechnology;
import com.example.languagesandtechnologies.business.requests.technologiesRequest.DeleteSubTechnology;
import com.example.languagesandtechnologies.business.requests.technologiesRequest.UpdateSubTechnology;
import com.example.languagesandtechnologies.business.responses.GetAllSubTechnologyResponse;
import com.example.languagesandtechnologies.dataAccess.abstracts.LanguagesRepository;
import com.example.languagesandtechnologies.dataAccess.abstracts.TechnologiesRepository;
import com.example.languagesandtechnologies.entities.LanguagesEntity;
import com.example.languagesandtechnologies.entities.TechnologiesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubTechnologyManager implements SubTechnologyService {
    private TechnologiesRepository technologiesRepository;
    private LanguagesRepository languagesRepository;

    @Autowired
    public SubTechnologyManager(TechnologiesRepository technologiesRepository, LanguagesRepository languagesRepository) {
        this.technologiesRepository = technologiesRepository;
        this.languagesRepository = languagesRepository;
    }


    @Override
    public List<GetAllSubTechnologyResponse> getAll() {
        List<GetAllSubTechnologyResponse> allSubTechnologyResponses = new ArrayList<>();
        List<TechnologiesEntity> technologiesEntityList = technologiesRepository.findAll();

        for (TechnologiesEntity technologies : technologiesEntityList) {
            GetAllSubTechnologyResponse technologyResponse = new GetAllSubTechnologyResponse();
            technologyResponse.setId(technologies.getId());
            technologyResponse.setName(technologies.getName());
            technologyResponse.setProgrammingLanguageName(technologies.getLanguagesEntity().getName());

            allSubTechnologyResponses.add(technologyResponse);
        }
        return allSubTechnologyResponses;
    }

    @Override
    public void add(CreateSubTechnology createSubTechnology) {
        if (!isNameExist(createSubTechnology.getName())
                && !isNameEmpty(createSubTechnology.getName())
                && !isNameEmpty(createSubTechnology.getProgrammingLanguageName())) {

            TechnologiesEntity technologiesEntity = new TechnologiesEntity();
            LanguagesEntity languagesEntity = new LanguagesEntity();

            technologiesEntity.setName(createSubTechnology.getName());

            List<LanguagesEntity> languagesEntities = languagesRepository.findAll();

            for (LanguagesEntity languages : languagesEntities) {
                if (languages.getName().equals(createSubTechnology.getProgrammingLanguageName())) {
                    languagesEntity = languages;
                    break;
                }

            }
            if (languagesEntity != null) {
                TechnologiesEntity technology = new TechnologiesEntity();
                technology.setName(createSubTechnology.getName());
                technology.setLanguagesEntity(languagesEntity);
                technologiesRepository.save(technology);
            }

        }


    }

    @Override
    public void delete(DeleteSubTechnology deleteSubTechnology) {

    }

    @Override
    public void update(UpdateSubTechnology updateSubTechnology) {

    }

    public boolean isNameExist(String technologyName) {
        List<TechnologiesEntity> technologiesEntities = technologiesRepository.findAll();
        for (TechnologiesEntity languages : technologiesEntities) {
            if (languages.getName().equals(technologyName)) {
                return true;
            }
        }
        return false;
    }


    public boolean isNameEmpty(String technologyName) {
        if (technologyName.isEmpty() || technologyName.isBlank()) {
            return true;
        }
        return false;
    }
}
