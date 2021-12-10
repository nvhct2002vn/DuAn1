/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author VINH
 */
public class ThongKeService {

    private List<Object[]> getListOfArrList(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getThongKe(int nam) {
        String sql = "{CALL SP_TABLETKTT(?)}";
        String[] cols = {"TENSANPHAM", "SOLUONGSP", "GIABANCAONHAT", "GIABANTHAPNHAT", "DOANHTHU"};
        return this.getListOfArrList(sql, cols, nam);
    }

    public List<Object[]> getThongKeTheoDM(String danhMuc) {
        String sql = "{CALL SP_CBBDM(?)}";
        String[] cols = {"TENSANPHAM", "SOLUONGSP", "GIABANCAONHAT", "GIABANTHAPNHAT", "DOANHTHU"};
        return this.getListOfArrList(sql, cols, danhMuc);
    }

    public List<Object[]> getHangHuy(int nam) {
        String sql = "{CALL SP_HANGHUY(?)}";
        String[] cols = {"MAHOADON", "TONGTIEN", "HINHTHUCTHANHTOAN", "NGAYLAPHOADON", "TENKHACHHANG", "GHICHU"};
        return this.getListOfArrList(sql, cols, nam);
    }

    public List<Object[]> getTableThongKe() {
        String sql = "		SELECT\n"
                + "			TENSP AS TENSANPHAM,\n"
                + "			HOADONCHITIET.SOLUONG AS SOLUONGSP,\n"
                + "			MAX(GIABAN) AS GIABANCAONHAT,\n"
                + "			MIN(GIABAN) AS GIABANTHAPNHAT,\n"
                + "			TONGTIEN AS DOANHTHU\n"
                + "		FROM HOADON JOIN HOADONCHITIET ON HOADONCHITIET.MAHD = HOADON.MAHD\n"
                + "					JOIN SANPHAMCHITIET ON SANPHAMCHITIET.MASPCT = HOADONCHITIET.MASPCT\n"
                + "					JOIN SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
                + "					JOIN DANHMUC ON DANHMUC.MADANHMUC = SANPHAM.MADANHMUC\n"
                + "		GROUP BY TENSP, HOADONCHITIET.SOLUONG, TONGTIEN";
        String[] cols = {"TENSANPHAM", "SOLUONGSP", "GIABANCAONHAT", "GIABANTHAPNHAT", "DOANHTHU"};
        return this.getListOfArrList(sql, cols);
    }

    public List<Object[]> getTableHangHuy() {
        String sql = "		SELECT\n"
                + "			MAHD AS MAHOADON,\n"
                + "			TONGTIEN AS TONGTIEN,\n"
                + "			TENHTTT AS HINHTHUCTHANHTOAN,\n"
                + "			NGAYLAP AS NGAYLAPHOADON,\n"
                + "			TENKH AS TENKHACHHANG,\n"
                + "			GHICHU AS GHICHU\n"
                + "		FROM HOADON JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
                + "					JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
                + "					JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
                + "		WHERE TRANGTHAITHANHTOAN.MATTTT = 'TT003'\n"
                + "		GROUP BY MAHD,TONGTIEN,TENHTTT,NGAYLAP,TENKH,GHICHU";
        String[] cols = {"MAHOADON", "TONGTIEN", "HINHTHUCTHANHTOAN", "NGAYLAPHOADON", "TENKHACHHANG", "GHICHU"};
        return this.getListOfArrList(sql, cols);
    }

    public List<Object[]> selectByTimKiem(String tenSP) {
        String sql = "SELECT\n"
                + "			TENSP AS TENSANPHAM,\n"
                + "			HOADONCHITIET.SOLUONG AS SOLUONGSP,\n"
                + "			MAX(GIABAN) AS GIABANCAONHAT,\n"
                + "			MIN(GIABAN) AS GIABANTHAPNHAT,\n"
                + "			TONGTIEN AS DOANHTHU\n"
                + "		FROM HOADON JOIN HOADONCHITIET ON HOADONCHITIET.MAHD = HOADON.MAHD\n"
                + "					JOIN SANPHAMCHITIET ON SANPHAMCHITIET.MASPCT = HOADONCHITIET.MASPCT\n"
                + "					JOIN SANPHAM ON SANPHAM.MASP = SANPHAMCHITIET.MASP\n"
                + "					JOIN DANHMUC ON DANHMUC.MADANHMUC = SANPHAM.MADANHMUC\n"
                + "		WHERE TENSP = ?\n"
                + "		GROUP BY TENSP, HOADONCHITIET.SOLUONG, TONGTIEN";
        String[] cols = {"TENSANPHAM", "SOLUONGSP", "GIABANCAONHAT", "GIABANTHAPNHAT", "DOANHTHU"};
        return this.getListOfArrList(sql, cols, tenSP);
    }

    public List<Object[]> selectTimKiemToHangHuy(String maHD) {
        String sql = "SELECT\n"
                + "MAHD AS MAHOADON,\n"
                + "TONGTIEN AS TONGTIEN,\n"
                + "TENHTTT AS HINHTHUCTHANHTOAN,\n"
                + "NGAYLAP AS NGAYLAPHOADON,\n"
                + "TENKH AS TENKHACHHANG,\n"
                + "GHICHU AS GHICHU\n"
                + "FROM HOADON JOIN TRANGTHAITHANHTOAN ON TRANGTHAITHANHTOAN.MATTTT = HOADON.MATTTT\n"
                + "			JOIN HINHTHUCTHANHTOAN ON HINHTHUCTHANHTOAN.MAHTTT = HOADON.MAHTTT\n"
                + "			JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH\n"
                + "WHERE MAHD = ? AND TRANGTHAITHANHTOAN.MATTTT = 'TT003'\n"
                + "GROUP BY MAHD,TONGTIEN,TENHTTT,NGAYLAP,TENKH,GHICHU";
        String[] cols = {"MAHOADON", "TONGTIEN", "HINHTHUCTHANHTOAN", "NGAYLAPHOADON", "TENKHACHHANG", "GHICHU"};
        return this.getListOfArrList(sql, cols, maHD);
    }
// Doanh Thu Theo Tháng

    public List<Integer> selectDoanhThuTheoThang1() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where MONTH(NGAYLAP) = 1";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoThang2() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where MONTH(NGAYLAP) = 2";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoThang3() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where MONTH(NGAYLAP) = 3";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoThang4() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where MONTH(NGAYLAP) = 4";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoThang5() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where MONTH(NGAYLAP) = 5";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoThang6() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where MONTH(NGAYLAP) = 6";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoThang7() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where MONTH(NGAYLAP) = 7";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoThang8() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where MONTH(NGAYLAP) = 8";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoThang9() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where MONTH(NGAYLAP) = 9";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoThang10() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where MONTH(NGAYLAP) = 10";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoThang11() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where MONTH(NGAYLAP) = 11";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoThang12() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where MONTH(NGAYLAP) = 12";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // Số Hóa Đơn Theo Tháng
    public List<Integer> selectHDTheoThang1() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where MONTH(NGAYLAP) = 1";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoThang2() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where MONTH(NGAYLAP) = 2";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoThang3() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where MONTH(NGAYLAP) = 3";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoThang4() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where MONTH(NGAYLAP) = 4";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoThang5() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where MONTH(NGAYLAP) = 5";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoThang6() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where MONTH(NGAYLAP) = 6";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoThang7() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where MONTH(NGAYLAP) = 7";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoThang8() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where MONTH(NGAYLAP) = 8";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoThang9() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where MONTH(NGAYLAP) = 9";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoThang10() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where MONTH(NGAYLAP) = 10";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoThang11() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where MONTH(NGAYLAP) = 11";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoThang12() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where MONTH(NGAYLAP) = 12";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // Số Hóa Đơn Hủy Theo Tháng
    public List<Integer> selectHDHuyTheoThang1() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE MONTH(NGAYLAP) = 1 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoThang2() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE MONTH(NGAYLAP) = 2 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoThang3() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE MONTH(NGAYLAP) = 3 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoThang4() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE MONTH(NGAYLAP) = 4 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoThang5() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE MONTH(NGAYLAP) = 5 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoThang6() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE MONTH(NGAYLAP) = 6 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoThang7() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE MONTH(NGAYLAP) = 7 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoThang8() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE MONTH(NGAYLAP) = 8 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoThang9() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE MONTH(NGAYLAP) = 9 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoThang10() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE MONTH(NGAYLAP) = 10 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoThang11() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE MONTH(NGAYLAP) = 11 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoThang12() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE MONTH(NGAYLAP) = 12 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // Số Khách Hàng Theo Tháng
    public List<Integer> selectKHTheoThang1() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = 1";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoThang2() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = 2";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoThang3() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = 3";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoThang4() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = 4";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoThang5() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = 5";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoThang6() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = 6";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoThang7() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = 7";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoThang8() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = 8";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoThang9() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = 9";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoThang10() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = 10";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoThang11() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = 11";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoThang12() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = 12";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    //Doanh Thu Theo Năm
    public List<Integer> selectDoanhThuTheoNam2019() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where YEAR(NGAYLAP) = 2019";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoNam2020() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where YEAR(NGAYLAP) = 2020";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoNam2021() {
        String sql = "SELECT SUM(TONGTIEN) TBTIEN FROM HOADON where YEAR(NGAYLAP) = 2021";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // Số Hóa Đơn Theo Năm
    public List<Integer> selectHDTheoNam2019() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where YEAR(NGAYLAP) = 2019";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoNam2020() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where YEAR(NGAYLAP) = 2020";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDTheoNam2021() {
        String sql = "SELECT COUNT(MAHD) TBSOHD FROM HOADON where YEAR(NGAYLAP) = 2021";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // Hóa Đơn Hủy Theo Năm
    public List<Integer> selectHDHuyTheoNam2019() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE YEAR(NGAYLAP) = 2019 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoNam2020() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE YEAR(NGAYLAP) = 2020 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectHDHuyTheoNam2021() {
        String sql = "SELECT COUNT(MAHD) HDHUY FROM HOADON WHERE YEAR(NGAYLAP) = 2021 AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // Khách Hàng Theo Năm
    public List<Integer> selectKHTheoNam2019() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE YEAR(NGAYLAP) = 2019";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoNam2020() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE YEAR(NGAYLAP) = 2020";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectKHTheoNam2021() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) KH FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE YEAR(NGAYLAP) = 2021";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

public List<Integer> baoCaoDoanhThuHienTai() {
        String sql = "SELECT SUM(TONGTIEN) DOANHTHU FROM HOADON where MONTH(NGAYLAP) = MONTH(GETDATE())";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> baoCaoSoHDHienTai() {
        String sql = "SELECT COUNT(MAHD) SOHOADON FROM HOADON WHERE MONTH(NGAYLAP) = MONTH(GETDATE())";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> baoCaoSoHDHuyHienTai() {
        String sql = "SELECT COUNT(MAHD) SOHOADONHUY FROM HOADON WHERE MONTH(NGAYLAP) = MONTH(GETDATE()) AND MATTTT = 'TT003'";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> baoCaoSoKHHienTai() {
        String sql = "SELECT COUNT(KHACHHANG.MAKH) SOKHACHHANG FROM KHACHHANG JOIN HOADON ON HOADON.MAKH = KHACHHANG.MAKH WHERE MONTH(NGAYLAP) = MONTH(GETDATE())";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
