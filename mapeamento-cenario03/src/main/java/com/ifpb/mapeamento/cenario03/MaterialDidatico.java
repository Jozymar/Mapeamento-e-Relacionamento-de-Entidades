package com.ifpb.mapeamento.cenario03;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jozimar
 */
@Entity
@Table(name = "Material")
public class MaterialDidatico implements Serializable {

    @Id
    @Column(nullable = false, length = 45)
    private String origem;

    @Id
    @Column(nullable = false)
    private long codigo;

    @Column(nullable = false, length = 155)
    private String titulo;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;

    @Column(nullable = false, columnDefinition = "Text")
    private String descricao;

    @Column(nullable = false, length = 55)
    private String autor;

    @Column(nullable = false, length = 15)
    @Enumerated(EnumType.STRING)
    private TipoMaterialDidatico tipo;

    @Column(nullable = false)
    private boolean publico;

    @Column(nullable = false, precision = 6, scale = 2)
    private double tamanho;

    public MaterialDidatico() {
    }

    public MaterialDidatico(String origem, long codigo, String titulo, Date dataCadastro, String descricao, String autor, TipoMaterialDidatico tipo, boolean publico, double tamanho) {
        this.origem = origem;
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataCadastro = dataCadastro;
        this.descricao = descricao;
        this.autor = autor;
        this.tipo = tipo;
        this.publico = publico;
        this.tamanho = tamanho;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public TipoMaterialDidatico getTipo() {
        return tipo;
    }

    public void setTipo(TipoMaterialDidatico tipo) {
        this.tipo = tipo;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
