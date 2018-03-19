package com.ifpb.mapeamento.cenario01;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author jozimar
 */
@Entity
public class TrabalhaProjeto implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private int horasTrabalhadas;

    @Convert(converter = LocalDateConverter.class)
    private LocalDate dataDeIngressoNoProjeto;

    @ManyToOne
    private Funcionario funcionario;

    @ManyToOne
    private Projeto projeto;

    public TrabalhaProjeto() {
    }

    public TrabalhaProjeto(int horasTrabalhadas, LocalDate dataDeIngressoNoProjeto, Funcionario funcionario, Projeto projeto) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataDeIngressoNoProjeto = dataDeIngressoNoProjeto;
        this.funcionario = funcionario;
        this.projeto = projeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public LocalDate getDataDeIngressoNoProjeto() {
        return dataDeIngressoNoProjeto;
    }

    public void setDataDeIngressoNoProjeto(LocalDate dataDeIngressoNoProjeto) {
        this.dataDeIngressoNoProjeto = dataDeIngressoNoProjeto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
