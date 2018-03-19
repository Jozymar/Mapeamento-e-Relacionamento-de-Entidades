package com.ifpb.mapeamento.cenario02;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author jozimar
 */
@Entity
public class Oficina implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Embedded
    private Localizacao localizacao;

    @Column(nullable = false)
    private double saldo;

    @OneToMany
    List<Funcionario> funcionarios;

    @OneToMany(cascade = CascadeType.PERSIST)
    List<Conserto> consertos;

    public Oficina() {
    }

    public Oficina(Localizacao localizacao, double saldo) {
        this.localizacao = localizacao;
        this.saldo = saldo;
        this.funcionarios = new ArrayList<>();
        this.consertos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Conserto> getConsertos() {
        return consertos;
    }

    public void setConsertos(List<Conserto> consertos) {
        this.consertos = consertos;
    }

    public boolean addFuncionario(Funcionario funcionario) {
        return funcionarios.add(funcionario);
    }

    public boolean addConserto(Conserto conserto) {
        return consertos.add(conserto);
    }
}
