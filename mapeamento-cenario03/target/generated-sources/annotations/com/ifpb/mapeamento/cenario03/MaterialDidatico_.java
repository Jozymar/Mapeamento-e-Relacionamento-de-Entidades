package com.ifpb.mapeamento.cenario03;

import com.ifpb.mapeamento.cenario03.TipoMaterialDidatico;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-03T18:14:25")
@StaticMetamodel(MaterialDidatico.class)
public class MaterialDidatico_ { 

    public static volatile SingularAttribute<MaterialDidatico, Long> codigo;
    public static volatile SingularAttribute<MaterialDidatico, TipoMaterialDidatico> tipo;
    public static volatile SingularAttribute<MaterialDidatico, Double> tamanho;
    public static volatile SingularAttribute<MaterialDidatico, String> origem;
    public static volatile SingularAttribute<MaterialDidatico, String> titulo;
    public static volatile SingularAttribute<MaterialDidatico, Date> dataCadastro;
    public static volatile SingularAttribute<MaterialDidatico, String> autor;
    public static volatile SingularAttribute<MaterialDidatico, Boolean> publico;
    public static volatile SingularAttribute<MaterialDidatico, String> descricao;

}