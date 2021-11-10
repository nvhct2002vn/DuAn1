/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienmaydo.entity;

/**
 *
 * @author letha
 */
public class KichThuoc {

    private String MaKichThuoc;
    private String MaDV;
    private Float ChieuDai;
    private Float ChieuRong;
    private Float ChieuCao;

    @Override
    public String toString() {
        return ChieuDai + " - " + ChieuRong + " - " + ChieuCao + " - " + MaDV;
    }

    public String getMaKichThuoc() {
        return MaKichThuoc;
    }

    public void setMaKichThuoc(String MaKichThuoc) {
        this.MaKichThuoc = MaKichThuoc;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public float getChieuDai() {
        return ChieuDai;
    }

    public void setChieuDai(float ChieuDai) {
        this.ChieuDai = ChieuDai;
    }

    public float getChieuRong() {
        return ChieuRong;
    }

    public void setChieuRong(float ChieuRong) {
        this.ChieuRong = ChieuRong;
    }

    public float getChieuCao() {
        return ChieuCao;
    }

    public void setChieuCao(float ChieuCao) {
        this.ChieuCao = ChieuCao;
    }

}
