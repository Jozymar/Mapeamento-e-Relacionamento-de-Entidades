package com.ifpb.mapeamento.cenario01;

import java.time.LocalDate;
import java.time.Month;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author jozimar
 */
public class App {

    public static void main(String[] args) {

        EntityManager em = Persistence
                .createEntityManagerFactory("persistencia")
                .createEntityManager();

        Funcionario funcionarioUm = new Funcionario("João de Sousa", "111.111.111-11", "1.111.111", 10000D);
        Funcionario funcionarioDois = new Funcionario("Maria da Silva", "222.222.222-22", "2.222.222", 15000D);

        Projeto projetoUm = new Projeto("Projeto de DAC", "Tecnologia", LocalDate.now(), LocalDate.of(2018, Month.MARCH, 10));
        Projeto projetoDois = new Projeto("Projeto de Segurança", "Tecnologia", LocalDate.now(), LocalDate.of(2018, Month.JUNE, 30));

        TrabalhaProjeto trabalhaProjetoUm = new TrabalhaProjeto(100, LocalDate.now(), funcionarioUm, projetoUm);
        TrabalhaProjeto trabalhaProjetoDois = new TrabalhaProjeto(200, LocalDate.now(), funcionarioDois, projetoDois);

        funcionarioUm.addProjetos(projetoUm);
        funcionarioDois.addProjetos(projetoDois);

        projetoUm.addFuncionarios(funcionarioUm);
        projetoDois.addFuncionarios(funcionarioDois);

        funcionarioUm.addTrabalhaProjetos(trabalhaProjetoUm);
        funcionarioDois.addTrabalhaProjetos(trabalhaProjetoDois);

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(projetoUm);
        em.persist(projetoDois);
        em.persist(funcionarioUm);
        em.persist(funcionarioDois);
        em.persist(trabalhaProjetoUm);
        em.persist(trabalhaProjetoDois);
        transaction.commit();

    }
}
