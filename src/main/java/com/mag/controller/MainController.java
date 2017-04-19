package com.mag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;


@Controller
public class MainController {
    @RequestMapping(value = "/admin")
    public ModelAndView Home() {
        ModelAndView modelAndView = new ModelAndView("admin");
        modelAndView.addObject("tytul",modelAndView.getViewName());
        return modelAndView;
    }




}
