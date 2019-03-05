package com.Korene.npndatabase.controllers;



import com.Korene.npndatabase.models.Agency;
import com.Korene.npndatabase.models.City;
import com.Korene.npndatabase.models.data.AgencyDao;
import com.Korene.npndatabase.models.data.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityDao cityDao;

    @Autowired
    private AgencyDao agencyDao;

    @RequestMapping(value = "city")
    public String city (Model model, @RequestParam int id){
        City city = cityDao.findById(id).get();

        model.addAttribute("city", city);
        Iterable<Agency> allAgencies = agencyDao.findAll();

        List<Agency> agencies = new ArrayList<Agency>();
        for (Agency agency : allAgencies) {
//            'getCities' is really only getting one city
            if (agency.getCities().getId() == id) {
                agencies.add(agency);
            }
        }

        model.addAttribute("agencies", agencies);
        return "city";
    }

}
