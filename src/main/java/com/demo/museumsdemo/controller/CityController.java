package com.demo.museumsdemo.controller;

import com.demo.museumsdemo.model.City;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class CityController {
    @GetMapping(value = "/cityOverviewPage")
    public String cityOverviewPage(Model model) {



        List<City> cityList = List.of(
                new City("Bucuresti", "Romania" , 10),
                new City("Bucuresti", "Romania" , 10),
                new City("Bucuresti", "Romania" , 10),
                new City("Bucuresti", "Romania" , 10)
                );
        model.addAttribute("cityList", cityList);

        return "cityOverviewPage";
    }
}
