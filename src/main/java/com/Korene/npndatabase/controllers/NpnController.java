package com.Korene.npndatabase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class NpnController {

    @RequestMapping(value="")
    public String index(Model model){
        model.addAttribute("title", "home");
        return "index";
    }

    @RequestMapping(value = "contact")
    public String contact(Model model) {
        model.addAttribute("title");
        return "category/contact";
    }

    @RequestMapping(value = "about")
    public String about(Model model){
        model.addAttribute("title");
        return "category/about";
    }

    @RequestMapping(value = "home")
    public String home(Model model){
        model.addAttribute("title");
        return "index";
    }
}

