package com.dienmaydo.iservice;

import java.util.List;

public interface IHoaDonChiTietService<E, K> {

    void insert(E entity);

    void delete(K key);

    void update(E entity);

    List<E> selectBySQL(String sqlString, Object... args);

    List<E> selectById(K key);
    
    List<E> selectAll();

}
