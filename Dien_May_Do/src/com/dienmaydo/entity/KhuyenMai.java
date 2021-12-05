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
    private String MaSPCT;
    private String MaSP;
    private String TenDM;
    private String HinhThuc;
    private String TenChuongTrinh;
    private Date ThoiGianBatDau;
    private Date ThoiGianKetThuc;
    private long GiamGia;
    private String TrangThai;
    private String MoTa;
    private String tenSP;
    private String TenSPCT;

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }
    
    
    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenSPCT() {
        return TenSPCT;
    }

    public void setTenSPCT(String TenSPCT) {
        this.TenSPCT = TenSPCT;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getMaSPCT() {
        return MaSPCT;
    }

    public void setMaSPCT(String MaSPCT) {
        this.MaSPCT = MaSPCT;
    }

    public String getHinhThuc() {
        return HinhThuc;
    }

    public void setHinhThuc(String HinhThuc) {
        this.HinhThuc = HinhThuc;
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

    public long getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(long GiamGia) {
        this.GiamGia = GiamGia;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getTenDM() {
        return TenDM;
    }

    public void setTenDM(String TenDM) {
        this.TenDM = TenDM;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" + "MaKM=" + MaKM + ", MaSPCT=" + MaSPCT + ", TenDM=" + TenDM + ", HinhThuc=" + HinhThuc + ", TenChuongTrinh=" + TenChuongTrinh + ", ThoiGianBatDau=" + ThoiGianBatDau + ", ThoiGianKetThuc=" + ThoiGianKetThuc + ", GiamGia=" + GiamGia + ", TrangThai=" + TrangThai + ", MoTa=" + MoTa + ", tenSP=" + tenSP + ", TenSPCT=" + TenSPCT + '}';
    }

}
