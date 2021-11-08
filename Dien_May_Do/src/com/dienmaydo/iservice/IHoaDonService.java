package com.dienmaydo.iservice;

import com.dienmaydo.entity.HoaDon;
import java.util.List;

public interface IHoaDonService<E, K> {

    void update(HoaDon entity);

    void delete(K key);

    List<E> selectBySQL(String sqlString, Object... args);

    List<E> selectAll();

    List<E> selectById(K key);
}
