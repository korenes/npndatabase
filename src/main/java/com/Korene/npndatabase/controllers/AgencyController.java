package com.Korene.npndatabase.controllers;


import com.Korene.npndatabase.models.Agency;
import com.Korene.npndatabase.models.data.AgencyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class AgencyController {

    @Autowired
    private AgencyDao agencyDao;

    @RequestMapping(value = "agency")
    public String agency (Model model, @RequestParam int id){
        Agency agency = agencyDao.findById(id).get();

        model.addAttribute("agency", agency);

        return "agency";
    }

}
