/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.AreaLaboral;
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
public class AreaLaboralJpaController implements Serializable {

    public AreaLaboralJpaController() {
        this.emf =  Persistence.createEntityManagerFactory("DB");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(AreaLaboral areaLaboral) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(areaLaboral);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findAreaLaboral(areaLaboral.getIdAreaLaboral()) != null) {
                throw new PreexistingEntityException("AreaLaboral " + areaLaboral + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(AreaLaboral areaLaboral) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            areaLaboral = em.merge(areaLaboral);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = areaLaboral.getIdAreaLaboral();
                if (findAreaLaboral(id) == null) {
                    throw new NonexistentEntityException("The areaLaboral with id " + id + " no longer exists.");
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
            AreaLaboral areaLaboral;
            try {
                areaLaboral = em.getReference(AreaLaboral.class, id);
                areaLaboral.getIdAreaLaboral();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The areaLaboral with id " + id + " no longer exists.", enfe);
            }
            em.remove(areaLaboral);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<AreaLaboral> findAreaLaboralEntities() {
        return findAreaLaboralEntities(true, -1, -1);
    }

    public List<AreaLaboral> findAreaLaboralEntities(int maxResults, int firstResult) {
        return findAreaLaboralEntities(false, maxResults, firstResult);
    }

    private List<AreaLaboral> findAreaLaboralEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(AreaLaboral.class));
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

    public AreaLaboral findAreaLaboral(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(AreaLaboral.class, id);
        } finally {
            em.close();
        }
    }

    public int getAreaLaboralCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<AreaLaboral> rt = cq.from(AreaLaboral.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
