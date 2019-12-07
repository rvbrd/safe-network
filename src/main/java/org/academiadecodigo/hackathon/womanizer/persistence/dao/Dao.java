package org.academiadecodigo.hackathon.womanizer.persistence.dao;

import org.academiadecodigo.hackathon.womanizer.persistence.model.Model;

import java.util.List;

public interface Dao<T extends Model> {

    List<T> findAll();
    T findById(Integer id);
    T saveOrUpdate(T t);
    void delete(Integer id);
}
