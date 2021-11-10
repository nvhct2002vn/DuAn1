/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.DonViTinh;
import com.dienmaydo.entity.MauSac;
import com.dienmaydo.iservice.IMauSacService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class MauSacService implements IMauSacService<MauSac, String> {

    String selectALL_SQL = "SELECT * FROM dbo.MAUSAC";
    String selectByID_SQL = "SELECT * FROM dbo.MAUSAC WHERE MAMAUSAC = ?";

    @Override
    public void insertData(MauSac entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(MauSac entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MauSac> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public MauSac selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MauSac> selectBySQL(String sql, Object... args) {
        List<MauSac> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                MauSac entity = new MauSac();
                entity.setMaMauSac(rs.getString("MAMAUSAC"));
                entity.setTenMauSac(rs.getString("TENMAUSAC"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
