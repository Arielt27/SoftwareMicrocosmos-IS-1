/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Parametros;
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
public class ParametrosJpaController implements Serializable {

    public ParametrosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Parametros parametros) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(parametros);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findParametros(parametros.getIdParametros()) != null) {
                throw new PreexistingEntityException("Parametros " + parametros + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Parametros parametros) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            parametros = em.merge(parametros);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = parametros.getIdParametros();
                if (findParametros(id) == null) {
                    throw new NonexistentEntityException("The parametros with id " + id + " no longer exists.");
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
            Parametros parametros;
            try {
                parametros = em.getReference(Parametros.class, id);
                parametros.getIdParametros();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The parametros with id " + id + " no longer exists.", enfe);
            }
            em.remove(parametros);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Parametros> findParametrosEntities() {
        return findParametrosEntities(true, -1, -1);
    }

    public List<Parametros> findParametrosEntities(int maxResults, int firstResult) {
        return findParametrosEntities(false, maxResults, firstResult);
    }

    private List<Parametros> findParametrosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Parametros.class));
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

    public Parametros findParametros(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Parametros.class, id);
        } finally {
            em.close();
        }
    }

    public int getParametrosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Parametros> rt = cq.from(Parametros.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
