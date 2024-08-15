/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentodeprojetos.service;

import com.mycompany.gerenciamentodeprojetos.dao.ProjetoDAO;
import com.mycompany.gerenciamentodeprojetos.model.Projeto;
import java.util.List;

/**
 *
 * @author Felipe Chagas
 */
public class ProjetoService {
    
    private ProjetoDAO projetoDAO = new ProjetoDAO();

    public void salvar(Projeto projeto) {
        projetoDAO.salvar(projeto);
    }

    public void excluir(Projeto projeto) {
        projetoDAO.excluir(projeto);
    }

    public List<Projeto> listarTodos() {
        return projetoDAO.listarTodos();
    }
}
