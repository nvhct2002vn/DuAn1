package com.dienmaydo.iservice;

import java.util.List;

public interface IHoaDonChiTietService<E, K> {

    List<E> selectBySQL(String sqlString, Object... args);

    List<E> selectById(K key);

}
