/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentodeprojetos.controller;

import com.mycompany.gerenciamentodeprojetos.model.Projeto;
import com.mycompany.gerenciamentodeprojetos.model.Tarefa;
import com.mycompany.gerenciamentodeprojetos.service.TarefaService;
import java.util.List;
import javax.faces.bean.*;


/**
 *
 * @author Felipe Chagas
 */

@ManagedBean(name = "tarefaController")
@ViewScoped
public class TarefaController {
    private TarefaService tarefaService = new TarefaService();
    private Tarefa tarefa = new Tarefa();
    private List<Tarefa> tarefas;

    public String novaTarefa() {
        this.tarefa = new Tarefa();
        return "/tarefa/novaTarefa.xhtml?faces-redirect=true";
    }
    
    public void carregarTarefas(Projeto projeto) {
        this.tarefas = tarefaService.listarTarefasPorProjeto(projeto);
    }

    public String salvarTarefa() {
        tarefaService.salvar(tarefa);
        return "/tarefa/listarTarefas.xhtml?faces-redirect=true";
    }
    
    public void salvarTarefa(Projeto projeto) {
        tarefa.setProjeto(projeto);
        tarefaService.salvarTarefa(tarefa);
        tarefa = new Tarefa(); // Limpar formulário após salvar
    }

    public String editarTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
        return "/tarefa/novaTarefa.xhtml?faces-redirect=true";
    }

    public void excluirTarefa(Tarefa tarefa) {
        tarefaService.excluir(tarefa);
    }

    public List<Tarefa> getTarefas() {
        return tarefaService.listarTodas();
    }
    
    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
}
