/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.Image;
import com.dienmaydo.entity.KhoiLuong;
import com.dienmaydo.iservice.IImageService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class ImageService implements IImageService<Image, String> {

    String selectALL_SQL = "SELECT * FROM dbo._IMAGE";
    String selectByID_SQL = "SELECT * FROM dbo._IMAGE WHERE MAIMAGE = ?";

    @Override
    public void insertData(Image entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(Image entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Image> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public Image selectByID(String key) {
        List<Image> list = this.selectBySQL(selectByID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Image> selectBySQL(String sql, Object... args) {
        List<Image> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                Image entity = new Image();
                entity.setMaImage(rs.getString("MAIMAGE"));
                entity.setTenHinh(rs.getString("TENHINH"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
