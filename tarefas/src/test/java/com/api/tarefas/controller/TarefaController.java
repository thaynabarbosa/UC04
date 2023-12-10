package com.api.tarefas.controller;

import com.api.tarefas.model.Tarefa;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/tarefas")
public class TarefaController {

    //Variaveis auxiliares
    private List<Tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1;

    @PostMapping("")
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa){
        tarefa.setId(proximoId++);
        tarefas.add(tarefa);
        return tarefa;
    }
    
    @GetMapping("")
    public List buscarTarefas(){
        return tarefas;
    }
    
    @GetMapping("/{id}")
    public Tarefa buscarTarefaPorId(@PathVariable int id){
        for(Tarefa tarefa : tarefas){
            if (tarefa.getId() == id){
                return tarefa;
            }
        }
        return null;
    }
   
    @PutMapping("/{id}")
    public Tarefa atualizarTarefa(@PathVariable int id, @RequestBody Tarefa tarefaAtualizada){
        for(int i =0; i< tarefas.size(); i++){
            Tarefa t = tarefas.get(i);
            if(t.getId()==id){
                t.setDescricao(tarefaAtualizada.getDescricao());
                t.setCompleta(tarefaAtualizada.isCompleta());
                return t;
            }
        }
        return null;
    }
    
    @DeleteMapping("/{id}")
    public boolean deletarTarefa(@PathVariable int id){
        for (int i=0; i < tarefas.size(); i++){
            Tarefa tarefa = tarefas.get(i);
            if(tarefa.getId() == id){
                tarefas.remove(i);
                return true;
            }
        }
        return false;
    }
    
}
