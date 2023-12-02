package com.desafioDois.desafiocalculo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MissController {
    
    @GetMapping("/calculos")
    public String calcular(Model model, int valor1, int valor2){
        int soma, subtracao, multiplicacao, divisao;
        soma = valor1 + valor2;
        subtracao = valor1 - valor2;
        multiplicacao = valor1 * valor2;
        divisao = valor1 / valor2;
        model.addAttribute("adicao", soma);
        model.addAttribute("diminuir",subtracao);
        model.addAttribute("multiplicacao",multiplicacao);
        model.addAttribute("divisao",divisao);
        return "calcular";
    }
    
    //localhost:8080/calculos?valor1=5&valor2=8
    
    
    
}
