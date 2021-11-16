package com.dienmaydo.service;

import com.dienmaydo.entity.TaiKhoan;
import com.dienmaydo.iservice.ITaiKhoanService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanService implements ITaiKhoanService<TaiKhoan, String> {

    String SELECT_ALL_SQL = "SELECT * FROM TAIKHOAN";
    String SELECT_BY_ID = "SELECT * FROM TAIKHOAN WHERE MANV LIKE ?";
 
    @Override
    public List<TaiKhoan> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<TaiKhoan> selectBySql(String sqlString, Object... args) {
        List<TaiKhoan> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sqlString, args);
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setMaNV(rs.getString("MANV"));
                tk.setMatKhau(rs.getString("MATKHAU"));
                tk.setMaVT(rs.getString("MAVT"));
                tk.setTrangThai(rs.getBoolean("TRANGTHAI"));
                list.add(tk);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public TaiKhoan selectByID(String key) {
        List<TaiKhoan> list = selectBySql(SELECT_BY_ID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
