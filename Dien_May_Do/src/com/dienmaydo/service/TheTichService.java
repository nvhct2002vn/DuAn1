/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.DonViTinh;
import com.dienmaydo.entity.TheTich;
import com.dienmaydo.iservice.ITheTichService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class TheTichService implements ITheTichService<TheTich, String> {

    String selectALL_SQL = "SELECT * FROM dbo.THETICH";
    String selectByID_SQL = "SELECT * FROM dbo.THETICH WHERE MATHETICH = ?";

    @Override
    public void insertData(TheTich entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(TheTich entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TheTich> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public TheTich selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TheTich> selectBySQL(String sql, Object... args) {
        List<TheTich> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                TheTich entity = new TheTich();
                entity.setMaTheTich(rs.getString("MATHETICH"));
                entity.setTheTich(rs.getFloat("THETICH"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
