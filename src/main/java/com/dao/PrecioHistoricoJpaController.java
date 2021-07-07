/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.PrecioHistorico;
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
public class PrecioHistoricoJpaController implements Serializable {

    public PrecioHistoricoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PrecioHistorico precioHistorico) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(precioHistorico);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPrecioHistorico(precioHistorico.getIdPrecioHistorico()) != null) {
                throw new PreexistingEntityException("PrecioHistorico " + precioHistorico + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PrecioHistorico precioHistorico) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            precioHistorico = em.merge(precioHistorico);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = precioHistorico.getIdPrecioHistorico();
                if (findPrecioHistorico(id) == null) {
                    throw new NonexistentEntityException("The precioHistorico with id " + id + " no longer exists.");
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
            PrecioHistorico precioHistorico;
            try {
                precioHistorico = em.getReference(PrecioHistorico.class, id);
                precioHistorico.getIdPrecioHistorico();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The precioHistorico with id " + id + " no longer exists.", enfe);
            }
            em.remove(precioHistorico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PrecioHistorico> findPrecioHistoricoEntities() {
        return findPrecioHistoricoEntities(true, -1, -1);
    }

    public List<PrecioHistorico> findPrecioHistoricoEntities(int maxResults, int firstResult) {
        return findPrecioHistoricoEntities(false, maxResults, firstResult);
    }

    private List<PrecioHistorico> findPrecioHistoricoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PrecioHistorico.class));
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

    public PrecioHistorico findPrecioHistorico(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PrecioHistorico.class, id);
        } finally {
            em.close();
        }
    }

    public int getPrecioHistoricoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PrecioHistorico> rt = cq.from(PrecioHistorico.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
