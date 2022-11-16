package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Tratamento;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-11-09T16:11:50")
@StaticMetamodel(Exame.class)
public class Exame_ { 

    public static volatile SingularAttribute<Exame, String> resultado;
    public static volatile SingularAttribute<Exame, Tratamento> tratamento;
    public static volatile SingularAttribute<Exame, Integer> id;
    public static volatile SingularAttribute<Exame, String> descricao;

}