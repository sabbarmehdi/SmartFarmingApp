package com.diagnoPlant.Controllers;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
//import org.apache.commons.*;
//import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.diagnoPlant.Models.Image;
import com.diagnoPlant.Models.MaladiePlante;
import com.diagnoPlant.Repositorys.ImageRepository;
import com.diagnoPlant.Repositorys.MaladiePlanteRepository;


@Controller
public class MaladiePlanteController {
	@Autowired
	private MaladiePlanteRepository maladiePlanteRepository;
	
	@Autowired
	private ImageRepository imageRepository;
	
	@Value("${dir.images}")
	private String imageDir;
	
	@RequestMapping(value="/AjouterMaladie",method = RequestMethod.GET)
	public String AjouterMaladie(Model model) {
		model.addAttribute("maladiePlante",new MaladiePlante());
		
		return"AjouterMaladie";
	}

	@RequestMapping(value="/AjouterMaladie",method = RequestMethod.POST)
	public String AjouterMaladie(MaladiePlante m) {
		maladiePlanteRepository.save(m);
		
		return"pageAccueil";
	}
	
	@RequestMapping(value="/index")
	
	public String Page(Model model) {
		List<Image> im = imageRepository.findAll();
		model.addAttribute("image",im);
		return "Accueil";
	}
	
	@RequestMapping(value="/index",produces = MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] index1(Long id) throws FileNotFoundException, IOException {
		File f = new File(imageDir+id);
		
		
		return IOUtils.toByteArray(new FileInputStream(f));
	}
		

}