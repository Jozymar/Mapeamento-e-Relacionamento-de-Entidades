package com.ifpb.mapeamento.cenario02;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author jozimar
 */
public class ConsertoDao {

    EntityManager em = Persistence
            .createEntityManagerFactory("persistencia")
            .createEntityManager();

    public void salvar(Conserto conserto) {
        EntityTransaction transaction = em.getTransaction();
        em.persist(conserto);
    }

    public void excluir(Conserto conserto) {
        EntityTransaction transaction = em.getTransaction();
        em.remove(conserto);
    }
}
