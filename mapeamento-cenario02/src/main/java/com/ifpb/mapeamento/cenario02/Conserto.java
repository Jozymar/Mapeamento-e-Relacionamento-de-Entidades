package com.ifpb.mapeamento.cenario02;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author jozimar
 */
@Entity
public class Conserto implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private double valor;

    @Convert(converter = LocalDateConverter.class)
    private LocalDate dataDoConserto;

    @OneToOne
    private Funcionario funcionario;

    public Conserto() {
    }

    public Conserto(double valor, LocalDate dataDoConserto, Funcionario funcionario) {
        this.valor = valor;
        this.dataDoConserto = dataDoConserto;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataDoConserto() {
        return dataDoConserto;
    }

    public void setDataDoConserto(LocalDate dataDoConserto) {
        this.dataDoConserto = dataDoConserto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
