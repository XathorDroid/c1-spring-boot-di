package com.xathordroid.c1springbootdi.controllers;

import com.xathordroid.c1springbootdi.models.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @Autowired
    @Qualifier("mySimpleService")
    private IService myService;
    
    @GetMapping({ "", "/", "/index" })
    public String index(Model model) {
        model.addAttribute("object", myService.randomFunction());
        return "index";
    }
}
