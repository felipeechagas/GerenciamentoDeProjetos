/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentodeprojetos.controller;

import com.mycompany.gerenciamentodeprojetos.dao.ProjetoDAO;
import com.mycompany.gerenciamentodeprojetos.model.Projeto;
import com.mycompany.gerenciamentodeprojetos.service.ProjetoService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Felipe Chagas
 */

@ManagedBean(name = "projetoController")
@SessionScoped
public class ProjetoController {
    
    private ProjetoService projetoService = new ProjetoService();
    private Projeto projeto = new Projeto();
    private List<Projeto> projetos;

    public String novoProjeto() {
        this.projeto = new Projeto();
        return "/projeto/novoProjeto.xhtml?faces-redirect=true";
    }

    public String salvarProjeto() {
        projetoService.salvar(projeto);
        return "/projeto/listarProjetos.xhtml?faces-redirect=true";
    }

    public String editarProjeto(Projeto projeto) {
        this.projeto = projeto;
        return "/projeto/novoProjeto.xhtml?faces-redirect=true";
    }

    public void excluirProjeto(Projeto projeto) {
        projetoService.excluir(projeto);
    }

    public List<Projeto> getProjetos() {
        return projetoService.listarTodos();
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
