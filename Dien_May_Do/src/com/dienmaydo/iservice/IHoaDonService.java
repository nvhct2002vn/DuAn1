package com.dienmaydo.iservice;

import java.util.List;

public interface IHoaDonService<E, K> {
    
    void insert(E entity);
    
    void update(E entity);

    void delete(K key);

    List<E> selectBySQL(String sqlString, Object... args);

    List<E> selectAll();

    List<E> selectById(K key);
}
