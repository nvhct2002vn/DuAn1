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
    String update_SQL = "UPDATE dbo.SANPHAMCHITIET SET TENSPCT = ?, SOLUONG = ? , GIABAN = ?,GIANHAP = ? , NHOMPHOBIEN = ? , MOTA = ?,\n"
            + "MAMAUSAC = ?,MACHATLIEU = ?, MAKICHTHUOC = ?,MATHETICH = ?, MAKL = ? , MAIMAGE = ? WHERE MASPCT = ?";
    String selectALL_SQL = "SELECT * FROM dbo.SANPHAMCHITIET\n"
            + "JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n"
            + "JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n"
            + "JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n"
            + "JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n"
            + "JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n"
            + "JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n"
            + "JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE";
    String selectByID_SQL = "SELECT MASPCT,TENSP,TENSPCT,SOLUONG,GIANHAP,GIABAN,NHOMPHOBIEN,TENMAUSAC,THETICH,CHIEUDAI,CHIEURONG,CHIEUCAO,KHOILUONG,CHATLIEU,TENHINH,MOTA\n"
            + "FROM dbo.SANPHAMCHITIET\n"
            + "JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n"
            + "JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n"
            + "JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n"
            + "JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n"
            + "JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n"
            + "JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n"
            + "JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE\n"
            + "WHERE MASPCT = ?";

    String selectTimKiem = "SELECT MASPCT,TENSP,TENSPCT,SOLUONG,GIANHAP,GIABAN,NHOMPHOBIEN,TENMAUSAC,THETICH,CHIEUDAI,CHIEURONG,CHIEUCAO,KHOILUONG,CHATLIEU,TENHINH,MOTA\n" +
"            FROM dbo.SANPHAMCHITIET\n" +
"            JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n" +
"            JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n" +
"            JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n" +
"            JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n" +
"            JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n" +
"            JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n" +
"            JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n" +
"            JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE\n" +
"            WHERE MASPCT LIKE ? OR TENSP LIKE ? OR TENMAUSAC LIKE ? OR CHATLIEU LIKE ? OR GIABAN = ? ";

    String selectBySPInDM = "SELECT MASPCT,TENSP,TENSPCT,SOLUONG,GIABAN,GIANHAP,NHOMPHOBIEN,TENMAUSAC,THETICH,CHIEUDAI,CHIEURONG,CHIEUCAO,KHOILUONG,CHATLIEU,TENHINH,MOTA\n"
            + "            FROM dbo.SANPHAMCHITIET\n"
            + "            JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "            JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n"
            + "            JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n"
            + "            JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n"
            + "            JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n"
            + "            JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n"
            + "            JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n"
            + "            JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE\n"
            + "			JOIN DANHMUC ON DANHMUC.MADANHMUC = SANPHAM.MADANHMUC\n"
            + "            WHERE TENDM LIKE ?";

    @Override
    public void insertData(SanPhamChiTiet entity) {
        JdbcHelper.excuteUpdate(insert_SQL, entity.getMaSPCT(), entity.getMaImage(), entity.getMaSp(), entity.getMaMauSac(), entity.getMaKichThuoc(),
                entity.getMaChatLieu(), entity.getMaTheTich(), entity.getMaKL(), entity.getTenSPCT(), entity.getSoLuong(), entity.isNhomPhoBien(),
                entity.getGiaNhap(), entity.getGiaBan(), entity.getMoTa());
    }

    @Override
    public void updateData(SanPhamChiTiet entity) {
        try {
            JdbcHelper.excuteUpdate(update_SQL, entity.getTenSPCT(), entity.getSoLuong(), entity.getGiaBan(), entity.getGiaNhap(),
                    entity.isNhomPhoBien(), entity.getMoTa(), entity.getMaMauSac(), entity.getMaChatLieu(), entity.getMaKichThuoc(),
                    entity.getMaTheTich(), entity.getMaKL(), entity.getMaImage(), entity.getMaSPCT());
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public List<SanPhamChiTiet> selectBySPCT(String masp) {
        String sql = "SELECT MASPCT,TENSP,TENSPCT,SOLUONG,GIANHAP,GIABAN,NHOMPHOBIEN,TENMAUSAC,THETICH,CHIEUDAI,CHIEURONG,CHIEUCAO,KHOILUONG,CHATLIEU,TENHINH,MOTA\n"
                + "FROM dbo.SANPHAMCHITIET\n"
                + "JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
                + "JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n"
                + "JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n"
                + "JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n"
                + "JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n"
                + "JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n"
                + "JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n"
                + "JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE WHERE SANPHAM.MASP = ?";
        return selectBySQL(sql, masp);
    }

    @Override
    public List<SanPhamChiTiet> selectBySQL(String sql, Object... args) {
        List<SanPhamChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                SanPhamChiTiet entity = new SanPhamChiTiet();
                entity.setMaSPCT(rs.getString("MASPCT"));
                entity.setTenSP(rs.getString("TENSP"));
                entity.setTenSPCT(rs.getString("TENSPCT"));
                entity.setSoLuong(rs.getInt("SOLUONG"));
                entity.setGiaBan(rs.getFloat("GIABAN"));
                entity.setGiaNhap(rs.getFloat("GIANHAP"));
                entity.setNhomPhoBien(rs.getBoolean("NHOMPHOBIEN"));
                entity.setTenMauSac(rs.getString("TENMAUSAC"));
                entity.setTheTich(rs.getFloat("THETICH"));
                entity.setChieuDai(rs.getFloat("CHIEUDAI"));
                entity.setChieuRong(rs.getFloat("CHIEURONG"));
                entity.setChieuCao(rs.getFloat("CHIEUCAO"));
                entity.setKhoiLuong(rs.getFloat("KHOILUONG"));
                entity.setTenChatLieu(rs.getString("CHATLIEU"));
                entity.setTenImage(rs.getString("TENHINH"));
                entity.setMoTa(rs.getString("MOTA"));
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
    public List<SanPhamChiTiet> selectByTimKiem(String key) {
        return selectBySQL(selectTimKiem, "%" + key + "%", "%" + key + "%", "%" + key + "%", "%" + key + "%", key);
    }

    public void updateBanHang(SanPhamChiTiet entity) {
        String sql = "UPDATE SANPHAMCHITIET SET SOLUONG = ? WHERE MASPCT = ?";
        JdbcHelper.excuteUpdate(sql, entity.getSoLuong(), entity.getMaSPCT());
    }

    public List<SanPhamChiTiet> selectByDM(String key) {
        return selectBySQL(selectBySPInDM, key);
    }

}
