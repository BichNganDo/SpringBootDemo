package com.example.hello1.controller;

import com.example.hello1.model.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    private static List<Person> persons = new ArrayList<Person>();
    static {
        persons.add(new Person("Ngan", "Do"));
        persons.add(new Person("Luc", "Tran"));
    }

    @RequestMapping(value = {"/personList"}, method = RequestMethod.GET)
    public String personList(Model model) {
        model.addAttribute("persons", persons);
        return "personList";
    }

    @RequestMapping("/")
    public String welcome(final Model model) {
        model.addAttribute("message", "hello");
        return "index";
    }
}
