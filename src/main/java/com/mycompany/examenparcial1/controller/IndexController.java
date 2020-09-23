/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenparcial1.controller;

import com.mycompany.examenparcial1.service.ClienteService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author pablo.suazo1
 */
@Controller
public class IndexController {
    
    @GetMapping("/index")
    public String get(Model model) {
        
        model.addAttribute("clienteList", ClienteService.clienteList);
        return "index";
        
    }
    
}
