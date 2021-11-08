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
    String update_SQL = "UPDATE dbo.SANPHAM SET MADANHMUC = ? , TENSP = ? WHERE MASP = ?";
    String delete_SQL = "DELETE FROM dbo.SANPHAM WHERE MASP = ?";
    String selectALL_SQL = "SELECT MASP, TENSP,DANHMUC.MADANHMUC,TENDM,NHASX,NUOCSX,SANPHAM.MAXX  FROM dbo.SANPHAM JOIN dbo.DANHMUC\n"
            + "ON DANHMUC.MADANHMUC = SANPHAM.MADANHMUC JOIN dbo.XUATXU ON XUATXU.MAXX = SANPHAM.MAXX";
    String selectByID_SQL = "SELECT MASP, TENSP,DANHMUC.MADANHMUC,TENDM,NHASX,NUOCSX,SANPHAM.MAXX FROM dbo.SANPHAM JOIN dbo.DANHMUC\n"
            + "ON DANHMUC.MADANHMUC = SANPHAM.MADANHMUC JOIN dbo.XUATXU ON XUATXU.MAXX = SANPHAM.MAXX WHERE MASP = ?";

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
            JdbcHelper.excuteUpdate(update_SQL, entity.getMaDanhMuc(), entity.getTenSp(), entity.getMaSp());
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
                entity.setTenDanhMuc(rs.getString("TENDM"));
                entity.setNhaSX(rs.getString("NHASX"));
                entity.setNuocSX(rs.getString("NUOCSX"));
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
    public List<SanPham> selectByTimKiem(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
