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
    private boolean Trangthai;
    private String NgayGD;
    private String TenSP;
    private String TenSPCT;
    private int SoLuong;
    private float GiaBan;
    private float TongTien;
    private String TrangThaiTT;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String TenKh, boolean GioiTinh, String SDT, String Email, String DiaChi, boolean Trangthai, String NgayGD, String TenSP, String TenSPCT, int SoLuong, float GiaBan, float TongTien, String TrangThaiTT) {
        this.MaKH = MaKH;
        this.TenKh = TenKh;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.Trangthai = Trangthai;
        this.NgayGD = NgayGD;
        this.TenSP = TenSP;
        this.TenSPCT = TenSPCT;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
        this.TongTien = TongTien;
        this.TrangThaiTT = TrangThaiTT;
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

    public boolean isTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(boolean Trangthai) {
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

    @Override
    public String toString() {
        return "KhachHang{" + "MaKH=" + MaKH + ", TenKh=" + TenKh + ", GioiTinh=" + GioiTinh + ", SDT=" + SDT + ", Email=" + Email + ", DiaChi=" + DiaChi + ", Trangthai=" + Trangthai + ", NgayGD=" + NgayGD + ", TenSP=" + TenSP + ", TenSPCT=" + TenSPCT + ", SoLuong=" + SoLuong + ", GiaBan=" + GiaBan + ", TongTien=" + TongTien + ", TrangThaiTT=" + TrangThaiTT + '}';
    }
    
    
    
}
