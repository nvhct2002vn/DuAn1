/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.SanPham;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.dienmaydo.iservice.ISanPhamChiTietService;
import com.dienmaydo.iservice.ISanPhamService;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class SanPhamService implements ISanPhamService<SanPham, String> {

    String insert_SQL = "INSERT INTO dbo.SANPHAM(MASP,MADANHMUC,MAXX,TENSP,TRANGTHAISP)VALUES(?,?,?,?,?)";
    String update_SQL = "UPDATE dbo.SANPHAM SET MAXX = ? , MADANHMUC = ? , TENSP = ? , TRANGTHAISP = ? WHERE MASP = ?";
    String delete_SQL = "DELETE FROM dbo.SANPHAM WHERE MASP = ?";
    String selectALL_SQL = "SELECT * FROM dbo.SANPHAM JOIN dbo.DANHMUC\n"
            + "ON DANHMUC.MADANHMUC = SANPHAM.MADANHMUC JOIN dbo.XUATXU ON XUATXU.MAXX = SANPHAM.MAXX";
    String selectByID_SQL = "SELECT * FROM dbo.SANPHAM JOIN dbo.DANHMUC\n"
            + "ON DANHMUC.MADANHMUC = SANPHAM.MADANHMUC JOIN dbo.XUATXU ON XUATXU.MAXX = SANPHAM.MAXX WHERE MASP = ?";

    String selectTimKiem = "SELECT * FROM dbo.SANPHAM JOIN dbo.XUATXU ON XUATXU.MAXX = SANPHAM.MAXX\n"
            + "JOIN dbo.DANHMUC ON DANHMUC.MADANHMUC = SANPHAM.MADANHMUC\n"
            + "WHERE MASP LIKE ? OR TENSP LIKE ? OR NUOCSX LIKE ?";
    String selectByDanhMuc = "SELECT * FROM dbo.SANPHAM JOIN DANHMUC ON DANHMUC.MADANHMUC = SANPHAM.MADANHMUC JOIN dbo.XUATXU ON XUATXU.MAXX = SANPHAM.MAXX WHERE TENDM = ?";
    String selectByXuatXu = "SELECT * FROM dbo.SANPHAM JOIN DANHMUC ON DANHMUC.MADANHMUC = SANPHAM.MADANHMUC JOIN dbo.XUATXU ON XUATXU.MAXX = SANPHAM.MAXX WHERE NHASX = ?";

    @Override
    public void insertData(SanPham entity) {
        try {
            JdbcHelper.excuteUpdate(insert_SQL, entity.getMaSp(), entity.getMaDanhMuc(), entity.getMaXX(), entity.getTenSp(), entity.isTrangThaiSP());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(SanPham entity) {
        try {
            JdbcHelper.excuteUpdate(update_SQL, entity.getMaXX(), entity.getMaDanhMuc(), entity.getTenSp(), entity.isTrangThaiSP(), entity.getMaSp());
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
                entity.setTrangThaiSP(rs.getBoolean("TRANGTHAISP"));
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
        return selectBySQL(selectTimKiem, "%" + key + "%", "%" + key + "%", "%" + key + "%");
    }

    @Override
    public List<SanPham> selectByDM(String key) {
        return selectBySQL(selectByDanhMuc, key);
    }

    @Override
    public List<SanPham> selectByXX(String key) {
        return selectBySQL(selectByXuatXu, key);
    }

}
