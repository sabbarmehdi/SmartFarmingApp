package com.diagnoPlant.Controllers;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.diagnoPlant.Models.Image;
import com.diagnoPlant.Repositorys.ImageRepository;

@Controller
public class ImageController {
	@Autowired
	private ImageRepository imageRepository;

	@Value("${dir.images}")
	private String imageDir;
	
	@RequestMapping(value ="/image",method=RequestMethod.GET)
	public String telechargerImage(Model model) {
		Image mg = new Image();
	  
		model.addAttribute("image",mg );
  
		return"telechargerimage";
	}
	  
	@RequestMapping(value ="/telechargerimage",method=RequestMethod.POST)
	public String validerImage(Image im,@RequestParam(name="photo")MultipartFile file) throws IllegalStateException, IOException {
  
		im.setEtatTraitement(false);
  
		imageRepository.save(im);
		if(!file.isEmpty()) {
			im.setImage(file.getOriginalFilename());
			file.transferTo(new File(imageDir+im.getId()));
	} imageRepository.save(im);
   
	return"telechargerimage";
	}
}


