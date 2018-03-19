package com.ifpb.mapeamento.cenario01;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

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

    @ManyToMany
    private List<Projeto> projetos;

    @OneToMany(mappedBy = "funcionario")
    private List<TrabalhaProjeto> trabalhaProjetos;

    public Funcionario() {
    }

    public Funcionario(String nome, String CPF, String RG, double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.salario = salario;
        this.projetos = new ArrayList<>();
        this.trabalhaProjetos = new ArrayList<>();
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

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    public List<TrabalhaProjeto> getTrabalhaProjetos() {
        return trabalhaProjetos;
    }

    public void setTrabalhaProjetos(List<TrabalhaProjeto> trabalhaProjetos) {
        this.trabalhaProjetos = trabalhaProjetos;
    }

    public boolean addTrabalhaProjetos(TrabalhaProjeto trabalhaProjeto) {
        return trabalhaProjetos.add(trabalhaProjeto);
    }

    public boolean addProjetos(Projeto projeto) {
        return projetos.add(projeto);
    }
}
