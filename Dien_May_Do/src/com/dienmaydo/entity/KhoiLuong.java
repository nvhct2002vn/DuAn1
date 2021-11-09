/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienmaydo.entity;

/**
 *
 * @author letha
 */
public class KhoiLuong {

    private String MaKL;
    private float KhoiLuong;
    private String MaDV;

    @Override
    public String toString() {
        return KhoiLuong + " - " + MaDV;
    }

    public String getMaKL() {
        return MaKL;
    }

    public void setMaKL(String MaKL) {
        this.MaKL = MaKL;
    }

    public float getKhoiLuong() {
        return KhoiLuong;
    }

    public void setKhoiLuong(float KhoiLuong) {
        this.KhoiLuong = KhoiLuong;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

}
