/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.DanhMuc;
import com.dienmaydo.iservice.IDanhMucService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class DanhMucService implements IDanhMucService<DanhMuc, String> {

    String selectALL_SQL = "SELECT * FROM dbo.DANHMUC";
    String selectByID_SQL = "SELECT * FROM dbo.DANHMUC WHERE MADANHMUC = ?";

    @Override

    public void insertData(DanhMuc entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(DanhMuc entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DanhMuc> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public DanhMuc selectByID(String key) {
        List<DanhMuc> list = this.selectBySQL(selectByID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<DanhMuc> selectBySQL(String sql, Object... args) {
        List<DanhMuc> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                DanhMuc entity = new DanhMuc();
                entity.setMaDanhMuc(rs.getString("MADANHMUC"));
                entity.setMaNH(rs.getString("MANH"));
                entity.setTenDanhMuc(rs.getString("TENDM"));
                entity.setTrangThai(rs.getBoolean("TRANGTHAI"));
                entity.setGhiChu(rs.getString("GHICHU"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<String> selectDanhMuc() {
        String sql = "SELECT DISTINCT TENDM FROM DANHMUC";
        List<String> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getString(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
