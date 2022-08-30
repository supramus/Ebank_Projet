/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.local;

import dao.GenericDaoBeanLocal;
import entities.Agence;
import javax.ejb.Local;

/**
 *
 * @author suprm
 */
@Local
public interface AgenceDaoBeanLocal extends GenericDaoBeanLocal<Agence, Integer> {
    
}
