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

    String insert_SQL = "INSERT INTO dbo.THETICH(MATHETICH,THETICH)VALUES(?,?)";
    String update_SQL = "UPDATE dbo.THETICH SET THETICH = ? WHERE MATHETICH = ?";
    String selectALL_SQL = "SELECT * FROM dbo.THETICH";
    String selectByID_SQL = "SELECT * FROM dbo.THETICH WHERE MATHETICH = ?";

    @Override
    public void insertData(TheTich entity) {
        JdbcHelper.excuteUpdate(insert_SQL, entity.getMaTheTich(), entity.getTheTich());
    }

    @Override
    public void updateData(TheTich entity) {
        JdbcHelper.excuteUpdate(update_SQL, entity.getTheTich(), entity.getMaTheTich());
    }

    @Override
    public List<TheTich> selectAll() {
        return this.selectBySQL(selectALL_SQL);
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
