/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.KhachHang;
import com.dienmaydo.iservice.ILichSuGiaoDichService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class LichSuGiaoDichService implements ILichSuGiaoDichService<KhachHang, String> {

    String select_LSGD_By_MaKH = "SELECT * FROM dbo.KHACHHANG\n"
            + "JOIN dbo.HOADON ON HOADON.MAKH = KHACHHANG.MAKH\n"
            + "JOIN dbo.HOADONCHITIET ON HOADONCHITIET.MAHD = HOADON.MAHD\n"
            + "JOIN dbo.SANPHAMCHITIET ON SANPHAMCHITIET.MASPCT = HOADONCHITIET.MASPCT\n"
            + "JOIN  dbo.SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "JOIN dbo.TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "WHERE KHACHHANG.MAKH = ?";

    @Override
    public List<KhachHang> SelectLSGB_ByMaKH(String key) {
        return selectBySQL(select_LSGD_By_MaKH, key);
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
                entity.setTrangthai(rs.getBoolean("TRANGTHAI"));
                entity.setNgayGD(rs.getString("NGAYLAP"));
                entity.setTenSP(rs.getString("TENSP"));
                entity.setTenSPCT(rs.getString("TENSPCT"));
                entity.setSoLuong(rs.getInt("SOLUONG"));
                entity.setGiaBan(rs.getLong("GIABAN"));
                entity.setTongTien(rs.getLong("TONGTIEN"));
                entity.setTrangThaiTT(rs.getString("TENTTTT"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
