package com.example.hello1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping
    public String welcome(final Model model) {
        model.addAttribute("message", "hello");
        return "index";
    }
}
