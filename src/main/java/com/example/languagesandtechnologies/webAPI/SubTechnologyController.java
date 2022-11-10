package com.example.languagesandtechnologies.webAPI;

import com.example.languagesandtechnologies.business.abstracts.SubTechnologyService;
import com.example.languagesandtechnologies.business.requests.technologiesRequest.CreateSubTechnology;
import com.example.languagesandtechnologies.business.requests.technologiesRequest.DeleteSubTechnology;
import com.example.languagesandtechnologies.business.requests.technologiesRequest.UpdateSubTechnology;
import com.example.languagesandtechnologies.business.responses.GetAllSubTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/technology")
public class SubTechnologyController {
    private SubTechnologyService subTechnologyService;

    @Autowired
    public SubTechnologyController(SubTechnologyService subTechnologyService) {
        this.subTechnologyService = subTechnologyService;
    }

    @GetMapping("/get-all")
    public List<GetAllSubTechnologyResponse> getAll() {
        return subTechnologyService.getAll();

    }

    @PostMapping("/add")
    public void add(@RequestBody CreateSubTechnology createSubTechnology) {
        subTechnologyService.add(createSubTechnology);

    }


    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteSubTechnology deleteSubTechnology) {
        subTechnologyService.delete(deleteSubTechnology);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateSubTechnology updateSubTechnology) {
        subTechnologyService.update(updateSubTechnology);

    }

}
