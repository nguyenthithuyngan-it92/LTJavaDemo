/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttn.controllers;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model) {
        List<String> categories = new ArrayList<>();
        categories.add("Mobile");
        categories.add("Tablet");
        categories.add("Desktop");
        
        model.addAttribute("categories", categories);
        
        List<String> products = new ArrayList<>();
        products.add("iPhone 11 Pro");
        products.add("iPhone 12 ");
        products.add("iPad Pro");
        products.add("Galaxy Note 7");
        products.add("iPhone X");
        
        model.addAttribute("products", products);
        
        return "index";
    }
}
