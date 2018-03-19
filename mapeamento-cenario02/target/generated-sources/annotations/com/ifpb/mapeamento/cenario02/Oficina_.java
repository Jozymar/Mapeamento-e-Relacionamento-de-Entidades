package com.ifpb.mapeamento.cenario02;

import com.ifpb.mapeamento.cenario02.Conserto;
import com.ifpb.mapeamento.cenario02.Funcionario;
import com.ifpb.mapeamento.cenario02.Localizacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-03T14:51:30")
@StaticMetamodel(Oficina.class)
public class Oficina_ { 

    public static volatile SingularAttribute<Oficina, Localizacao> localizacao;
    public static volatile ListAttribute<Oficina, Conserto> consertos;
    public static volatile SingularAttribute<Oficina, Integer> id;
    public static volatile SingularAttribute<Oficina, Double> saldo;
    public static volatile ListAttribute<Oficina, Funcionario> funcionarios;

}