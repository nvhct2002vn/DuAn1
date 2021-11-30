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

}
