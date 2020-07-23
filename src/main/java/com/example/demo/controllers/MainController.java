package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Логово батраков");
        return "home";
    }



    @GetMapping("/challonge")
    public String challonge(Model model) {
        model.addAttribute("title", "Турниры");
        return "challonge";
    }


    @GetMapping("/about-us")
    public String aboutus(Model model) {
        model.addAttribute("title", "О нас");
        return "about";
    }

    @GetMapping("/donations")
    public String donations(Model model) {
        model.addAttribute("title", "Поддержка");
        return "donate";
    }

    @GetMapping("/license")
    public String license(Model model) {
        model.addAttribute("title", "Поддержка");
        return "license";
    }

}