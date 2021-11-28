/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.NhanVien;
import com.dienmaydo.iservice.IVaiTroService;
import javax.swing.text.html.parser.Entity;
import com.dienmaydo.entity.VaiTro;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author letha
 */
public class VaiTroService implements IVaiTroService<VaiTro, String>{

    String SelectALL_SQL ="SELECT * FROM VAITRO";
    @Override
    public List<VaiTro> selectBySql(String sqlString, Object... args) {
        List<VaiTro> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sqlString, args);
            while (rs.next()) {
                VaiTro vt = new VaiTro();
                vt.setMaVT(rs.getString("MAVT"));
                vt.setTenVT(rs.getString("TENVT"));
               
                list.add(vt);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<VaiTro> selectAll() {
        return selectBySql(SelectALL_SQL);
    }

    @Override
    public void insertData(VaiTro entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(VaiTro entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VaiTro> selectByTimKiem(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
