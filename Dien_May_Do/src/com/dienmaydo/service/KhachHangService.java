/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.ChatLieu;
import com.dienmaydo.entity.KhachHang;
import com.dienmaydo.iservice.IKhachHangService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lethu
 */
public class KhachHangService implements IKhachHangService<KhachHang, String> {

    String insertSQL = "INSERT INTO dbo.KHACHHANG(MAKH,TENKH,GIOITINH,DIENTHOAI,EMAIL,DIACHI,TRANGTHAI)VALUES(?,?,?,?,?,?,?)";
    String selectALL_SQL = "SELECT * FROM dbo.KHACHHANG";

    @Override
    public void insertData(KhachHang entity) {
        JdbcHelper.excuteUpdate(insertSQL, entity.getMaKH(), entity.getTenKh(), entity.isGioiTinh(), entity.getSDT(),
                entity.getEmail(), entity.getDiaChi(), entity.getTrangthai());
    }

    @Override
    public void updateData(KhachHang entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public KhachHang selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KhachHang> selectBySQL(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("MAKH"));
                entity.setTenKh(rs.getString("TENKH"));
                entity.setGioiTinh(rs.getBoolean("GIOITINH"));
                entity.setSDT(rs.getString("DIENTHOAI"));
                entity.setEmail(rs.getString("EMAIL"));
                entity.setDiaChi(rs.getString("DIACHI"));
                entity.setTrangthai(rs.getString("TRANGTHAI"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
