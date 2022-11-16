package model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Animal;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-11-09T16:11:50")
@StaticMetamodel(Tratamento.class)
public class Tratamento_ { 

    public static volatile SingularAttribute<Tratamento, LocalDate> dataHoraInicial;
    public static volatile SingularAttribute<Tratamento, Animal> animal;
    public static volatile SingularAttribute<Tratamento, Integer> id;
    public static volatile SingularAttribute<Tratamento, LocalDate> dataHoraFinal;
    public static volatile SingularAttribute<Tratamento, String> sintomas;
    public static volatile SingularAttribute<Tratamento, String> descricao;

}