package com.dienmaydo.iservice;

import java.util.List;

public interface IHinhThucGiaoHangService<E, K> {

    List<E> selectBySQL(String sql, Object... args);

    List<E> selectAll();
}
