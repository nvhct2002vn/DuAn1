package com.dienmaydo.service;

import com.dienmaydo.entity.HoaDon;
import com.dienmaydo.iservice.IHoaDonService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoaDonService implements IHoaDonService<HoaDon, String> {

    String INSERT_SQL = "INSERT INTO HOADON(MAHD,MANV,MAKH,MATTTT,MAHTTT,MAHTGH,TIENTHUATRAKHACH,TONGTIEN,GHICHU) VALUES(?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE HOADON SET MAHTTT = ?, MAHTGH = ?, MATTTT = ?, TIENTHUATRAKHACH = ?, TONGTIEN = ?, GHICHU = ? WHERE MAHD = ?";
    String SELECT_ALL_SQL = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "            JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
            + "			JOIN HINHTHUCGIAOHANG ON HINHTHUCGIAOHANG.MAHTGH = HOADON.MAHTGH\n"
            + "			JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT";
    String SELECT_BY_TIM_KIEM = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "            JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
            + "			JOIN HINHTHUCGIAOHANG ON HINHTHUCGIAOHANG.MAHTGH = HOADON.MAHTGH\n"
            + "			JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
            + "WHERE MAHD LIKE ? OR KHACHHANG.MAKH LIKE ? OR NHANVIEN.MANV LIKE ? OR TENKH LIKE ? OR TENNV LIKE ?";
    String SELECT_BY_ID_SQL = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "            JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
            + "			JOIN HINHTHUCGIAOHANG ON HINHTHUCGIAOHANG.MAHTGH = HOADON.MAHTGH\n"
            + "			JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
            + "WHERE MAHD LIKE ?";
    String SELECT_BY_CHOTT = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "			JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH "
            + "			JOIN HINHTHUCGIAOHANG ON HINHTHUCGIAOHANG.MAHTGH = HOADON.MAHTGH\n"
            + "			JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
            + "WHERE TENTTTT LIKE N'%CHỜ THANH TOÁN%'";
    String SELCT_BY_HINHTHUC = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "            JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
            + "			JOIN HINHTHUCGIAOHANG ON HINHTHUCGIAOHANG.MAHTGH = HOADON.MAHTGH\n"
            + "			JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
            + "WHERE TENHTTT LIKE ?";
    String SELCT_BY_TRANGTHAI = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "            JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
            + "			JOIN HINHTHUCGIAOHANG ON HINHTHUCGIAOHANG.MAHTGH = HOADON.MAHTGH\n"
            + "			JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
            + "WHERE TENTTTT LIKE ? ";
    String SELCT_BY_HINHTHUCGIAO = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "            JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
            + "			JOIN HINHTHUCGIAOHANG ON HINHTHUCGIAOHANG.MAHTGH = HOADON.MAHTGH\n"
            + "			JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
            + "WHERE TENHTGH LIKE ?";
    String SELCT_BY_TONGTIEN = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "            JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
            + "			JOIN HINHTHUCGIAOHANG ON HINHTHUCGIAOHANG.MAHTGH = HOADON.MAHTGH\n"
            + "			JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
            + "WHERE TONGTIEN BETWEEN ? AND ?";
    String SELECT_BY_THANG = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "            JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
            + "			JOIN HINHTHUCGIAOHANG ON HINHTHUCGIAOHANG.MAHTGH = HOADON.MAHTGH\n"
            + "			JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
            + "WHERE MONTH(NGAYLAP) = ?";
    String SELECT_BY_NAM = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "            JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
            + "			JOIN HINHTHUCGIAOHANG ON HINHTHUCGIAOHANG.MAHTGH = HOADON.MAHTGH\n"
            + "			JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
            + "WHERE YEAR(NGAYLAP) = ?";
    String SELECT_BY_NAM_AND_THANG = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "            JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
            + "			JOIN HINHTHUCGIAOHANG ON HINHTHUCGIAOHANG.MAHTGH = HOADON.MAHTGH\n"
            + "			JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
            + "WHERE MONTH(NGAYLAP) = ? AND YEAR(NGAYLAP) = ?";
    String SELECT_BY_TONGTIEN_MAX = "SELECT *\n"
            + "FROM HOADON JOIN NHANVIEN ON HOADON.MANV = NHANVIEN.MANV\n"
            + "            JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
            + "			JOIN HINHTHUCGIAOHANG ON HINHTHUCGIAOHANG.MAHTGH = HOADON.MAHTGH\n"
            + "			JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
            + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
            + "WHERE TONGTIEN >= ?";

    @Override
    public void insert(HoaDon entity) {
        JdbcHelper.excuteUpdate(INSERT_SQL, entity.getMaHD(), entity.getMaNV(), entity.getMaKH(), entity.getMaTTTT(), entity.getMaHTTT(), entity.getMaHTGH(),
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
                hd.setMaTTTT(rs.getString("MATTTT"));
                hd.setMaHTTT(rs.getString("MAHTTT"));
                hd.setMaHTGH(rs.getString("MAHTGH"));
                hd.setTenTTTT(rs.getString("TENTTTT"));
                hd.setTenHTTT(rs.getString("TENHTTT"));
                hd.setTenHTGH(rs.getString("TENHTGH"));
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
        List<HoaDon> list = selectBySQL(SELECT_BY_TIM_KIEM, "%" + key + "%", "%" + key + "%", "%" + key + "%", "%" + key + "%", "%" + key + "%");
        return list;
    }

    @Override
    public void update(HoaDon entity) {
        JdbcHelper.excuteUpdate(UPDATE_SQL, entity.getMaHTTT(), entity.getMaHTGH(), entity.getMaTTTT(), entity.getTienThuaTraKhach(), entity.getTongTien(),
                entity.getGhiChu(), entity.getMaHD());
    }

    @Override
    public List<HoaDon> selectByTrangThai(String key) {
        return selectBySQL(SELCT_BY_TRANGTHAI, "%" + key + "%");
    }

    @Override
    public List<HoaDon> selectByHinhThuc(String key) {
        return selectBySQL(SELCT_BY_HINHTHUC, "%" + key + "%");
    }

    @Override
    public List<HoaDon> selectByHinhThucGiao(String key) {
        return selectBySQL(SELCT_BY_HINHTHUCGIAO, "%" + key + "%");
    }

    public List<HoaDon> selectByTongTien(float key1, float key2) {
        return selectBySQL(SELCT_BY_TONGTIEN, key1, key2);
    }

    public List<HoaDon> selctByThangNam(String key1, String key2) {
        return selectBySQL(SELECT_BY_NAM_AND_THANG, key1, key2);
    }

    public List<HoaDon> selctByThang(String key) {
        return selectBySQL(SELECT_BY_THANG, key);
    }

    public List<HoaDon> selctByNam(String key) {
        return selectBySQL(SELECT_BY_NAM, key);
    }

    public List<HoaDon> selctByTongTienMax(float key) {
        return selectBySQL(SELECT_BY_TONGTIEN_MAX, key);
    }
}
