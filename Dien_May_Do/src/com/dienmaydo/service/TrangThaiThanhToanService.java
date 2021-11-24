
package com.dienmaydo.service;

import com.dienmaydo.entity.TrangThaiThanhToan;
import com.dienmaydo.iservice.ITrangThaiThanhToanService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class TrangThaiThanhToanService implements ITrangThaiThanhToanService<TrangThaiThanhToan, String>{
     String SELECT_ALL = "SELECT * FROM TRANGTHAITHANHTOAN";

    @Override
    public List<TrangThaiThanhToan> selectBySQL(String sql, Object... args) {
        List<TrangThaiThanhToan> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {                
                TrangThaiThanhToan httt = new TrangThaiThanhToan();
                httt.setMaTTTT(rs.getString("MATTTT"));
                httt.setTenTTT(rs.getString("TENTTTT"));
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
    public List<TrangThaiThanhToan> selectAll() {
        return selectBySQL(SELECT_ALL);
    }
    
   
}
