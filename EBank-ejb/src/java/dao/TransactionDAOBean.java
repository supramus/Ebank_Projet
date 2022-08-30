/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.TransactionDaoBeanLocal;
import entities.Transaction;
import javax.ejb.Stateless;
/**
 *
 * @author suprm
 */
@Stateless
public class TransactionDAOBean extends GenericDAOBean<Transaction, Integer> implements TransactionDaoBeanLocal {

    public TransactionDAOBean() {
        super(Transaction.class);
    }
    
    
}

