package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;
import model.Especie;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-11-09T16:11:50")
@StaticMetamodel(Animal.class)
public class Animal_ { 

    public static volatile SingularAttribute<Animal, Especie> especie;
    public static volatile SingularAttribute<Animal, Integer> idade;
    public static volatile SingularAttribute<Animal, Cliente> cliente;
    public static volatile SingularAttribute<Animal, String> nome;
    public static volatile SingularAttribute<Animal, Integer> id;
    public static volatile SingularAttribute<Animal, String> sexo;

}