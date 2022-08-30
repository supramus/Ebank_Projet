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
public class Agence implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String nomAgence;
    private String telephone;
    
    public Agence() {
    }
    
    public Agence(Long idAgence, String nomAgence, String telephone){
        this.idAgence = idAgence;
        this.nomAgence = nomAgence;
        this.telephone = telephone;
    }
}


