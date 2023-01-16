package com.example.baitapspring1.controller;

import com.example.baitapspring1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class Home {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/home")
    public String bach(Model model) {
        model.addAttribute("employees", employeeService.getAll());
        return "home";
    }

    @GetMapping("/bach")
    public String bachVip(Model model) {
        model.addAttribute("employees", employeeService.getAll());
        return "home";
    }

}
