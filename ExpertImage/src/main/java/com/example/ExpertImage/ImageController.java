package com.example.ExpertImage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ImageController {

	@GetMapping("/formulaireImage")
	public String formulaireImage (@RequestParam ("im")String im,Model model) {
		model.addAttribute("im", im);
		return "formulaireImage";
	}
    
	@GetMapping("/pageAccueil")
	public String pageAccueil(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "pageAccueil";
	}
}