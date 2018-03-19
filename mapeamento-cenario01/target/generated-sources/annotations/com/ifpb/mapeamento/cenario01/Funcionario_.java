package com.ifpb.mapeamento.cenario01;

import com.ifpb.mapeamento.cenario01.Projeto;
import com.ifpb.mapeamento.cenario01.TrabalhaProjeto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-02T15:55:08")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile ListAttribute<Funcionario, TrabalhaProjeto> trabalhaProjetos;
    public static volatile SingularAttribute<Funcionario, String> RG;
    public static volatile SingularAttribute<Funcionario, Double> salario;
    public static volatile SingularAttribute<Funcionario, String> CPF;
    public static volatile ListAttribute<Funcionario, Projeto> projetos;
    public static volatile SingularAttribute<Funcionario, String> nome;
    public static volatile SingularAttribute<Funcionario, Integer> id;

}