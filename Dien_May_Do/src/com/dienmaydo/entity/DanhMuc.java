/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienmaydo.entity;

import java.awt.Checkbox;


/**
 *
 * @author letha
 */
public class DanhMuc {

    private String MaDanhMuc;
    private String TenDanhMuc;
    private boolean TrangThai;
    private String GhiChu;
    private Checkbox select;
    @Override
    public String toString() {
        return TenDanhMuc;
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

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public Checkbox getSelect() {
        return select;
    }

    public void setSelect(Checkbox select) {
        this.select = select;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    
}
