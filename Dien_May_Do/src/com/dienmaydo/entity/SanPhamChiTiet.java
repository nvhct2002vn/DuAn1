/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienmaydo.entity;

/**
 *
 * @author letha
 */
public class SanPhamChiTiet {

    private String MaSPCT;
    private String MaImage;
    private String TenImage;
    private String MaSp;
    private String MaMauSac;
    private String TenMauSac;
    private String MaKichThuoc;
    private Float ChieuDai;
    private Float ChieuRong;
    private Float ChieuCao;
    private String MaChatLieu;
    private String TenChatLieu;
    private String MaTheTich;
    private Float TheTich;
    private String MaKL;
    private Float KhoiLuong;
    private String TenSPCT;
    private String TenSP;
    private int SoLuong;
    private boolean NhomPhoBien;
    private Float GiaNhap;
    private Float GiaBan;
    private String TrangThai;
    private String MoTa;
    private String TenDVTinh;
    private String MaDVT;

    public String getMaSPCT() {
        return MaSPCT;
    }

    public void setMaSPCT(String MaSPCT) {
        this.MaSPCT = MaSPCT;
    }

    public String getMaImage() {
        return MaImage;
    }

    public void setMaImage(String MaImage) {
        this.MaImage = MaImage;
    }

    public String getMaSp() {
        return MaSp;
    }

    public void setMaSp(String MaSp) {
        this.MaSp = MaSp;
    }

    public String getMaMauSac() {
        return MaMauSac;
    }

    public void setMaMauSac(String MaMauSac) {
        this.MaMauSac = MaMauSac;
    }

    public String getTenMauSac() {
        return TenMauSac;
    }

    public void setTenMauSac(String TenMauSac) {
        this.TenMauSac = TenMauSac;
    }

    public String getMaKichThuoc() {
        return MaKichThuoc;
    }

    public void setMaKichThuoc(String MaKichThuoc) {
        this.MaKichThuoc = MaKichThuoc;
    }

    public Float getChieuDai() {
        return ChieuDai;
    }

    public void setChieuDai(Float ChieuDai) {
        this.ChieuDai = ChieuDai;
    }

    public Float getChieuRong() {
        return ChieuRong;
    }

    public void setChieuRong(Float ChieuRong) {
        this.ChieuRong = ChieuRong;
    }

    public Float getChieuCao() {
        return ChieuCao;
    }

    public void setChieuCao(Float ChieuCao) {
        this.ChieuCao = ChieuCao;
    }

    public String getMaChatLieu() {
        return MaChatLieu;
    }

    public void setMaChatLieu(String MaChatLieu) {
        this.MaChatLieu = MaChatLieu;
    }

    public String getTenChatLieu() {
        return TenChatLieu;
    }

    public void setTenChatLieu(String TenChatLieu) {
        this.TenChatLieu = TenChatLieu;
    }

    public String getMaTheTich() {
        return MaTheTich;
    }

    public void setMaTheTich(String MaTheTich) {
        this.MaTheTich = MaTheTich;
    }

    public Float getTheTich() {
        return TheTich;
    }

    public void setTheTich(Float TheTich) {
        this.TheTich = TheTich;
    }

    public String getMaKL() {
        return MaKL;
    }

    public void setMaKL(String MaKL) {
        this.MaKL = MaKL;
    }

    public Float getKhoiLuong() {
        return KhoiLuong;
    }

    public void setKhoiLuong(Float KhoiLuong) {
        this.KhoiLuong = KhoiLuong;
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

    public boolean isNhomPhoBien() {
        return NhomPhoBien;
    }

    public void setNhomPhoBien(boolean NhomPhoBien) {
        this.NhomPhoBien = NhomPhoBien;
    }

    public Float getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(Float GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public Float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(Float GiaBan) {
        this.GiaBan = GiaBan;
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

    public String getTenImage() {
        return TenImage;
    }

    public void setTenImage(String TenImage) {
        this.TenImage = TenImage;
    }

    public String getKichCo() {
        String kichCoDRC = String.valueOf(ChieuDai) + " - " + String.valueOf(ChieuRong) + " - " + String.valueOf(ChieuCao);
        return kichCoDRC;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getTenDVTinh() {
        return TenDVTinh;
    }

    public void setTenDVTinh(String TenDVTinh) {
        this.TenDVTinh = TenDVTinh;
    }

    public String getMaDVT() {
        return MaDVT;
    }

    public void setMaDVT(String MaDVT) {
        this.MaDVT = MaDVT;
    }
    

}
