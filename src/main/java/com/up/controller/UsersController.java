package com.up.controller;

import com.up.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

    @Autowired
    UsersService usersService;

    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }

    @RequestMapping("/new")
    public ModelAndView add(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("login");
        modelAndView.addObject("nums",100);
        return modelAndView;
    }

    @RequestMapping("login")
    public String getUser(){
       return "success";
    }
}
