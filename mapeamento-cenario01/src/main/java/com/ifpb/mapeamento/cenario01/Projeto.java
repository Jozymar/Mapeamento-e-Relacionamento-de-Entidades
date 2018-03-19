package com.ifpb.mapeamento.cenario01;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author jozimar
 */
@Entity
public class Projeto implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, length = 80)
    private String descricao;

    @Column(nullable = false, length = 80)
    private String area;

    @Convert(converter = LocalDateConverter.class)
    private LocalDate dataDeInicio;

    @Convert(converter = LocalDateConverter.class)
    private LocalDate dataDeConclusao;

    @ManyToMany(mappedBy = "projetos")
    private List<Funcionario> funcionarios;

    public Projeto() {
    }

    public Projeto(String descricao, String area, LocalDate dataDeInicio, LocalDate dataDeConclusao) {
        this.descricao = descricao;
        this.area = area;
        this.dataDeInicio = dataDeInicio;
        this.dataDeConclusao = dataDeConclusao;
        this.funcionarios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(LocalDate dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public LocalDate getDataDeConclusao() {
        return dataDeConclusao;
    }

    public void setDataDeConclusao(LocalDate dataDeConclusao) {
        this.dataDeConclusao = dataDeConclusao;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public boolean addFuncionarios(Funcionario funcionario) {
        return funcionarios.add(funcionario);
    }
}
