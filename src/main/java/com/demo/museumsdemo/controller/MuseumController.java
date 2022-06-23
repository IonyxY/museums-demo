package com.demo.museumsdemo.controller;

import com.demo.museumsdemo.model.Museum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class MuseumController {
    @GetMapping(value = "/museumOverviewPage")
    public String museumOverviewPage(Model model) {



        List<Museum> museumList = List.of(
                new Museum("Muzeul National de Arta", "Calea Victoriei 49-53" , 80000, "arta", "Bucuresti" )


                );
        model.addAttribute("museumList", museumList);

        return "museumOverviewPage";
    }
}
