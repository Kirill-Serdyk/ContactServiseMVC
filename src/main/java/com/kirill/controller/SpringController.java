package com.kirill.controller;

import com.kirill.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Kirill on 10.01.2016.
 */

@Controller
@RequestMapping("/")
public class SpringController {

//    @Autowired
//    ContactService contactService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex(){
        System.out.println("SpringController");
        return "index";
    }
}