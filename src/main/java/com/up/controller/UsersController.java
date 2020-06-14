package com.up.controller;

import com.up.entity.Users;
import com.up.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    @RequestMapping("/all")
    public List<Users> getAll(){
       return usersService.getAllUsers();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/validate")
    @ResponseBody
    public String validate(String username,String password){
        boolean b=usersService.validateUser(username,password);
        usersService.getAllUsers();
        if (b){
            return "登录成功！";
        }else {
            return "登录失败！";
        }
    }
}
