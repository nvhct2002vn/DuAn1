/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class Msgbox {
    public static void alert(Component p,String m){
        JOptionPane.showMessageDialog(p, m, "Hệ thống quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean confirm(Component p, String m){
        int resul = JOptionPane.showConfirmDialog(p, m, "Hệ thống quản lý đào tạo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return resul == JOptionPane.YES_OPTION;
    }
    
    public static String prompt(Component p, String m){
        return JOptionPane.showInputDialog(p, m, "Hệ thống quản lý dào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
}
