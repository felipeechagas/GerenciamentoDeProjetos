/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentodeprojetos.service;

import com.mycompany.gerenciamentodeprojetos.dao.TarefaDAO;
import com.mycompany.gerenciamentodeprojetos.model.Projeto;
import com.mycompany.gerenciamentodeprojetos.model.Tarefa;
import java.util.List;

/**
 *
 * @author Felipe Chagas
 */
public class TarefaService {
    
    private TarefaDAO tarefaDAO = new TarefaDAO();

    public void salvar(Tarefa tarefa) {
        tarefaDAO.salvar(tarefa);
    }
    
    public void salvarTarefa(Tarefa tarefa) {
        tarefaDAO.salvar(tarefa);
    }

    public void excluir(Tarefa tarefa) {
        tarefaDAO.excluir(tarefa);
    }

    public List<Tarefa> listarTodas() {
        return tarefaDAO.listarTodas();
    }
    
    public List<Tarefa> listarTarefasPorProjeto(Projeto projeto) {
        return tarefaDAO.listarTarefasPorProjeto(projeto);
    }
}
