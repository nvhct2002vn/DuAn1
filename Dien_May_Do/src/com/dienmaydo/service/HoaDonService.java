package com.dienmaydo.service;

import com.dienmaydo.entity.HoaDon;
import com.dienmaydo.iservice.IHoaDonService;
import com.dienmaydo.utils.JdbcHelper;
import java.util.List;

public class HoaDonService implements IHoaDonService<HoaDon, String> {

    String UPDATE_SQL = "UPDATE HOADON SET TRANGTHAI_TT = ? WHERE MAHD = ?";
    String DELETE_SQL = "BEGIN TRY\n"
            + "	BEGIN TRAN\n"
            + "		DELETE FROM HOADONCHITIET WHERE MAHD = ?\n"
            + "		DELETE FROM HOADON WHERE MAHD = ?\n"
            + "	COMMIT TRAN\n"
            + "END TRY\n"
            + "BEGIN CATCH\n"
            + "	ROLLBACK TRAN\n"
            + "END CATCH";
    String SELECT_ALL_SQL = "SELECT * FROM HOADON";
    String SELECT_BY_ID_SQL = "SELECT * FROM HOADONCHITIET WHERE MAHD = ?";

    @Override
    public void update(HoaDon entity) {
        JdbcHelper.excuteUpdate(UPDATE_SQL, entity.getHinhThuc_TT(),entity.getMaHD());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.excuteUpdate(key, args);
    }

    @Override
    public void selectBySQL(String sqlString, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDon> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HoaDon selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
