/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Articulo_SeccionTienda;
import com.dao.exceptions.NonexistentEntityException;
import com.dao.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author david
 */
public class Articulo_SeccionTiendaJpaController implements Serializable {

    public Articulo_SeccionTiendaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Articulo_SeccionTienda articulo_SeccionTienda) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(articulo_SeccionTienda);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findArticulo_SeccionTienda(articulo_SeccionTienda.getIdArticuloSeccionTienda()) != null) {
                throw new PreexistingEntityException("Articulo_SeccionTienda " + articulo_SeccionTienda + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Articulo_SeccionTienda articulo_SeccionTienda) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            articulo_SeccionTienda = em.merge(articulo_SeccionTienda);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = articulo_SeccionTienda.getIdArticuloSeccionTienda();
                if (findArticulo_SeccionTienda(id) == null) {
                    throw new NonexistentEntityException("The articulo_SeccionTienda with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Articulo_SeccionTienda articulo_SeccionTienda;
            try {
                articulo_SeccionTienda = em.getReference(Articulo_SeccionTienda.class, id);
                articulo_SeccionTienda.getIdArticuloSeccionTienda();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The articulo_SeccionTienda with id " + id + " no longer exists.", enfe);
            }
            em.remove(articulo_SeccionTienda);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Articulo_SeccionTienda> findArticulo_SeccionTiendaEntities() {
        return findArticulo_SeccionTiendaEntities(true, -1, -1);
    }

    public List<Articulo_SeccionTienda> findArticulo_SeccionTiendaEntities(int maxResults, int firstResult) {
        return findArticulo_SeccionTiendaEntities(false, maxResults, firstResult);
    }

    private List<Articulo_SeccionTienda> findArticulo_SeccionTiendaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Articulo_SeccionTienda.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Articulo_SeccionTienda findArticulo_SeccionTienda(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Articulo_SeccionTienda.class, id);
        } finally {
            em.close();
        }
    }

    public int getArticulo_SeccionTiendaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Articulo_SeccionTienda> rt = cq.from(Articulo_SeccionTienda.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
