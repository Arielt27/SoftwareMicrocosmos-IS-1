/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.TipoDePago;
import com.dao.exceptions.NonexistentEntityException;
import com.dao.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author david
 */
public class TipoDePagoJpaController implements Serializable {

    public TipoDePagoJpaController() {
        this.emf =  Persistence.createEntityManagerFactory("DB");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoDePago tipoDePago) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoDePago);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTipoDePago(tipoDePago.getIdTipoDePago()) != null) {
                throw new PreexistingEntityException("TipoDePago " + tipoDePago + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoDePago tipoDePago) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoDePago = em.merge(tipoDePago);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = tipoDePago.getIdTipoDePago();
                if (findTipoDePago(id) == null) {
                    throw new NonexistentEntityException("The tipoDePago with id " + id + " no longer exists.");
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
            TipoDePago tipoDePago;
            try {
                tipoDePago = em.getReference(TipoDePago.class, id);
                tipoDePago.getIdTipoDePago();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoDePago with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoDePago);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoDePago> findTipoDePagoEntities() {
        return findTipoDePagoEntities(true, -1, -1);
    }

    public List<TipoDePago> findTipoDePagoEntities(int maxResults, int firstResult) {
        return findTipoDePagoEntities(false, maxResults, firstResult);
    }

    private List<TipoDePago> findTipoDePagoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoDePago.class));
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

    public TipoDePago findTipoDePago(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoDePago.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoDePagoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoDePago> rt = cq.from(TipoDePago.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
