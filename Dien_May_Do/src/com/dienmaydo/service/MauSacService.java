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

    String insert_SQL = "INSERT INTO dbo.MAUSAC(MAMAUSAC,TENMAUSAC)VALUES(?,?)";
    String update_SQL = "UPDATE dbo.MAUSAC SET TENMAUSAC = ? WHERE MAMAUSAC = ?";
    String selectALL_SQL = "SELECT * FROM dbo.MAUSAC";
    String selectByID_SQL = "SELECT * FROM dbo.MAUSAC WHERE MAMAUSAC = ?";

    @Override
    public void insertData(MauSac entity) {
        JdbcHelper.excuteUpdate(insert_SQL, entity.getMaMauSac(), entity.getTenMauSac());
    }

    @Override
    public void updateData(MauSac entity) {
        JdbcHelper.excuteUpdate(update_SQL, entity.getTenMauSac(), entity.getMaMauSac());
    }

    @Override
    public List<MauSac> selectAll() {
        return this.selectBySQL(selectALL_SQL);
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
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
