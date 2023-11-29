package com.desafioMvc.desafioUmMvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiscController {
    @GetMapping("/paginaUm")
    public String paginaUm(){
        return "paginaU";
    }
    
    @GetMapping("/paginaDois")
    public String paginaDois(){
        return "pagina2";
    }
}
