package com.miage.altea.tp.pokemon_ui.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller

public class IndexController {

    @GetMapping(value = "/")
    public String index(){
        return "index";
    }

    @PostMapping(value = "/registerTrainer")
    ModelAndView registerNewTrainer(@RequestParam String trainerName){
        return new ModelAndView("register", Map.of("name",trainerName));

    }
}