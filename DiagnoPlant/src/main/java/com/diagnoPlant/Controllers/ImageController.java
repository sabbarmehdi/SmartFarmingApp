package com.diagnoPlant.Controllers;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.diagnoPlant.Models.Image;
import com.diagnoPlant.Repositorys.ImageRepository;

/**
 * This class used to upload image and store it in a folder 
 * @author lahcen
 *
 */
@Controller
public class ImageController {
	@Autowired
	private ImageRepository imageRepository;

	@Value("${dir.images}")
	private String imageDir;
	
	
	@GetMapping(value ="/image")
	public String telechargerImage(Model model) {
		Image mg = new Image();
		model.addAttribute("image",mg );
  
		return"telechargerimage";
	}
	  
	@PostMapping(value ="/telechargerimage")
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


