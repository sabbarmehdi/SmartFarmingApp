package com.diagnoPlant.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
	public String Index(Model model,
			@RequestParam(name="page",defaultValue="0")int p ,
			@RequestParam(name="size", defaultValue="5")int size,
			@RequestParam(name="chercher", defaultValue="")String chercher) {
		Page<MaladiePlante> pageMaladiePlante = maladiePRepo
				.findAll(PageRequest.of(p, size));
		model.addAttribute("pageMaladiePlante", pageMaladiePlante);
		model.addAttribute("currentPage",p);
		model.addAttribute("size",size);
		model.addAttribute("chercher",chercher);
		model.addAttribute("pages", new int[pageMaladiePlante.getTotalPages()]);
		return "listMaladie";
	}
	
	@RequestMapping(value="/info")
	public String Info(Model model, @RequestParam(value="id")Long idMaladiePlante ) {
		MaladiePlante mpl = maladiePRepo.getOne(idMaladiePlante);
		model.addAttribute("infoMaladieP", mpl);
		return "listResponseNamMal";
	}
	
	
	
	


	

}