package com.dienmaydo.iservice;

import java.util.List;

public interface IHoaDonService<E, K> {
    
    void insert(E entity);
    
    void update(E entity);

    List<E> selectBySQL(String sqlString, Object... args);

    List<E> selectAll();

    E selectById(K key);
    
    List<E> selectByTimKiem(K key);
    
    List<E> selectByHDChoThanhToan();
}
