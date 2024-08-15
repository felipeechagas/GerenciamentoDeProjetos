/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentodeprojetos.model;

import javax.persistence.*;

/**
 *
 * @author Felipe Chagas
 */

@Entity
public class Tarefa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    private int estimativaHoras;

    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;
    
    enum Prioridade {
    MUITO_ALTA,
    ALTA,
    BAIXA,
    MUITO_BAIXA
}

    // Getters e Setters

    public Tarefa() {
    }

    public Tarefa(Long id, String titulo, String descricao, Prioridade prioridade, int estimativaHoras, Projeto projeto) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.estimativaHoras = estimativaHoras;
        this.projeto = projeto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public int getEstimativaHoras() {
        return estimativaHoras;
    }

    public void setEstimativaHoras(int estimativaHoras) {
        this.estimativaHoras = estimativaHoras;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    
    
}
