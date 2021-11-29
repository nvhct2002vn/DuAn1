/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dienmaydo.iservice;

import java.util.List;

/**
 *
 * @author letha
 */
public interface IVaiTroService<E,K> {
    List<E> selectBySql(String sqlString, Object... args);

    List<E> selectAll();
    
    void insertData(E entity);

    void updateData(E entity);

    void deleteData(K key);

    List<E> selectByTimKiem(K key);
}
