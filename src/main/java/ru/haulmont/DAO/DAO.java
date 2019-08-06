package ru.haulmont.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

abstract public class DAO <T extends Serializable> {

    private Class<T> tClass;

    @PersistenceContext
    EntityManager entityManager;

    public final void settClass (Class<T> tClass){
        this.tClass = tClass;
    }

    public T findById(Long id){
        return entityManager.find(tClass, id);
    }
    public List<T> findAll(){
        return entityManager.createQuery("from "+tClass.getName()).getResultList();
    }
    public void create(T entity){
        entityManager.persist(entity);
    }
    public T update(T entity){
        return entityManager.merge(entity);
    }
    public void delete(T entity) {
        entityManager.remove(entity);
    }
    public void deleteById(Long id){
        T entity = findById(id);
        delete(entity);
    }
}
