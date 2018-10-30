package com.alexpinilla.thymeleaf.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class PetitionsController {
    @GetMapping("/request")
    public ModelAndView request(@RequestParam(name="name") String name, @RequestParam(name="edad") int edad){
        System.out.println("Recibido " + name +" de "+ edad +" años");
        ModelAndView mav = new ModelAndView("request");
        mav.addObject("user", name);
        return mav;
    }
}
