/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.AgenceDaoBeanLocal;
import entities.Agence;
import javax.ejb.Stateless;

/**
 *
 * @author suprm
 */
@Stateless
public class AgenceDAOBean extends GenericDAOBean<Agence, Integer> implements AgenceDaoBeanLocal {

    public AgenceDAOBean() {
        super(Agence.class);
    }
    
    
}
