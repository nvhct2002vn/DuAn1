package com.dienmaydo.service;

import com.dienmaydo.entity.HoaDonChiTiet;
import com.dienmaydo.iservice.IHoaDonChiTietService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HoaDonChiTietService implements IHoaDonChiTietService<HoaDonChiTiet, String> {

    String SELECT_BY_ID_SQL = "SELECT MAHDCT,SANPHAMCHITIET.MASPCT,MAHD,TENSP,TENSPCT,HOADONCHITIET.SOLUONG,DONGIA\n"
            + "FROM HOADONCHITIET JOIN SANPHAMCHITIET ON HOADONCHITIET.MASPCT = SANPHAMCHITIET.MASPCT\n"
            + "					JOIN SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
            + "WHERE MAHD = ?";

    String INSERT_SQL = "INSERT INTO HOADONCHITIET VALUES(?,?,?,?)";
    String DELETE_SQL = "DELETE FROM HOADONCHITIET WHERE MAHD = ?";

    @Override
    public List<HoaDonChiTiet> selectBySQL(String sqlString, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sqlString, args);
            while (rs.next()) {
                HoaDonChiTiet hd = new HoaDonChiTiet();
                hd.setMaHDCT(rs.getInt("MAHDCT"));
                hd.setMaSPCT(rs.getString("MASPCT"));
                hd.setTenSP(rs.getString("TENSP"));
                hd.setTenSPCT(rs.getString("TENSPCT"));
                hd.setMaHD(rs.getString("MAHD"));
                hd.setSoLuong(rs.getInt("SOLUONG"));
                hd.setDonGia(rs.getFloat("DONGIA"));
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
    public List<HoaDonChiTiet> selectById(String key) {
        return selectBySQL(SELECT_BY_ID_SQL, key);
    }

    @Override
    public void insert(HoaDonChiTiet entity) {
        JdbcHelper.excuteUpdate(INSERT_SQL, entity.getMaSPCT(), entity.getMaHD(), entity.getSoLuong(), entity.getDonGia());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.excuteUpdate(DELETE_SQL, key);
    }

    @Override
    public void update(HoaDonChiTiet entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
