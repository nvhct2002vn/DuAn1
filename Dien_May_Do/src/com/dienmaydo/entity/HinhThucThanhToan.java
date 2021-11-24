package com.dienmaydo.entity;

public class HinhThucThanhToan {
    private String MaHTTT;
    private String TenHTTT;

    public String getMaHTTT() {
        return MaHTTT;
    }

    public String getTenHTTT() {
        return TenHTTT;
    }

    @Override
    public String toString() {
        return TenHTTT;
    }

    public void setMaHTTT(String MaHTTT) {
        this.MaHTTT = MaHTTT;
    }

    public void setTenHTTT(String TenHTTT) {
        this.TenHTTT = TenHTTT;
    }
    
    
}
