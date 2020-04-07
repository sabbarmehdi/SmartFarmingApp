package com.diagnoPlant.controllers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.diagnoPlant.models.Inscription;
import com.diagnoPlant.services.InscriptionService;
import com.diagnoPlant.services.SecurityService;
import com.diagnoPlant.validator.InscriptionValidator;

@Controller
public class InscriptionControleur {
	
    @Autowired
    private InscriptionService inscriptionService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private InscriptionValidator inscriptionValidator;

    @GetMapping("/inscription")
    public String registration(Model model) {
        model.addAttribute("userForm", new Inscription());

        return "inscription";
    }

    @PostMapping("/inscription")
    public String registration(@ModelAttribute("userForm") Inscription userForm, BindingResult bindingResult) {
        inscriptionValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "inscription";
        }

        inscriptionService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }
}
