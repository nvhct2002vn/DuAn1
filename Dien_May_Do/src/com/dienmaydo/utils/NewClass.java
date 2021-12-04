/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author DO TAT HOA
 */
public class NewClass {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String date2 = s.format(date);
        System.out.println(date2);
        Date dateFormat = s.parse(date2);
        System.out.println(dateFormat);
    }
}
