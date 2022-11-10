package com.example.languagesandtechnologies.business.abstracts;

import com.example.languagesandtechnologies.business.requests.technologiesRequest.CreateSubTechnology;
import com.example.languagesandtechnologies.business.requests.technologiesRequest.DeleteSubTechnology;
import com.example.languagesandtechnologies.business.requests.technologiesRequest.UpdateSubTechnology;
import com.example.languagesandtechnologies.business.responses.GetAllSubTechnologyResponse;
import com.example.languagesandtechnologies.entities.TechnologiesEntity;

import java.util.List;

public interface SubTechnologyService {

    List<GetAllSubTechnologyResponse> getAll();

    void add(CreateSubTechnology createSubTechnology);

    void delete(DeleteSubTechnology deleteSubTechnology);

    void update(UpdateSubTechnology updateSubTechnology);

}
