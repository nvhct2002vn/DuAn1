package com.dienmaydo.service;

import com.dienmaydo.entity.HoaDon;
import com.dienmaydo.iservice.IHoaDonService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HoaDonService implements IHoaDonService<HoaDon, String> {

    String INSERT_SQL = "INSERT INTO HOADON(MAHD,MANV,TRANGTHAI_TT,HINHTHUC_TT,TIENTHUATRAKHACH,TONGTIEN,GHICHU) VALUES(?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE HOADON SET MANV = ? ,NGAYLAP = ?, TRANGTHAI_TT = ?, HINHTHUC_TT = ?,TIENTHUATRAKHACH = ?,TONGTIEN = ?, GHICHU = ? WHERE MAHD = ?";
    String SELECT_ALL_SQL = "SELECT * FROM HOADON";
    String SELECT_BY_ID_SQL = "SELECT * FROM HOADON WHERE MAHD LIKE ?";
    String SELECT_BY_CHOTT = "SELECT * FROM HOADON WHERE TRANGTHAI_TT LIKE N'CHỜ THANH TOÁN'";

    @Override
    public void insert(HoaDon entity) {
        JdbcHelper.excuteUpdate(INSERT_SQL, entity.getMaHD(), entity.getMaNV(), entity.getTrangThai_TT(), entity.getHinhThuc_TT(),entity.getTienThuaTraKhach(),
                entity.getTongTien(), entity.getGhiChu());
    }

    @Override
    public List<HoaDon> selectBySQL(String sqlString, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sqlString, args);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString("MAHD"));
                hd.setMaNV(rs.getString("MANV"));
                hd.setNgayLap(rs.getDate("NGAYLAP"));
                hd.setTrangThai_TT(rs.getString("TRANGTHAI_TT"));
                hd.setHinhThuc_TT(rs.getString("HINHTHUC_TT"));
                hd.setTienThuaTraKhach(rs.getFloat("TIENTHUATRAKHACH"));
                hd.setTongTien(rs.getFloat("TONGTIEN"));
                hd.setGhiChu(rs.getString("GHICHU"));
                list.add(hd);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<HoaDon> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public List<HoaDon> selectById(String key) {
        List<HoaDon> list = selectBySQL(SELECT_BY_ID_SQL, "%" + key + "%");
        return list;
    }

    @Override
    public List<HoaDon> selectByHDChoThanhToan() {
        return selectBySQL(SELECT_BY_CHOTT);
    }

}
