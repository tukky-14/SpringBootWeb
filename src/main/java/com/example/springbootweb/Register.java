package com.example.springbootweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.springbootweb.model.ModelTest;

@Controller
public class Register {

  @RequestMapping("/")
  public String start() {
    return "input.html";
  }

  @RequestMapping("/register")
  public ModelAndView register(@ModelAttribute RegisterBean rb, ModelAndView m) {
    m.addObject("rb", rb);
    m.setViewName("register.html");
    return m;
  }

  @PostMapping("/result")
  public ModelAndView test(@ModelAttribute ModelTest modelTest, ModelAndView m) {
    StringBuilder teststr = new StringBuilder();
    teststr.append("name" + modelTest.getName());
    teststr.append("age" + modelTest.getName());
    teststr.append("remarks" + modelTest.getName());

    m.setViewName("result");
    m.addObject("resultData", teststr.toString());
    return m;
  }
}
