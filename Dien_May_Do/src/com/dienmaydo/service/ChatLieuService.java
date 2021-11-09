/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.ChatLieu;
import com.dienmaydo.entity.XuatXu;
import com.dienmaydo.iservice.IChatLieuService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class ChatLieuService implements IChatLieuService<ChatLieu, String> {

    String selectALL_SQL = "SELECT * FROM dbo.CHATLIEU";
    String selectByID_SQL = "SELECT * FROM dbo.CHATLIEU WHERE MACHATLIEU = ?";

    @Override
    public void insertData(ChatLieu entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(ChatLieu entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChatLieu> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public ChatLieu selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChatLieu> selectBySQL(String sql, Object... args) {
        List<ChatLieu> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                ChatLieu entity = new ChatLieu();
                entity.setMaChatLieu(rs.getString("MACHATLIEU"));
                entity.setChatLieu(rs.getString("CHATLIEU"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
