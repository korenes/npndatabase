package com.Korene.npndatabase.controllers;

import com.Korene.npndatabase.models.Agency;
import com.Korene.npndatabase.models.Category;
import com.Korene.npndatabase.models.City;
import com.Korene.npndatabase.models.data.AgencyDao;
import com.Korene.npndatabase.models.data.CategoryDao;
import com.Korene.npndatabase.models.data.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class NpnController {

    @Autowired
    private AgencyDao agencyDao;

    @Autowired
    private CityDao cityDao;

    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping(value={"", "/home"})
    public String index(Model model){
//        model.addAttribute("title", "home");
        Iterable<City> cities = cityDao.findAll();
        model.addAttribute("cities", cities);
        Iterable<Category> categories = categoryDao.findAll();
        model.addAttribute("categories", categories);
        Iterable<Agency> agencies = agencyDao.findAll();
        model.addAttribute("agencies", agencies);

        return "index";

    }

    @RequestMapping(value = "contact")
    public String contact(Model model) {
        model.addAttribute("title");
        return "category/contact";
    }

    @RequestMapping(value = "login")
    public String login(Model model) {
        model.addAttribute("title");

        return "category/login";
    }

    @RequestMapping(value = "about")
    public String about(Model model){
        model.addAttribute("title");
        return "category/about";
    }

    @RequestMapping(value = "add")
    public String add(Model model) {
        model.addAttribute("title");
        return "category/add";

    }



}

