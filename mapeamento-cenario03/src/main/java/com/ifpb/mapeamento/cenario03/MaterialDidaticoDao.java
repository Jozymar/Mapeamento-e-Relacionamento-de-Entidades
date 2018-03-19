package com.ifpb.mapeamento.cenario03;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author jozimar
 */
public class MaterialDidaticoDao {

    EntityManager em = Persistence
            .createEntityManagerFactory("persistencia")
            .createEntityManager();

    public void salvar(MaterialDidatico materialDidatico) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(materialDidatico);
        transaction.commit();
    }

    public void atualizar(MaterialDidatico materialDidatico) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.merge(materialDidatico);
        transaction.commit();
    }

    public void excluir(MaterialDidatico materialDidatico) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        if (!em.contains(materialDidatico)) {
            materialDidatico = em.merge(materialDidatico);
        }

        em.remove(materialDidatico);
        transaction.commit();
    }

}
