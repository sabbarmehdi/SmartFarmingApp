package com.diagnoPlant.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.diagnoPlant.Models.MaladiePlante;
import com.diagnoPlant.Repositorys.MaladiePlanteRepository;


@Controller
@RequestMapping(value="/maladiePlantes")
public class MaladiePlanteController {
	@Autowired
	MaladiePlanteRepository maladiePRepo;
	
	@RequestMapping(value="/index")
	public String Index(Model model, @RequestParam(name="nomMaladie", defaultValue="")String nomMal) {
		List<MaladiePlante> mp = maladiePRepo.findAll();
		List<MaladiePlante> nm = maladiePRepo.findByNomMaladie(nomMal);		
		model.addAttribute("maladiePlante", mp);
		model.addAttribute("nomMaladie", nomMal);
		return "listMaladie";
	}
	
	
	
	


	

}