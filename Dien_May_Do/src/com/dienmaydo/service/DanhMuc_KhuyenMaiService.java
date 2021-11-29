/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.DanhMucKhuyenMai;
import com.dienmaydo.iservice.IDanhMuc_KhuyenMaiService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI
 */
public class DanhMuc_KhuyenMaiService implements IDanhMuc_KhuyenMaiService<DanhMucKhuyenMai, String>{
    String INSERT_SQL = "INSERT INTO DBO.DANHMUC_KHUYENMAI(MADMKM,MAKM,MADANHMUC) VALUES(?,?,?)";
    String Update_SQL = "Update DBO.DANHMUC_KHUYENMAI SET MAKM =? , MADANHMUC =? WHERE MADMKM =?";
    String DELTE_SEL ="DELETE FROM DBO.DANHMUC_KHUYENMAI WHERE MADMKM=?";
    String SELECT_ALL_SQL="SELECT*FROM DBO.DANHMUC_KHUYENMAI";
    String SELECT_BY_ID="SELECT*FROM DBO.DANHMUC_KHUYENMAI WHERE MADMKM=?";

    @Override
    public void insertData(DanhMucKhuyenMai entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(DanhMucKhuyenMai entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DanhMucKhuyenMai> selectAll() {
          return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public DanhMucKhuyenMai selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DanhMucKhuyenMai> selectBySQL(String sql, Object... args) {
         List<DanhMucKhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                DanhMucKhuyenMai entity = new DanhMucKhuyenMai();
                entity.setMaDMKM(rs.getString("MADMKM"));
                entity.setMaKM(rs.getString("MAKM"));
                entity.setMaDanhMuc(rs.getString("MADANHMUC"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

   
}
