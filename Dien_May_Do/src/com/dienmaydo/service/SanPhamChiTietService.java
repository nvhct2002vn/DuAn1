/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.SanPham;
import com.dienmaydo.entity.SanPhamChiTiet;
import com.dienmaydo.iservice.ISanPhamService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class SanPhamChiTietService implements ISanPhamService<SanPhamChiTiet, String> {

    String insert_SQL = "INSERT INTO dbo.SANPHAMCHITIET\n"
            + "(MASPCT,MAIMAGE,MASP,MAMAUSAC,MAKICHTHUOC,MACHATLIEU,MATHETICH,MAKL,TENSPCT,SOLUONG, NHOMPHOBIEN,GIANHAP,GIABAN,MOTA)\n"
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    String update_SQL = "";
    String delete_SQL = "";
    String selectALL_SQL = "SELECT MASPCT,TENSPCT,SOLUONG,GIABAN,TENMAUSAC,THETICH,CHIEUDAI,CHIEURONG,CHIEUCAO,KHOILUONG,CHATLIEU,TENHINH\n"
            + "FROM dbo.SANPHAMCHITIET\n"
            + "JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n"
            + "JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n"
            + "JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n"
            + "JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n"
            + "JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n"
            + "JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n"
            + "JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE";
    String selectByID_SQL = "SELECT MASPCT,TENSPCT,SOLUONG,GIABAN,TENMAUSAC,THETICH,CHIEUDAI,CHIEURONG,CHIEUCAO,KHOILUONG,CHATLIEU,TENHINH\n"
            + "FROM dbo.SANPHAMCHITIET\n"
            + "JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n"
            + "JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n"
            + "JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n"
            + "JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n"
            + "JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n"
            + "JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n"
            + "JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE WHERE MASPCT = ?";

    @Override
    public void insertData(SanPhamChiTiet entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(SanPhamChiTiet entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SanPhamChiTiet> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public SanPhamChiTiet selectByID(String key) {
        List<SanPhamChiTiet> list = this.selectBySQL(selectByID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<SanPhamChiTiet> selectBySQL(String sql, Object... args) {
        List<SanPhamChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                SanPhamChiTiet entity = new SanPhamChiTiet();
                entity.setMaSPCT(rs.getString("MASPCT"));
                entity.setTenSPCT(rs.getString("TENSPCT"));
                entity.setSoLuong(rs.getInt("SOLUONG"));
                entity.setGiaBan(rs.getFloat("GIABAN"));
                entity.setTenMauSac(rs.getString("TENMAUSAC"));
                entity.setTheTich(rs.getFloat("THETICH"));
                entity.setChieuDai(rs.getFloat("CHIEUDAI"));
                entity.setChieuRong(rs.getFloat("CHIEURONG"));
                entity.setChieuCao(rs.getFloat("CHIEUCAO"));
                entity.setKhoiLuong(rs.getFloat("KHOILUONG"));
                entity.setTenChatLieu(rs.getString("CHATLIEU"));
                entity.setTenImage(rs.getString("TENHINH"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
