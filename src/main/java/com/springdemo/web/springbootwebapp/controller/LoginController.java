package com.springdemo.web.springbootwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {
    
    @RequestMapping(value="/", method = RequestMethod.GET )
    public String showLogin() {
        return "home";
    
    }

    @RequestMapping(value = "/submitlogin", method = RequestMethod.POST)
    public String validateUser(ModelMap model , @RequestParam String inputUser) {
        model.put("name",inputUser);
        return "welcome";
    }
}
