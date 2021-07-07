/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.SeccionTienda;
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
public class SeccionTiendaJpaController implements Serializable {

    public SeccionTiendaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(SeccionTienda seccionTienda) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(seccionTienda);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSeccionTienda(seccionTienda.getIdSeccionTienda()) != null) {
                throw new PreexistingEntityException("SeccionTienda " + seccionTienda + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(SeccionTienda seccionTienda) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            seccionTienda = em.merge(seccionTienda);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = seccionTienda.getIdSeccionTienda();
                if (findSeccionTienda(id) == null) {
                    throw new NonexistentEntityException("The seccionTienda with id " + id + " no longer exists.");
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
            SeccionTienda seccionTienda;
            try {
                seccionTienda = em.getReference(SeccionTienda.class, id);
                seccionTienda.getIdSeccionTienda();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The seccionTienda with id " + id + " no longer exists.", enfe);
            }
            em.remove(seccionTienda);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<SeccionTienda> findSeccionTiendaEntities() {
        return findSeccionTiendaEntities(true, -1, -1);
    }

    public List<SeccionTienda> findSeccionTiendaEntities(int maxResults, int firstResult) {
        return findSeccionTiendaEntities(false, maxResults, firstResult);
    }

    private List<SeccionTienda> findSeccionTiendaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(SeccionTienda.class));
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

    public SeccionTienda findSeccionTienda(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(SeccionTienda.class, id);
        } finally {
            em.close();
        }
    }

    public int getSeccionTiendaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<SeccionTienda> rt = cq.from(SeccionTienda.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
