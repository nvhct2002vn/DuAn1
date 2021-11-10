/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.KhoiLuong;
import com.dienmaydo.entity.XuatXu;
import com.dienmaydo.iservice.IKhoiLuongService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class KhoiLuongService implements IKhoiLuongService<KhoiLuong, String> {

    String selectALL_SQL = "SELECT * FROM dbo.KHOILUONG";
    String selectByID_SQL = "SELECT * FROM dbo.KHOILUONG WHERE MAKL = ?";

    @Override
    public void insertData(KhoiLuong entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(KhoiLuong entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KhoiLuong> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public KhoiLuong selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KhoiLuong> selectBySQL(String sql, Object... args) {
        List<KhoiLuong> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                KhoiLuong entity = new KhoiLuong();
                entity.setMaKL(rs.getString("MAKL"));
                entity.setMaDV(rs.getString("MADV"));
                entity.setKhoiLuong(rs.getFloat("KHOILUONG"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
