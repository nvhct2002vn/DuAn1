/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.iservice;

import java.util.List;

/**
 *
 * @author DO TAT HOA
 */
public interface IKhachHangService<E, K> {
    void insertData(E entity);

    void updateData(E entity);

    void deleteData(K key);

    List<E> selectAll();
    
    List<E> selectByLSGD(K key);

    E selectByID(K key);

    List<E> selectBySQL(String sql, Object... args);
   
    List<E> selectByTimKiem(K key);
    
    List<E> selectBySdt(K key);
    
}
