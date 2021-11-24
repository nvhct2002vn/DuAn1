package com.dienmaydo.iservice;

import java.util.List;

public interface ITrangThaiThanhToanService<E, K> {

    List<E> selectBySQL(String sql, Object... args);

    List<E> selectAll();
}
