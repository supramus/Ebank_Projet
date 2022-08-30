package entities;

import entities.Agence;
import entities.Client;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-20T14:45:55")
@StaticMetamodel(Compte.class)
public abstract class Compte_ { 

    public static volatile SingularAttribute<Compte, Agence> agence;
    public static volatile SingularAttribute<Compte, Date> dateCreation;
    public static volatile SingularAttribute<Compte, String> numero;
    public static volatile SingularAttribute<Compte, Double> solde;
    public static volatile SingularAttribute<Compte, Client> client;

}