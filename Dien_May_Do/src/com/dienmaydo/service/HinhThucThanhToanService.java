package com.dienmaydo.service;

import com.dienmaydo.entity.HinhThucThanhToan;
import com.dienmaydo.iservice.IHinhThucThanhToanService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HinhThucThanhToanService implements IHinhThucThanhToanService<HinhThucThanhToan, String> {

    String SELECT_ALL = "SELECT * FROM HINHTHUCTHANHTOAN";

    @Override
    public List<HinhThucThanhToan> selectBySQL(String sql, Object... args) {
        List<HinhThucThanhToan> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {                
                HinhThucThanhToan httt = new HinhThucThanhToan();
                httt.setMaHTTT(rs.getString("MAHTTT"));
                httt.setTenHTTT(rs.getString("TENHTTT"));
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
    public List<HinhThucThanhToan> selectAll() {
        return selectBySQL(SELECT_ALL);
    }

}
