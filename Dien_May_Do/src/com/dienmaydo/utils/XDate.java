/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MSI
 */
public class XDate {
     static SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");

    public static Date toDate(String date) {
        try {
            return formater.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toString(Date date) {
        return formater.format(date);
    }

    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 100);
        return date;
    }
}
