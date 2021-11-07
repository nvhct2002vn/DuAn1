/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.SanPhamChiTiet;
import com.dienmaydo.iservice.ISanPhamService;
import java.util.List;

/**
 *
 * @author Nguyễn Viết Hiên
 */
public class SanPhamChiTietService implements ISanPhamService<SanPhamChiTiet, String> {

    String insert_SQL = "INSERT INTO dbo.ChuyenDe(MaCD,TenCD,HocPhi,ThoiLuong,Hinh,MoTa)VALUES(?,?,?,?,?,?)";
    String update_SQL = "UPDATE dbo.ChuyenDe SET TenCD = ?, HocPhi = ?, ThoiLuong = ?, Hinh = ?, MoTa = ? WHERE MaCD =?";
    String delete_SQL = "DELETE FROM dbo.ChuyenDe WHERE MaCD = ?";
    String selectALL_SQL = "SELECT * FROM dbo.ChuyenDe";
    String selectByID_SQL = "SELECT * FROM dbo.ChuyenDe WHERE MaCD = ?";

    @Override
    public void insertData(SanPhamChiTiet entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateData(SanPhamChiTiet entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SanPhamChiTiet> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SanPhamChiTiet selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SanPhamChiTiet> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
