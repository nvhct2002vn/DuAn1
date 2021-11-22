package com.dienmaydo.service;

import com.dienmaydo.entity.NhanVien;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.dienmaydo.iservice.INhanVienService;

public class NhanVienService implements INhanVienService<NhanVien, String> {

    String SELECT_ALL_SQL = "SELECT * FROM NHANVIEN";
    String SELECT_BY_ID = "SELECT * FROM NHANVIEN WHERE MANV LIKE ?";

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<NhanVien> selectBySql(String sqlString, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sqlString, args);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setMaVT(rs.getString("MAVT"));
                nv.setMatKhau(rs.getString("MATKHAU"));
                nv.setTenNV(rs.getString("TENNV"));
                nv.setDiaChi(rs.getString("DIACHI"));
                nv.setDienThoai(rs.getString("DIENTHOAI"));
                nv.setGioiTinh(rs.getBoolean("GIOITINH"));
                nv.setNgaySinh(rs.getDate("NGAYSINH"));
                nv.setTrangThai(rs.getString("TRANGTHAI"));
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public NhanVien selectByID(String key) {
        List<NhanVien> list = selectBySql(SELECT_BY_ID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public void insertData(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NhanVien> selectByTimKiem(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
