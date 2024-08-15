/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentodeprojetos.dao;

import com.mycompany.gerenciamentodeprojetos.model.Projeto;
import com.mycompany.gerenciamentodeprojetos.model.Tarefa;
import com.mycompany.gerenciamentodeprojetos.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author Felipe Chagas
 */
public class TarefaDAO {
    
    public void salvar(Tarefa tarefa) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(tarefa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void excluir(Tarefa tarefa) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(tarefa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Tarefa> listarTodas() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Tarefa> query = session.createQuery("from Tarefa", Tarefa.class);
            return query.list();
        }
    }
    
    // Método para listar tarefas por projeto
    public List<Tarefa> listarTarefasPorProjeto(Projeto projeto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tarefa> tarefas = null;
        try {
            Query<Tarefa> query = session.createQuery("from Tarefa where projeto = :projeto", Tarefa.class);
            query.setParameter("projeto", projeto);
            tarefas = query.getResultList();
        } finally {
            session.close();
        }
        return tarefas;
    }
}
