package com.ifpb.mapeamento.cenario02;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author jozimar
 */
@Embeddable
public class Localizacao implements Serializable {

    private String rua;
    private String bairro;
    private String cidade;

    public Localizacao() {
    }

    public Localizacao(String rua, String bairro, String cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
