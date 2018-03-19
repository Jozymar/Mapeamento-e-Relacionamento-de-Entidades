package com.ifpb.mapeamento.cenario02;

import com.ifpb.mapeamento.cenario02.Funcionario;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-03T14:51:30")
@StaticMetamodel(Conserto.class)
public class Conserto_ { 

    public static volatile SingularAttribute<Conserto, Double> valor;
    public static volatile SingularAttribute<Conserto, LocalDate> dataDoConcerto;
    public static volatile SingularAttribute<Conserto, Integer> id;
    public static volatile SingularAttribute<Conserto, Funcionario> funcionario;

}