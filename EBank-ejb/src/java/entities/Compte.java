/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author suprm
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_compte")
public abstract class Compte implements Serializable{
    @Id
    private String numero;
    private double solde;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @ManyToOne 
    private Agence agence; 
    @JoinColumn(name = "id_Client", referencedColumnName = "id_client")
    @ManyToOne
    private Client client;
    
    public Compte(){
    }
    
    public Compte(String numero, double solde, Date dateCreation, Agence agence, Client client){
        this.numero = numero;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.agence = agence; 
        this.client = client;
    }
}
