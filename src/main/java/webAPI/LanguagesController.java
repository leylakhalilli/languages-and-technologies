package webAPI;


import business.abstracts.ProgrammingLanguageService;
import business.requests.languagesRequest.CreateLanguage;
import business.requests.languagesRequest.DeleteLanguage;
import business.requests.languagesRequest.GetByIdLanguage;
import business.requests.languagesRequest.UpdateLanguage;
import business.responses.GetAllLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/languages")
public class LanguagesController {

    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public LanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getAllLanguages")
    public List<GetAllLanguageResponse> getAllLanguageResponses() {
        return programmingLanguageService.getAllLanguages();
    }

//    @GetMapping("/byId")
//    public GetByIdLanguage getByIdLanguageResponse(@RequestBody GetByIdLanguage byIdLanguage) {
//        return programmingLanguageService.getById(byIdLanguage);
//    }

    @PostMapping("/addLanguage")
    public void add(@RequestBody CreateLanguage createLanguage) {
        programmingLanguageService.add(createLanguage);
    }

    @DeleteMapping("/deleteLanguage")
    public void delete(@RequestBody  DeleteLanguage deleteLanguage) {
        programmingLanguageService.delete(deleteLanguage);
    }

    @PutMapping("/updateLanguage")
    public void update(int id, UpdateLanguage updateLanguage) {
        programmingLanguageService.update(id, updateLanguage);

    }
}
