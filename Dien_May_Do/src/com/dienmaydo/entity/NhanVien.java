/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienmaydo.entity;

/**
 *
 * @author lethanhvinh
 */
import java.util.Date;

public class NhanVien {

    private String MaNV;
    private String MatKhau;
    private String TenNV;
    private String DiaChi;
    private String DienThoai;
    private boolean GioiTinh;
    private Date NgaySinh;
    private boolean VaiTro;
    private String Email;
    private boolean TrangThai;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

 
    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    

    @Override
    public String toString() {
        return "NhanVien{" + "MaNV=" + MaNV + ", MatKhau=" + MatKhau + ", TenNV=" + TenNV + ", DiaChi=" + DiaChi + ", DienThoai=" + DienThoai + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + ", VaiTro=" + VaiTro + ", TrangThai=" + TrangThai + '}';
    }

}
