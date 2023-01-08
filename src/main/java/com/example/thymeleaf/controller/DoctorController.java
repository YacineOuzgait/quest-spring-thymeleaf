package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor/")
    public String doctor(
        @RequestParam(required = false, defaultValue = "0") int number,
        @RequestParam(required = false, defaultValue = "John Smith") String name,
        Model model
        ) 
    {
        String nameDoctor = name;
        model.addAttribute("name", nameDoctor);

        int numberDoctor = number;
        model.addAttribute("number", numberDoctor);

        return "doctor";
    }
}
