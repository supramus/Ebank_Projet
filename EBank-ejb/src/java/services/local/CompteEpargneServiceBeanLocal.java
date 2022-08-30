/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.local;

import entities.CompteEpargne;
import javax.ejb.Local;
import services.GenericServiceBeanLocal;

/**
 *
 * @author suprm
 */
@Local
public interface CompteEpargneServiceBeanLocal extends GenericServiceBeanLocal<CompteEpargne, Integer> {
    
}
