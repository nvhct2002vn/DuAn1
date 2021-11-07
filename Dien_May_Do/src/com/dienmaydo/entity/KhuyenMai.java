/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienmaydo.entity;

import java.util.Date;

/**
 *
 * @author letha
 */
public class KhuyenMai {

    private String MaKM;
    private String MaDMKM;
    private String TenChuongTrinh;
    private Date ThoiGianBatDau;
    private Date ThoiGianKetThuc;
    private float GiamGia;
    private boolean TrangThai;
    private String MoTa;

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getMaDMKM() {
        return MaDMKM;
    }

    public void setMaDMKM(String MaDMKM) {
        this.MaDMKM = MaDMKM;
    }

    public String getTenChuongTrinh() {
        return TenChuongTrinh;
    }

    public void setTenChuongTrinh(String TenChuongTrinh) {
        this.TenChuongTrinh = TenChuongTrinh;
    }

    public Date getThoiGianBatDau() {
        return ThoiGianBatDau;
    }

    public void setThoiGianBatDau(Date ThoiGianBatDau) {
        this.ThoiGianBatDau = ThoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return ThoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date ThoiGianKetThuc) {
        this.ThoiGianKetThuc = ThoiGianKetThuc;
    }

    public float getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(float GiamGia) {
        this.GiamGia = GiamGia;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

}
