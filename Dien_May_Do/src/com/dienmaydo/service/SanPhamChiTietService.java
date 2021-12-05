/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.SanPham;
import com.dienmaydo.entity.SanPhamChiTiet;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.dienmaydo.iservice.ISanPhamChiTietService;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class SanPhamChiTietService implements ISanPhamChiTietService<SanPhamChiTiet, String> {

    String insert_SQL = "INSERT INTO dbo.SANPHAMCHITIET(MASPCT,MAIMAGE,MASP,MAMAUSAC,MAKICHTHUOC,MACHATLIEU,MATHETICH,MAKL,\n"
            + "TENSPCT,SOLUONG,NHOMPHOBIEN,GIANHAP,GIABAN,TRANGTHAI,MOTA)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    String update_SQL = "UPDATE dbo.SANPHAMCHITIET SET MAIMAGE = ? ,MAMAUSAC = ? ,MAKICHTHUOC = ? ,MACHATLIEU = ? ,MATHETICH = ? ,MAKL = ? ,\n"
            + "TENSPCT = ? ,SOLUONG = ? ,NHOMPHOBIEN = ? ,GIANHAP = ? ,GIABAN = ? ,TRANGTHAI = ? ,MOTA = ? WHERE MASPCT = ?";

    String updateTrangThai_SQL = "UPDATE dbo.SANPHAMCHITIET SET TRANGTHAI = ? WHERE MASP = ?";

    String selectALL_SQL = "SELECT * FROM dbo.SANPHAMCHITIET\n"
            + "JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n"
            + "JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n"
            + "JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n"
            + "JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n"
            + "JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n"
            + "JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n"
            + "JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE";
    String select_All_ONL = "SELECT * FROM dbo.SANPHAMCHITIET\n"
            + "            JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "             JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n"
            + "            JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n"
            + "            JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n"
            + "            JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n"
            + "            JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n"
            + "            JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n"
            + "            JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE\n"
            + "            WHERE SANPHAMCHITIET.TRANGTHAI = 1";
    String selectByID_SQL = "SELECT MASPCT,TENSP,TENSPCT,SOLUONG,GIANHAP,GIABAN,NHOMPHOBIEN,TENMAUSAC,THETICH,CHIEUDAI,CHIEURONG,CHIEUCAO,KHOILUONG,TRANGTHAI,CHATLIEU,TENHINH,MOTA\n"
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

    String selectTimKiem = "SELECT MASPCT,TENSP,TENSPCT,SOLUONG,GIANHAP,GIABAN,NHOMPHOBIEN,TENMAUSAC,THETICH,CHIEUDAI,CHIEURONG,CHIEUCAO,KHOILUONG,CHATLIEU,TRANGTHAI,TENHINH,MOTA\n"
            + "            FROM dbo.SANPHAMCHITIET\n"
            + "            JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "            JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n"
            + "            JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n"
            + "            JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n"
            + "            JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n"
            + "            JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n"
            + "            JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n"
            + "            JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE\n"
            + "            WHERE (MASPCT LIKE ? OR TENSP +' '+ TENSPCT LIKE ?) AND SANPHAMCHITIET.TRANGTHAI = 1";

    String selectTimKiemSPCT = "SELECT MASPCT,TENSP,TENSPCT,SOLUONG,GIANHAP,GIABAN,NHOMPHOBIEN,TENMAUSAC,THETICH,CHIEUDAI,CHIEURONG,CHIEUCAO,KHOILUONG,CHATLIEU,TENHINH,TRANGTHAI,MOTA\n"
            + "            FROM dbo.SANPHAMCHITIET\n"
            + "			JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "			JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n"
            + "			JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n"
            + "			JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n"
            + "			JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n"
            + "			JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n"
            + "			JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n"
            + "			JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE\n"
            + "			WHERE MASPCT LIKE ? OR CHATLIEU LIKE ? OR TENSPCT LIKE ? OR TENMAUSAC LIKE ?";

    String selectBySPInDM = "SELECT MASPCT,TENSP,TENSPCT,SOLUONG,GIABAN,GIANHAP,NHOMPHOBIEN,TENMAUSAC,THETICH,CHIEUDAI,CHIEURONG,CHIEUCAO,KHOILUONG,SANPHAMCHITIET.TRANGTHAI,CHATLIEU,TENHINH,MOTA\n"
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
            + "            WHERE TENDM LIKE ? AND SANPHAMCHITIET.TRANGTHAI = 1";
    String SELECT_BY_WEBCAM = "SELECT MASPCT,TENSP,TENSPCT,SOLUONG,GIANHAP,GIABAN,NHOMPHOBIEN,TENMAUSAC,THETICH,CHIEUDAI,CHIEURONG,CHIEUCAO,KHOILUONG,TRANGTHAI,CHATLIEU,TENHINH,MOTA\n"
            + "FROM dbo.SANPHAMCHITIET\n"
            + "JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n"
            + "JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n"
            + "JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n"
            + "JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n"
            + "JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n"
            + "JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n"
            + "JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE WHERE MASPCT = ? AND SANPHAMCHITIET.TRANGTHAI = 1";
    String select_SQL_KhuyenMai = "SELECT * FROM dbo.SANPHAMCHITIET\n"
            + "JOIN dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "JOIN dbo.MAUSAC ON MAUSAC.MAMAUSAC = SANPHAMCHITIET.MAMAUSAC\n"
            + "JOIN dbo.KICHTHUOC ON KICHTHUOC.MAKICHTHUOC = SANPHAMCHITIET.MAKICHTHUOC\n"
            + "JOIN dbo.DONVITINH ON DONVITINH.MADV = KICHTHUOC.MADV\n"
            + "JOIN dbo.KHOILUONG ON KHOILUONG.MAKL = SANPHAMCHITIET.MAKL\n"
            + "JOIN dbo.THETICH ON THETICH.MATHETICH = SANPHAMCHITIET.MATHETICH\n"
            + "JOIN dbo.CHATLIEU ON CHATLIEU.MACHATLIEU = SANPHAMCHITIET.MACHATLIEU\n"
            + "JOIN dbo._IMAGE ON _IMAGE.MAIMAGE = SANPHAMCHITIET.MAIMAGE \n"
            + "Where dbo.DANHMUC.MADM = ?";
    @Override
    public void insertData(SanPhamChiTiet entity) {
        JdbcHelper.excuteUpdate(insert_SQL, entity.getMaSPCT(), entity.getMaImage(), entity.getMaSp(), entity.getMaMauSac(), entity.getMaKichThuoc(),
                entity.getMaChatLieu(), entity.getMaTheTich(), entity.getMaKL(), entity.getTenSPCT(), entity.getSoLuong(), entity.isNhomPhoBien(),
                entity.getGiaNhap(), entity.getGiaBan(), entity.isTrangThai(), entity.getMoTa());
    }

    @Override
    public void updateData(SanPhamChiTiet entity) {
        try {
            JdbcHelper.excuteUpdate(update_SQL, entity.getMaImage(), entity.getMaMauSac(), entity.getMaKichThuoc(), entity.getMaChatLieu(),
                    entity.getMaTheTich(), entity.getMaKL(), entity.getTenSPCT(), entity.getSoLuong(), entity.isNhomPhoBien(),
                    entity.getGiaNhap(), entity.getGiaBan(), entity.isTrangThai(), entity.getMoTa(), entity.getMaSPCT());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDataTrangThai(SanPhamChiTiet entity) {
        try {
            JdbcHelper.excuteUpdate(updateTrangThai_SQL, entity.isTrangThai(), entity.getMaSp());
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
    
    @Override
    public List<SanPhamChiTiet> selectBySPCT(String masp) {
        String sql = "SELECT MASPCT,TENSP,TENSPCT,SOLUONG,GIANHAP,GIABAN,NHOMPHOBIEN,TENMAUSAC,THETICH,CHIEUDAI,CHIEURONG,CHIEUCAO,KHOILUONG,CHATLIEU,TRANGTHAI,TENHINH,MOTA\n"
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
                entity.setGiaBan(rs.getLong("GIABAN"));
                entity.setGiaNhap(rs.getLong("GIANHAP"));
                entity.setNhomPhoBien(rs.getBoolean("NHOMPHOBIEN"));
                entity.setTenMauSac(rs.getString("TENMAUSAC"));
                entity.setTheTich(rs.getFloat("THETICH"));
                entity.setChieuDai(rs.getFloat("CHIEUDAI"));
                entity.setChieuRong(rs.getFloat("CHIEURONG"));
                entity.setChieuCao(rs.getFloat("CHIEUCAO"));
                entity.setKhoiLuong(rs.getFloat("KHOILUONG"));
                entity.setTenChatLieu(rs.getString("CHATLIEU"));
                entity.setTrangThai(rs.getBoolean("TRANGTHAI"));
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
        return selectBySQL(selectTimKiem, "%" + key + "%", "%" + key + "%");
    }

    @Override
    public List<SanPhamChiTiet> selectByTimKiemSPCT(String key) {
        return selectBySQL(selectTimKiemSPCT, "%" + key + "%", "%" + key + "%", "%" + key + "%", "%" + key + "%");
    }

    public void updateBanHang(SanPhamChiTiet entity) {
        String sql = "UPDATE SANPHAMCHITIET SET SOLUONG = ? WHERE MASPCT = ?";
        JdbcHelper.excuteUpdate(sql, entity.getSoLuong(), entity.getMaSPCT());
    }

    public List<SanPhamChiTiet> selectByDM(String key) {
        return selectBySQL(selectBySPInDM, key);
    }

    public SanPhamChiTiet selectWebcam(String key) {
        List<SanPhamChiTiet> list = selectBySQL(SELECT_BY_WEBCAM, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<SanPhamChiTiet> selectAll_BY_ONL() {
        return this.selectBySQL(select_All_ONL);
    }
    public List<SanPhamChiTiet> select_ALL_By_KhuyenMai(){
        return this.selectBySQL(select_SQL_KhuyenMai);
    }
}
