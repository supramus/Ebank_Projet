
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.local;

import dao.GenericDaoBeanLocal;
import entities.Client;
import javax.ejb.Local;

/**
 *
 * @author Nolhan
 */
@Local
public interface ClientDaoBeanLocal extends GenericDaoBeanLocal<Client, Long>{
    
}
