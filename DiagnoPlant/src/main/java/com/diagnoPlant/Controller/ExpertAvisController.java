package com.diagnoPlant.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.diagnoPlant.Models.Image;
import com.diagnoPlant.Models.MaladiePlante;
import com.diagnoPlant.Repositories.ImageRepository;
import com.diagnoPlant.Repositories.MaladiePlanteRepository;




@Controller
public class ExpertAvisController {

	@Autowired(required=true)
	private MaladiePlanteRepository maladiePlanteRepository;

	@Autowired(required=true)
	private ImageRepository imageRepository;
	
	@Value("${dir.images}")
	private String imageDir;

	/**
	 * @author PC
	 * Ces deux méthodes permettent de remplir de récupérer les données saisies
	 * et de les enregistrer dans la base de données
	 */
	
	
	@RequestMapping(value = "/ajoutermaladie", method = RequestMethod.GET)
	public String ajouterMaladie(Model model) {
		model.addAttribute("maladiePlante", new MaladiePlante());

		return "ajoutermaladie";
	}

	@RequestMapping(value = "/ajoutermaladie", method = RequestMethod.POST)
	public String ajouterMaladie(MaladiePlante m) {
		maladiePlanteRepository.save(m);

		return "confirmationexpert";
	}

	@RequestMapping(value = "/pageexpert")

	public String Page(Model model, @RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "4") int size) {
		PageRequest pageable = PageRequest.of(page, size);
		Page<Image> im = imageRepository.findAll(pageable);
		model.addAttribute("currentpage", page);
		model.addAttribute("size", size);
		model.addAttribute("image", im);
        model.addAttribute("pages",new int[im.getTotalPages()]);
        return"pageexpert";
	}

	@RequestMapping(value = "/pageexpert", produces = MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] index(Long id) throws FileNotFoundException, IOException {
		File f = new File(imageDir+id);

		return IOUtils.toByteArray(new FileInputStream(f));
	}
 
	@RequestMapping(value = "/donneravis",method = RequestMethod.GET)

	public String Avis(@RequestParam(value ="id") Long id, Model model) {

		Image img = imageRepository.getOne(id);
		model.addAttribute("image", img);

		
		  Image mage = new Image(); 
		  mage.setId(img.getId());
		  mage.setImage(img.getImage()); 
		  mage.setEtatTraitement(true);
		  mage.setInfosCompl(null);
		  mage.setMaladiePlante(null);
		  
		  
		  model.addAttribute("magic", mage);
		 

		Iterable<MaladiePlante> list = maladiePlanteRepository.findAll();
		model.addAttribute("maladie", list);
		
		return "donneravis";
	}
	
	
	
	  @RequestMapping(value = "/donneravis", method = RequestMethod.POST)
	  public String Maladie (@ModelAttribute("magic") Image m,Model model,MaladiePlante maladiePlante) {
		
		  m.setEtatTraitement(true);
		  imageRepository.save(m);
		 
		  model.addAttribute("avis",m.getId());
		  
		  
		  
	  return "confirmationexpert"; }
 
	
}
