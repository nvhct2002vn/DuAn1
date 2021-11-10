/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.DonViTinh;
import com.dienmaydo.entity.XuatXu;
import com.dienmaydo.iservice.IDonViTinhService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class DonViTinhService implements IDonViTinhService<DonViTinh, String> {

    String insert_SQL = "INSERT INTO dbo.XUATXU(NHASX,NUOCSX)VALUES(?,?)";
    String update_SQL = "UPDATE dbo.XUATXU SET NHASX = ? , NUOCSX = ? WHERE MAXX = ?";
    String delete_SQL = "DELETE FROM dbo.SANPHAM WHERE MASP = ?";
    String selectALL_SQL = "SELECT * FROM dbo.DONVITINH";
    String selectByID_SQL = "SELECT * FROM dbo.DONVITINH WHERE MADV = ?";

    @Override
    public void insertData(DonViTinh entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(DonViTinh entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DonViTinh> selectAll() {
        return this.selectBySQL(selectALL_SQL);
    }

    @Override
    public DonViTinh selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DonViTinh> selectBySQL(String sql, Object... args) {
        List<DonViTinh> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                DonViTinh entity = new DonViTinh();
                entity.setMaDV(rs.getString("MADV"));
                entity.setTenDV(rs.getString("TENDV"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
