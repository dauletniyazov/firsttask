package com.vistula.firsttask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyFirstController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Vistula, it is my first Spring Controller!";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    //http://localhost:8080/greeting?name=Vistula
}
