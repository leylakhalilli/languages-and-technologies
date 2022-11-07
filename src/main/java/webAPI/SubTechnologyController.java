package webAPI;

import business.abstracts.SubTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/technology")
public class SubTechnologyController {
    private SubTechnologyService subTechnologyService;

    @Autowired
    public SubTechnologyController(SubTechnologyService subTechnologyService) {
        this.subTechnologyService = subTechnologyService;
    }
}
