package com.dienmaydo.entity;

public class TrangThaiThanhToan {
    private String MaTTTT;
    private String TenTTT;

    public String getMaTTTT() {
        return MaTTTT;
    }

    public void setMaTTTT(String MaTTTT) {
        this.MaTTTT = MaTTTT;
    }

    public String getTenTTT() {
        return TenTTT;
    }

    public void setTenTTT(String TenTTT) {
        this.TenTTT = TenTTT;
    }

    @Override
    public String toString() {
        return TenTTT;
    }
    
    
}
