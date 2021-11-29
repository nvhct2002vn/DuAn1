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
    String selectByTimKiem = "SELECT * FROM dbo.KHACHHANG WHERE MAKH LIKE ? OR TENKH LIKE ?";
    String UPDATE_SQL = "UPDATE KHACHHANG SET TENKH = ?, GIOITINH = ?, DIENTHOAI = ?,EMAIL = ?,DIACHI = ?,TRANGTHAI = ? WHERE MAKH = ?";
    String selectByID = "SELECT * FROM dbo.KHACHHANG where MAKH = ?";

    @Override
    public void insertData(KhachHang entity) {
        JdbcHelper.excuteUpdate(insertSQL, entity.getMaKH(), entity.getTenKh(), entity.isGioiTinh(), entity.getSDT(),
                entity.getEmail(), entity.getDiaChi(), entity.getTrangthai());
    }

    @Override
    public void updateData(KhachHang entity) {
        JdbcHelper.excuteUpdate(UPDATE_SQL, entity.getTenKh(), entity.isGioiTinh(), entity.getSDT(),
                entity.getEmail(), entity.getDiaChi(), entity.getTrangthai(), entity.getMaKH());
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public KhachHang selectByID(String key) {
        List<KhachHang> list = selectBySQL(selectByID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
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
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<KhachHang> selectByTimKiem(String key) {
        return selectBySQL(selectByTimKiem, "%" + key + "%", "%" + key + "%");
    }

    public List<Integer> selectTongKhachHang() {
        String sql = "SELECT COUNT(MAKH) AS TONGKHACHHANG FROM KHACHHANG";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
