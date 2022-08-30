/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.GenericDaoBeanLocal;
import dao.local.AgenceDaoBeanLocal;
import entities.Agence;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import services.local.AgenceServiceBeanLocal;


@Stateless
public class AgenceServiceBean extends GenericServiceBean<Agence, Long>
        implements AgenceServiceBeanLocal {

    @EJB
    private AgenceDaoBeanLocal dao;

    private final Logger logger;

    public AgenceServiceBean() {
        this.logger = Logger.getLogger(AgenceServiceBean.class.getName());
    }

    @Override
    protected GenericDaoBeanLocal<Agence, Long> getDAO() {
        return this.dao;
    }

}
