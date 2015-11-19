/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Usuarios;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author migueljimenez
 */
@Stateless
public class UsuariosFacade extends AbstractFacade<Usuarios> {

    @PersistenceContext(unitName = "MaderasGustavoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosFacade() {
        super(Usuarios.class);
    }
    
    public boolean ValidarUsuario(Usuarios user)
    {
        boolean valido = false;
        TypedQuery<Usuarios> query = em.createNamedQuery("Usuarios.findByUsuario", Usuarios.class);
        
        query.setParameter ("usuario", user.getUsuario());
        
        List<Usuarios> results = query.getResultList();
        
        return results.get(0).getClave().equals(user.getClave());        
    }
}
