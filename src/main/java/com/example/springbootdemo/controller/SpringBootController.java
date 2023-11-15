package com.example.springbootdemo.controller;


import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringBootController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "John Doe");
        return "hello";
    }
}

