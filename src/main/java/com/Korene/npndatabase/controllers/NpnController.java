package com.Korene.npndatabase.controllers;

import com.Korene.npndatabase.models.Agency;
import com.Korene.npndatabase.models.data.AgencyDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("npndatabase")
public class NpnController {
    private AgencyDao agencyDao;

    @RequestMapping(value="")
    public String index(Model model){
//        model.addAttribute("title", "home");
        Iterable<Agency> agencies = agencyDao.findAll();
        System.out.println(agencies);
        model.addAttribute("agencies", agencies);

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
    public String home(){
        return "index";
    }
}

