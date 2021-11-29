/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.entity;

/**
 *
 * @author lethu
 */
public class KhachHang {
    private String MaKH;
    private String TenKh;
    private boolean GioiTinh;
    private String SDT;
    private String Email;
    private String DiaChi;
    private String Trangthai;
    private String NgayGD;
    private String TenSP;
    private String TenSPCT;
    private int SoLuong;
    private float GiaBan;
    private float TongTien;
    private String TrangThaiTT;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String TenKh, boolean GioiTinh, String SDT, String Email, String DiaChi, String Trangthai) {
        this.MaKH = MaKH;
        this.TenKh = TenKh;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.Trangthai = Trangthai;
    }
    
    
    
    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKh() {
        return TenKh;
    }

    public void setTenKh(String TenKh) {
        this.TenKh = TenKh;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(String Trangthai) {
        this.Trangthai = Trangthai;
    }

    public String getNgayGD() {
        return NgayGD;
    }

    public void setNgayGD(String NgayGD) {
        this.NgayGD = NgayGD;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getTenSPCT() {
        return TenSPCT;
    }

    public void setTenSPCT(String TenSPCT) {
        this.TenSPCT = TenSPCT;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(float GiaBan) {
        this.GiaBan = GiaBan;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

    public String getTrangThaiTT() {
        return TrangThaiTT;
    }

    public void setTrangThaiTT(String TrangThaiTT) {
        this.TrangThaiTT = TrangThaiTT;
    }
    
    
    
}
