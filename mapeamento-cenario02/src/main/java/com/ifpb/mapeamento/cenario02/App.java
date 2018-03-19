package com.ifpb.mapeamento.cenario02;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author jozimar
 */
public class App {

    public static void main(String[] args) {

        Localizacao localizacao = new Localizacao("Pedras Pretas", "Zona Rural", "Cachoeira dos Índios");

        Funcionario funcionarioEmp = new Funcionario("João", "111.111.111.11", "1.111.111", 1000D, Funcao.EMPREGADO);
        Funcionario funcionarioGer = new Funcionario("Pedro", "222.222.222.22", "2.222.222", 3000D, Funcao.GERENTE);

        Conserto conserto = new Conserto(500D, LocalDate.now(), funcionarioEmp);

        Oficina oficina = new Oficina(localizacao, 1000000D);
        oficina.addFuncionario(funcionarioGer);
        oficina.addFuncionario(funcionarioEmp);
        oficina.addConserto(conserto);

        EntityManager em = Persistence
                .createEntityManagerFactory("persistencia")
                .createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(funcionarioEmp);
        em.persist(funcionarioGer);
        em.persist(oficina);
        transaction.commit();

        ConsertoDao consertoDao = new ConsertoDao();
        consertoDao.salvar(conserto);
    }

}
