package com.ifpb.mapeamento.cenario01;

import com.ifpb.mapeamento.cenario01.Funcionario;
import com.ifpb.mapeamento.cenario01.Projeto;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-02T15:55:08")
@StaticMetamodel(TrabalhaProjeto.class)
public class TrabalhaProjeto_ { 

    public static volatile SingularAttribute<TrabalhaProjeto, LocalDate> dataDeIngressoNoProjeto;
    public static volatile SingularAttribute<TrabalhaProjeto, Projeto> projeto;
    public static volatile SingularAttribute<TrabalhaProjeto, Integer> id;
    public static volatile SingularAttribute<TrabalhaProjeto, Funcionario> funcionario;
    public static volatile SingularAttribute<TrabalhaProjeto, Integer> horasTrabalhadas;

}