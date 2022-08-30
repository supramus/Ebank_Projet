/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.CompteCourantDAOBeanLocal;
import entities.CompteCourant;
import javax.ejb.Stateless;
/**
 *
 * @author suprm
 */
@Stateless
public class CompteCourantDAOBean extends GenericDAOBean<CompteCourant, Integer> implements CompteCourantDAOBeanLocal {

    public CompteCourantDAOBean() {
        super(CompteCourant.class);
    }
    
    
}
