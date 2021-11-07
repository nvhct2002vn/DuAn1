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
public interface IHoaDonChiTietService<E, K> {

    void selectBySQL(String sqlString, Object... args);

    List<E> selectAll();

}
