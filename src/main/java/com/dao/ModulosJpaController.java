/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Modulos;
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
 * @author Ariel
 */
public class ModulosJpaController implements Serializable {

    public ModulosJpaController() {
        this.emf = Persistence.createEntityManagerFactory("DB");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Modulos modulos) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(modulos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findModulos(modulos.getIdModulo()) != null) {
                throw new PreexistingEntityException("Modulos " + modulos + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Modulos modulos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            modulos = em.merge(modulos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = modulos.getIdModulo();
                if (findModulos(id) == null) {
                    throw new NonexistentEntityException("The modulos with id " + id + " no longer exists.");
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
            Modulos modulos;
            try {
                modulos = em.getReference(Modulos.class, id);
                modulos.getIdModulo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The modulos with id " + id + " no longer exists.", enfe);
            }
            em.remove(modulos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Modulos> findModulosEntities() {
        return findModulosEntities(true, -1, -1);
    }

    public List<Modulos> findModulosEntities(int maxResults, int firstResult) {
        return findModulosEntities(false, maxResults, firstResult);
    }

    private List<Modulos> findModulosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Modulos.class));
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

    public Modulos findModulos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Modulos.class, id);
        } finally {
            em.close();
        }
    }

    public int getModulosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Modulos> rt = cq.from(Modulos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
