/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence. GenerationType;
import javax.persistence.Id;

/**
 *
 * @author suprm
 */

@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String nomClient;
    private String adresse;
    private String telephone;
    
    public Client() {
    }
    
    public Client(Long idClient, String nomClient, String adresse, String telephone){
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.adresse = adresse;
        this.telephone = telephone;
    }
}
