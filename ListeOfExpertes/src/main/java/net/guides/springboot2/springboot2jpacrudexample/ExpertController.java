package net.guides.springboot2.springboot2jpacrudexample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.relation.RelationNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
@Controller
public class ExpertController {
	@Autowired
    private ExpertRepository expertRepository;
	// frtch all Expertes findAll
	// frtch all Expertes findAll
    @GetMapping("/ok")
    public List<Expert> getAllExpertes() {
        return expertRepository.findAll();
    }
   
    @GetMapping("/all")
    public String showAll(Model model) {
        model.addAttribute("expertes", expertRepository.findAll());
        return "expertes";
    }
    // frtch all Expertes findById 
    @GetMapping("/expertes/{id}")
    public ResponseEntity<Expert> getExpertesById(@PathVariable(value = "id") Long expertId)
        throws RelationNotFoundException {
    	Expert expert = expertRepository.findById(expertId)
          .orElseThrow(() -> new RelationNotFoundException("Expert not found for this id :: " + expertId));
        return ResponseEntity.ok().body(expert);
    }
    
   
    // add a New Expert to dataBase
    @PostMapping("/addexpert")
    public Expert createExpert(@Valid @RequestBody Expert expert) {
        return expertRepository.save(expert);
    }

    //Update existing Expert by Id
    @PutMapping("/update/{id}")
    public ResponseEntity<Expert> updateExpert(@PathVariable(value = "id") Long expertId,
         @Valid @RequestBody Expert expertDetails) throws RelationNotFoundException {
    	Expert expert = expertRepository.findById(expertId)
        .orElseThrow(() -> new RelationNotFoundException("Expert not found for this id :: " + expertId));

    	expert.setLastName(expertDetails.getLastName());
    	expert.setFirstName(expertDetails.getFirstName());
        final Expert updatedExpert = expertRepository.save(expert);
        return ResponseEntity.ok(updatedExpert);
    }

    // Delet existing Expert by Id
    @DeleteMapping("/delete/{id}")
    public Map<String, Boolean> deleteExpert(@PathVariable(value = "id") Long expertId)
         throws RelationNotFoundException {
    	Expert expert = expertRepository.findById(expertId)
    			.orElseThrow(() -> new RelationNotFoundException("expert not found for this id :: " + expertId));

    	expertRepository.delete(expert);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
