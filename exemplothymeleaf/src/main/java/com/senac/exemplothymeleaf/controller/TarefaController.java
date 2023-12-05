package com.senac.exemplothymeleaf.controller;

import com.senac.exemplothymeleaf.model.Tarefa;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TarefaController {
    private List<Tarefa> tarefas = new ArrayList();
    //abaixo criaremos nossos metodos novos
    
    @GetMapping("/exibir-tarefa")
    public String exibirTarefa(Model model){
        //Definindo o valor da variável "nome"
        String nome ="Lucas";
        //Criando uma nova instância da classe "Tarefa" com os valores especificados
        Tarefa tarefa = new Tarefa(1,"Aprender como usar dados dinâmicos com o Thymeleaf", true);
        //Adicionando a variável "nome" ao modelo para ser usada na visualização(view)
        model.addAttribute("nome",nome);
        //Adicionando o objeto "tarefa" ao modelo para ser usado na visualização (view)
        model.addAttribute("tarefa",tarefa);
        //Retornando o nome da visualização (view) que será renderizada
        return "exibir-tarefa";
    }
}
