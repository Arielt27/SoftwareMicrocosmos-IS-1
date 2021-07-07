/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.AreaLaboralHistorica;
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
public class AreaLaboralHistoricaJpaController implements Serializable {

    public AreaLaboralHistoricaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(AreaLaboralHistorica areaLaboralHistorica) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(areaLaboralHistorica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findAreaLaboralHistorica(areaLaboralHistorica.getIdAreaLaboralHistorica()) != null) {
                throw new PreexistingEntityException("AreaLaboralHistorica " + areaLaboralHistorica + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(AreaLaboralHistorica areaLaboralHistorica) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            areaLaboralHistorica = em.merge(areaLaboralHistorica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = areaLaboralHistorica.getIdAreaLaboralHistorica();
                if (findAreaLaboralHistorica(id) == null) {
                    throw new NonexistentEntityException("The areaLaboralHistorica with id " + id + " no longer exists.");
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
            AreaLaboralHistorica areaLaboralHistorica;
            try {
                areaLaboralHistorica = em.getReference(AreaLaboralHistorica.class, id);
                areaLaboralHistorica.getIdAreaLaboralHistorica();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The areaLaboralHistorica with id " + id + " no longer exists.", enfe);
            }
            em.remove(areaLaboralHistorica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<AreaLaboralHistorica> findAreaLaboralHistoricaEntities() {
        return findAreaLaboralHistoricaEntities(true, -1, -1);
    }

    public List<AreaLaboralHistorica> findAreaLaboralHistoricaEntities(int maxResults, int firstResult) {
        return findAreaLaboralHistoricaEntities(false, maxResults, firstResult);
    }

    private List<AreaLaboralHistorica> findAreaLaboralHistoricaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(AreaLaboralHistorica.class));
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

    public AreaLaboralHistorica findAreaLaboralHistorica(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(AreaLaboralHistorica.class, id);
        } finally {
            em.close();
        }
    }

    public int getAreaLaboralHistoricaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<AreaLaboralHistorica> rt = cq.from(AreaLaboralHistorica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
