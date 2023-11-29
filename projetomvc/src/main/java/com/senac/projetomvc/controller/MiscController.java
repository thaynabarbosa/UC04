package com.senac.projetomvc.controller;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiscController {
    @GetMapping("/ola")
    public String mostraSaudacao(){
        return "saudacao";
    }
    
    @GetMapping("/diahora")
    public String mostraDiaHora(Model model){
        LocalDateTime diaHora = LocalDateTime.now();
        model.addAttribute("dataHora",diaHora.toString());
        return "data";
    }
}
