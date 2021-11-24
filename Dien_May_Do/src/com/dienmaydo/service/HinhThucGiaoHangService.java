package com.dienmaydo.service;

import com.dienmaydo.entity.HinhThucGiaoHang;
import com.dienmaydo.entity.HinhThucThanhToan;
import com.dienmaydo.iservice.IHinhThucGiaoHangService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HinhThucGiaoHangService implements IHinhThucGiaoHangService<HinhThucGiaoHang, String>{

    String SELECT_ALL = "SELECT * FROM HINHTHUCGIAOHANG";
    
    @Override
    public List<HinhThucGiaoHang> selectBySQL(String sql, Object... args) {
        List<HinhThucGiaoHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {                
                HinhThucGiaoHang httt = new HinhThucGiaoHang();
                httt.setMaHTGH(rs.getString("MAHTGH"));
                httt.setTenHTGH(rs.getString("TENHTGH"));
                list.add(httt);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<HinhThucGiaoHang> selectAll() {
        return selectBySQL(SELECT_ALL);
    }

}
