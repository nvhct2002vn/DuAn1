/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienmaydo.entity;

import java.awt.Checkbox;

public class SanPham {

    private String MaSp;
    private String TenSp;
    private String MaDanhMuc;
    private String TenDanhMuc;
    private String NhaSX;
    private String NuocSX;
    private int MaXX;
    private boolean trangThaiSP;
    private Checkbox select;

    @Override
    public String toString() {
        return TenSp;
    }

    public String getMaSp() {
        return MaSp;
    }

    public void setMaSp(String MaSp) {
        this.MaSp = MaSp;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public String getMaDanhMuc() {
        return MaDanhMuc;
    }

    public void setMaDanhMuc(String MaDanhMuc) {
        this.MaDanhMuc = MaDanhMuc;
    }

    public String getTenDanhMuc() {
        return TenDanhMuc;
    }

    public void setTenDanhMuc(String TenDanhMuc) {
        this.TenDanhMuc = TenDanhMuc;
    }

    public String getNhaSX() {
        return NhaSX;
    }

    public void setNhaSX(String NhaSX) {
        this.NhaSX = NhaSX;
    }

    public String getNuocSX() {
        return NuocSX;
    }

    public void setNuocSX(String NuocSX) {
        this.NuocSX = NuocSX;
    }

    public int getMaXX() {
        return MaXX;
    }

    public void setMaXX(int MaXX) {
        this.MaXX = MaXX;
    }

    public boolean isTrangThaiSP() {
        return trangThaiSP;
    }

    public void setTrangThaiSP(boolean trangThai) {
        this.trangThaiSP = trangThai;
    }

    public Checkbox getSelect() {
        return select;
    }

    public void setSelect(Checkbox select) {
        this.select = select;
    }

}
