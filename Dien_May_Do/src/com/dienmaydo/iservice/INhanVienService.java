package com.dienmaydo.iservice;

import java.util.List;

public interface INhanVienService<E, K> {

    E selectByID(K key);

    List<E> selectBySql(String sqlString, Object... args);

    List<E> selectAll();
    
    void insertData(E entity);

    void updateData(E entity);

    void deleteData(K key);

    List<E> selectByTimKiem(K key);

    
}
