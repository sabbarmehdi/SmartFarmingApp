package com.diagnoPlant.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diagnoPlant.Models.MaladiePlante;
import com.diagnoPlant.Repositories.MaladiePlanteRepository;

/**
 * This class used to manage the plant disease list
 * @author lahcen
 *
 */

@RestController
public class MaladiePlanteController {
	@Autowired
	MaladiePlanteRepository maladiePRepo;
	
	/**
	 * This method get you all plant disease by name
	 * @author lahcen
	 * @param Chercher
	 * @param page
	 * @param size
	 */
	@GetMapping(value="/listMaladiePlant")
	public Page<MaladiePlante> listOfNomMaladie(Model model,
			@RequestParam(name="page",defaultValue="0")int page ,
			@RequestParam(name="size", defaultValue="5")int size,
			@RequestParam(name="Chercher", defaultValue="")String Chercher) {
		Page<MaladiePlante> pageMaladiePlante =maladiePRepo
				.findByNomMaladieContains(Chercher, PageRequest.of(page, size));
		model.addAttribute("pageMaladiePlante", pageMaladiePlante);
		model.addAttribute("currentPage",page);
		model.addAttribute("size",size);
		model.addAttribute("Chercher",Chercher);
		model.addAttribute("pages", new int[pageMaladiePlante.getTotalPages()]);
		return maladiePRepo.findByNomMaladieContains(Chercher, PageRequest.of(page, size));
	}
	
	/**
	 * This method can get you all info of plant disease
	 * @author lahcen
	 * @param idMaladiePlante
	 * 
	 */
	@GetMapping(value="/info")
	public MaladiePlante info(Model model, 
			@RequestParam(value="id")Long idMaladiePlante ) {
		MaladiePlante mpl = maladiePRepo.getOne(idMaladiePlante);
		model.addAttribute("infoMaladieP", mpl);
		return mpl;
	}
}