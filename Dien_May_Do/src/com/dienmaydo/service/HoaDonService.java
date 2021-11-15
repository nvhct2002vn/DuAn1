package com.dienmaydo.service;

import com.dienmaydo.entity.HoaDon;
import com.dienmaydo.iservice.IHoaDonService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HoaDonService implements IHoaDonService<HoaDon, String> {

    String INSERT_SQL = "INSERT INTO HOADON(MAHD,MANV,MAKH,TRANGTHAI_TT,HINHTHUC_TT,HINHTHUCGIAOHANG,TIENTHUATRAKHACH,TONGTIEN,GHICHU) VALUES(?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE HOADON SET HINHTHUC_TT = ?, HINHTHUCGIAOHANG = ?, TRANGTHAI_TT = ?, TIENTHUATRAKHACH = ?, TONGTIEN = ?, GHICHU = ? WHERE MAHD = ?";
    String SELECT_ALL_SQL = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "			JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH";
    String SELECT_BY_ID_SQL = "SELECT MAHD,NHANVIEN.MANV,KHACHHANG.DIACHI,TENNV,KHACHHANG.MAKH,TENKH,KHACHHANG.DIENTHOAI,NGAYLAP,TRANGTHAI_TT,HINHTHUC_TT,HINHTHUCGIAOHANG,TIENTHUATRAKHACH,TONGTIEN,GHICHU\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "			JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
            + "WHERE MAHD LIKE ?";
    String SELECT_BY_CHOTT = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "			JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH "
            + "WHERE TRANGTHAI_TT LIKE N'%CHỜ THANH TOÁN%'";

    @Override
    public void insert(HoaDon entity) {
        JdbcHelper.excuteUpdate(INSERT_SQL, entity.getMaHD(), entity.getMaNV(), entity.getMaKH(), entity.getTrangThai_TT(), entity.getHinhThuc_TT(), entity.getHinhThucGiaoHang(),
                entity.getTienThuaTraKhach(), entity.getTongTien(), entity.getGhiChu());
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
                hd.setTenNV(rs.getString("TENNV"));
                hd.setMaKH(rs.getString("MAKH"));
                hd.setTenKH(rs.getString("TENKH"));
                hd.setDiaChi(rs.getString("DIACHI"));
                hd.setSdt(rs.getString("DIENTHOAI"));
                hd.setNgayLap(rs.getDate("NGAYLAP"));
                hd.setTrangThai_TT(rs.getString("TRANGTHAI_TT"));
                hd.setHinhThuc_TT(rs.getString("HINHTHUC_TT"));
                hd.setHinhThucGiaoHang(rs.getString("HINHTHUCGIAOHANG"));
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
    public HoaDon selectById(String key) {
        List<HoaDon> list = selectBySQL(SELECT_BY_ID_SQL, "%" + key + "%");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDon> selectByHDChoThanhToan() {
        return selectBySQL(SELECT_BY_CHOTT);
    }

    @Override
    public List<HoaDon> selectByTimKiem(String key) {
        List<HoaDon> list = selectBySQL(SELECT_BY_ID_SQL, "%" + key + "%");
        return list;
    }

    @Override
    public void update(HoaDon entity) {
        JdbcHelper.excuteUpdate(UPDATE_SQL, entity.getHinhThuc_TT(), entity.getHinhThucGiaoHang(), entity.getTrangThai_TT(), entity.getTienThuaTraKhach(), entity.getTongTien(),
                entity.getGhiChu(), entity.getMaHD());
    }

}
