/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.iservice;

import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public interface ILichSuGiaoDichService<E, K> {

    List<E> SelectLSGB_ByMaKH(K key);

    List<E> selectBySQL(String sql, Object... args);
}
