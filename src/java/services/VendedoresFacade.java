/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Vendedores;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author migueljimenez
 */
@Stateless
public class VendedoresFacade extends AbstractFacade<Vendedores> {

    @PersistenceContext(unitName = "MaderasGustavoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VendedoresFacade() {
        super(Vendedores.class);
    }
    
}
