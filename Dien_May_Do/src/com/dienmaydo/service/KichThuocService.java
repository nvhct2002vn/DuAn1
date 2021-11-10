/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.KichThuoc;
import com.dienmaydo.entity.XuatXu;
import com.dienmaydo.iservice.IKichThuocService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class KichThuocService implements IKichThuocService<KichThuoc, String> {

    String selectALL_SQL = "SELECT * FROM dbo.KICHTHUOC";
    String selectByID_SQL = "SELECT * FROM dbo.KICHTHUOC WHERE MAKICHTHUOC = ?";

    @Override
    public void insertData(KichThuoc entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(KichThuoc entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KichThuoc> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public KichThuoc selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KichThuoc> selectBySQL(String sql, Object... args) {
        List<KichThuoc> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                KichThuoc entity = new KichThuoc();
                entity.setMaKichThuoc(rs.getString("MAKICHTHUOC"));
                entity.setMaDV(rs.getString("MADV"));
                entity.setChieuDai(rs.getFloat("CHIEUDAI"));
                entity.setChieuRong(rs.getFloat("CHIEURONG"));
                entity.setChieuCao(rs.getFloat("CHIEUCAO"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
