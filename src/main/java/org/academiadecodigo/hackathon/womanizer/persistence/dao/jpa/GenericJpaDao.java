package org.academiadecodigo.hackathon.womanizer.persistence.dao.jpa;

import org.academiadecodigo.hackathon.womanizer.persistence.dao.Dao;
import org.academiadecodigo.hackathon.womanizer.persistence.model.Model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class GenericJpaDao<T extends Model> implements Dao<T> {

    protected Class<T> modelType;

    protected EntityManager em;

    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }

    public GenericJpaDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);
        Root<T> root = criteriaQuery.from(modelType);
        return em.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public T findById(Integer id) {
        return em.find(modelType, id);
    }

    @Override
    public T saveOrUpdate(T t) {
        return em.merge(t);
    }

    @Override
    public void delete(Integer id) {
        em.remove(em.find(modelType, id));
    }
}
