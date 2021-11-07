/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienmaydo.entity;

/**
 *
 * @author letha
 */
import java.util.Date;
public class HoaDon {
    private String MaHD;
    private String MaNV;
    private Date NgayLap;
    private String TrangThai_TT;
    private String HinhThuc_TT;
    private int TongTien;
    private String GhiChu;

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getTrangThai_TT() {
        return TrangThai_TT;
    }

    public void setTrangThai_TT(String TrangThai_TT) {
        this.TrangThai_TT = TrangThai_TT;
    }

    public String getHinhThuc_TT() {
        return HinhThuc_TT;
    }

    public void setHinhThuc_TT(String HinhThuc_TT) {
        this.HinhThuc_TT = HinhThuc_TT;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
}
