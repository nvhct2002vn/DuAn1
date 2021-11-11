/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienmaydo.entity;

/**
 *
 * @author letha
 */
public class Image {

    private String MaImage;
    private String TenHinh;

    @Override
    public String toString() {
        return TenHinh;
    }

    public String getMaImage() {
        return MaImage;
    }

    public void setMaImage(String MaImage) {
        this.MaImage = MaImage;
    }

    public String getTenHinh() {
        return TenHinh;
    }

    public void setTenHinh(String TenHinh) {
        this.TenHinh = TenHinh;
    }

}
