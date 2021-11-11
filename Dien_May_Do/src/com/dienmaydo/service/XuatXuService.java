/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.XuatXu;
import com.dienmaydo.iservice.IXuatXuService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class XuatXuService implements IXuatXuService<XuatXu, String> {

    String insert_SQL = "INSERT INTO dbo.XUATXU(NHASX,NUOCSX)VALUES(?,?)";
    String update_SQL = "UPDATE dbo.XUATXU SET NHASX = ? , NUOCSX = ? WHERE MAXX = ?";
    String delete_SQL = "DELETE FROM dbo.SANPHAM WHERE MASP = ?";
    String selectALL_SQL = "SELECT * FROM dbo.XUATXU";
    String selectByID_SQL = "SELECT * FROM dbo.XUATXU WHERE MAXX = ?";

    @Override
    public void insertData(XuatXu entity) {
        try {
            JdbcHelper.excuteUpdate(insert_SQL, entity.getNhaSX(), entity.getNuocSX());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(XuatXu entity) {
        try {
            JdbcHelper.excuteUpdate(update_SQL, entity.getNhaSX(), entity.getNuocSX(), entity.getMaXX());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteData(String key) {
        try {
            JdbcHelper.excuteUpdate(delete_SQL, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<XuatXu> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public XuatXu selectByID(String key) {
        List<XuatXu> list = this.selectBySQL(selectByID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<XuatXu> selectByMaXX(String NuocXX) {
        String sql = "SELECT * FROM dbo.XUATXU WHERE NUOCSX = ?";
        return selectBySQL(sql, NuocXX);
    }

    @Override
    public List<XuatXu> selectBySQL(String sql, Object... args) {
        List<XuatXu> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                XuatXu entity = new XuatXu();
                entity.setMaXX(rs.getInt("MAXX"));
                entity.setNhaSX(rs.getString("NHASX"));
                entity.setNuocSX(rs.getString("NUOCSX"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
