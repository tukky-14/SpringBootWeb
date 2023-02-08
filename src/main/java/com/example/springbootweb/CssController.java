package com.example.springbootweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CssController {

    @RequestMapping("/css")
    public String sample(Model model) {

        return "css";
    }
}