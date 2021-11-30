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

    String insert_SQL = "INSERT INTO dbo.CHATLIEU(MACHATLIEU,CHATLIEU)VALUES(?,?)";
    String update_SQL = "UPDATE dbo.CHATLIEU SET CHATLIEU = ? WHERE MACHATLIEU = ?";
    String selectALL_SQL = "SELECT * FROM dbo.CHATLIEU";
    String selectByID_SQL = "SELECT * FROM dbo.CHATLIEU WHERE MACHATLIEU = ?";

    @Override
    public void insertData(ChatLieu entity) {
        JdbcHelper.excuteUpdate(insert_SQL, entity.getMaChatLieu(), entity.getChatLieu());
    }

    @Override
    public void updateData(ChatLieu entity) {
        JdbcHelper.excuteUpdate(update_SQL, entity.getChatLieu(), entity.getMaChatLieu());
    }

    @Override
    public List<ChatLieu> selectAll() {
        return this.selectBySQL(selectALL_SQL);
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
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
