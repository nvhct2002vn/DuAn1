package com.dienmaydo.iservice;

import java.util.List;

public interface IHoaDonService<E, K> {

    void update(E entity);

    void delete(K key);

    void selectBySQL(String sqlString, Object... args);

    List<E> selectAll();

    E selectById(K key);
}

