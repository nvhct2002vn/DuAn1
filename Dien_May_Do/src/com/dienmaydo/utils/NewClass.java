/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.utils;

import java.util.Date;

/**
 *
 * @author DO TAT HOA
 */
public class NewClass {

    public static void main(String[] args) {
        Date hienTai = XDate.toDate("2021-12-04");
        Date batDau = XDate.toDate("2021-12-04");
        Date ketThuc = XDate.toDate("2021-12-10");
        
        if (hienTai.before(ketThuc)) {
            System.out.println("Còn hoạt đọng");
        }else{
            System.out.println("Không hoạt động");
        }
    }
}
