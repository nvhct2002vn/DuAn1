package com.dienmaydo.entity;

public class HinhThucGiaoHang {
    private String MaHTGH;
    private String TenHTGH;

    public String getMaHTGH() {
        return MaHTGH;
    }

    public void setMaHTGH(String MaHTGH) {
        this.MaHTGH = MaHTGH;
    }

    public String getTenHTGH() {
        return TenHTGH;
    }

    public void setTenHTGH(String TenHTGH) {
        this.TenHTGH = TenHTGH;
    }

    @Override
    public String toString() {
        return TenHTGH;
    }
    
    
}
