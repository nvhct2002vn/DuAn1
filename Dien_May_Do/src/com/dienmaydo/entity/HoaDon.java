package com.dienmaydo.entity;

import java.util.Date;

public class HoaDon {

    private String MaHD;
    private String MaNV;
    private String TenNV;
    private String MaKH;
    private String tenKH;
    private String MaTTTT;
    private String MaHTTT;
    private String MaHTGH;
    private String TenTTTT;
    private String TenHTTT;
    private String TenHTGH;
    private String diaChi;
    private String sdt;
    private Date NgayLap;
    private Float TienThuaTraKhach;
    private float TongTien;
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

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public Float getTienThuaTraKhach() {
        return TienThuaTraKhach;
    }

    public void setTienThuaTraKhach(Float TienThuaTraKhach) {
        this.TienThuaTraKhach = TienThuaTraKhach;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "MaHD=" + MaHD + ", NgayLap=" + NgayLap + "";
    }

    public String getMaTTTT() {
        return MaTTTT;
    }

    public void setMaTTTT(String MaTTTT) {
        this.MaTTTT = MaTTTT;
    }

    public String getMaHTTT() {
        return MaHTTT;
    }

    public void setMaHTTT(String MaHTTT) {
        this.MaHTTT = MaHTTT;
    }

    public String getMaHTGH() {
        return MaHTGH;
    }

    public void setMaHTGH(String MaHTGH) {
        this.MaHTGH = MaHTGH;
    }

    public String getTenTTTT() {
        return TenTTTT;
    }

    public void setTenTTTT(String TenTTTT) {
        this.TenTTTT = TenTTTT;
    }

    public String getTenHTTT() {
        return TenHTTT;
    }

    public void setTenHTTT(String TenHTTT) {
        this.TenHTTT = TenHTTT;
    }

    public String getTenHTGH() {
        return TenHTGH;
    }

    public void setTenHTGH(String TenHTGH) {
        this.TenHTGH = TenHTGH;
    }
    
    
    
}
