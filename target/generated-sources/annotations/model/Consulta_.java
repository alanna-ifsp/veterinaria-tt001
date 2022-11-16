package model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Tratamento;
import model.Veterinario;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-11-09T16:11:50")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, Veterinario> veterinario;
    public static volatile SingularAttribute<Consulta, Tratamento> tratamento;
    public static volatile SingularAttribute<Consulta, Integer> id;
    public static volatile SingularAttribute<Consulta, LocalDate> dataInicial;
    public static volatile SingularAttribute<Consulta, LocalDate> dataFinal;

}