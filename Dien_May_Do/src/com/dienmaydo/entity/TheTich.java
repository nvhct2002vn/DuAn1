/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienmaydo.entity;

/**
 *
 * @author letha
 */
public class TheTich {

    private String MaTheTich;
    private Float TheTich;

    @Override
    public String toString() {
        return TheTich + " Lít";
    }

    public String getMaTheTich() {
        return MaTheTich;
    }

    public void setMaTheTich(String MaTheTich) {
        this.MaTheTich = MaTheTich;
    }

    public Float getTheTich() {
        return TheTich;
    }

    public void setTheTich(Float TheTich) {
        this.TheTich = TheTich;
    }

}
