/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.SanPham;
import com.dienmaydo.iservice.ISanPhamService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class SanPhamService implements ISanPhamService<SanPham, String> {

    String insert_SQL = "INSERT INTO dbo.SANPHAM(MASP,MADANHMUC,MAXX,TENSP)VALUES(?,?,?,?)";
    String update_SQL = "UPDATE dbo.SANPHAM SET MADANHMUC = ? , MAXX = ? ,TENSP = ? WHERE MASP = ?";
    String delete_SQL = "DELETE FROM dbo.SANPHAM WHERE MASP = ?";
    String selectALL_SQL = "SELECT * FROM dbo.SANPHAM";
    String selectByID_SQL = "SELECT * FROM dbo.SANPHAM WHERE MASP = ?";

    @Override
    public void insertData(SanPham entity) {
        try {
            JdbcHelper.excuteUpdate(insert_SQL, entity.getMaSp(), entity.getMaDanhMuc(), entity.getMaXX(), entity.getTenSp());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(SanPham entity) {
        try {
            JdbcHelper.excuteUpdate(update_SQL, entity.getMaDanhMuc(), entity.getMaXX(), entity.getTenSp(), entity.getMaSp());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteData(String key) {
        try {
            JdbcHelper.excuteUpdate(delete_SQL, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public SanPham selectByID(String key) {
        List<SanPham> list = this.selectBySQL(selectByID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<SanPham> selectBySQL(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                SanPham entity = new SanPham();
                entity.setMaSp(rs.getString("MASP"));
                entity.setMaDanhMuc(rs.getString("MADANHMUC"));
                entity.setMaXX(rs.getInt("MAXX"));
                entity.setTenSp(rs.getString("TENSP"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
