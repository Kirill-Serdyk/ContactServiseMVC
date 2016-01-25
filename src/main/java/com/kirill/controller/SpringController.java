package com.kirill.controller;

import com.kirill.model.Contact;
import com.kirill.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.security.krb5.internal.MethodData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Kirill on 10.01.2016.
 */

@Controller
@RequestMapping("/")
public class SpringController {

    @Autowired
    ContactService contactService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex(ModelMap modelMap){
        modelMap.addAttribute("contacts", contactService.getAllContacts());
        return "index";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String showNew(){
        return "new";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String addNew(ModelMap modelMap, String name, String phone, String email){
        Contact contact = new Contact();
        contact.setName(name);
        contact.setPhone(phone);
        contact.setEmail(email);
        contactService.addContact(contact);

        modelMap.addAttribute("contacts", contactService.getAllContacts());

        return "index";
    }

    @RequestMapping(value = "/dellete", method = RequestMethod.POST)
    public String dellete(ModelMap modelMap, String submit){
        Contact contact = new Contact();
        contact.setName("name");
        contact.setPhone("phone");
        contact.setEmail(submit);

        contactService.deleteContact(contact);
        modelMap.addAttribute("contacts", contactService.getAllContacts());
        return "index";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String updateIn (ModelMap modelMap, String submit){
        Contact contact = contactService.getContact(submit);
        modelMap.addAttribute("contact", contact);
        return "update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateOn (ModelMap modelMap, String name, String phone, String email){
        contactService.update(name, phone, email);

        modelMap.addAttribute("contacts", contactService.getAllContacts());
        return "index";
    }
}