package com.ifpb.mapeamento.cenario01;

import com.ifpb.mapeamento.cenario01.Funcionario;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-02T15:55:08")
@StaticMetamodel(Projeto.class)
public class Projeto_ { 

    public static volatile SingularAttribute<Projeto, String> area;
    public static volatile SingularAttribute<Projeto, LocalDate> dataDeConclusao;
    public static volatile SingularAttribute<Projeto, LocalDate> dataDeInicio;
    public static volatile SingularAttribute<Projeto, Integer> id;
    public static volatile ListAttribute<Projeto, Funcionario> funcionarios;
    public static volatile SingularAttribute<Projeto, String> descricao;

}