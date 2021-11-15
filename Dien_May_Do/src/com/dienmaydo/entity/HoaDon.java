package com.dienmaydo.entity;

import java.util.Date;

public class HoaDon {

    private String MaHD;
    private String MaNV;
    private String TenNV;
    private String MaKH;
    private String tenKH;
    private String diaChi;
    private String sdt;
    private Date NgayLap;
    private String TrangThai_TT;
    private String HinhThuc_TT;
    private String HinhThucGiaoHang;
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

    @Override
    public String toString() {
        return TrangThai_TT;
    }

    public Float getTienThuaTraKhach() {
        return TienThuaTraKhach;
    }

    public void setTienThuaTraKhach(Float TienThuaTraKhach) {
        this.TienThuaTraKhach = TienThuaTraKhach;
    }

    public String getHinhThucGiaoHang() {
        return HinhThucGiaoHang;
    }

    public void setHinhThucGiaoHang(String HinhThucGiaoHang) {
        this.HinhThucGiaoHang = HinhThucGiaoHang;
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
    
    
}
