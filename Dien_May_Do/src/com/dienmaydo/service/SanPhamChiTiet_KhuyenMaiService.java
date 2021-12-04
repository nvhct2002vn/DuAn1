/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.SanPhamChiTietKhuyenMai;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.dienmaydo.iservice.ISanPhamChiTiet_KhuyenMaiService;

/**
 *
 * @author MSI
 */
public class SanPhamChiTiet_KhuyenMaiService implements ISanPhamChiTiet_KhuyenMaiService<SanPhamChiTietKhuyenMai, String>{
    String INSERT_SQL = "INSERT INTO DBO.SANPHAMCHITIET_KHUYENMAI(MASPCTKM,MAKM,MASPCT) VALUES(?,?,?)";
    String Update_SQL = "Update DBO.SANPHAMCHITIET_KHUYENMAI SET MAKM =? , MASPCT =? WHERE MASPCTKM =?";
    String DELTE_SEL ="DELETE FROM DBO.SANPHAMCHITIET_KHUYENMAI WHERE MASPCTKM=?";
    String SELECT_ALL_SQL="SELECT*FROM DBO.SANPHAMCHITIET_KHUYENMAI";
    String SELECT_BY_ID="SELECT*FROM DBO.SANPHAMCHITIET_KHUYENMAI WHERE MAspctkm=?";

    @Override
    public void insertData(SanPhamChiTietKhuyenMai entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(SanPhamChiTietKhuyenMai entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SanPhamChiTietKhuyenMai> selectAll() {
         return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public SanPhamChiTietKhuyenMai selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SanPhamChiTietKhuyenMai> selectBySQL(String sql, Object... args) {
         List<SanPhamChiTietKhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                SanPhamChiTietKhuyenMai entity = new SanPhamChiTietKhuyenMai();
                entity.setMaSPCTKM(rs.getString("MASPCTKM"));
                entity.setMaKM(rs.getString("MAKM"));
                entity.setMaSPCT(rs.getString("MASPCT"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

   

   
}
