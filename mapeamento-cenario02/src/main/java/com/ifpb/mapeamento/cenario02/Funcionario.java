package com.ifpb.mapeamento.cenario02;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author jozimar
 */
@Entity
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, length = 80)
    private String nome;

    @Column(nullable = false, length = 14)
    private String CPF;

    @Column(nullable = false, length = 10)
    private String RG;

    @Column(nullable = false)
    private double salario;

    @Enumerated(EnumType.STRING)
    private Funcao funcao;

    public Funcionario() {
    }

    public Funcionario(String nome, String CPF, String RG, double salario, Funcao funcao) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.salario = salario;
        this.funcao = funcao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
}
