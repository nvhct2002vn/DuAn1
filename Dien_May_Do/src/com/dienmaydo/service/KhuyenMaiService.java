/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.service;

import com.dienmaydo.entity.KhuyenMai;
import com.dienmaydo.iservice.IKhuyenMaiService;
import com.dienmaydo.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI
 */
public class KhuyenMaiService implements IKhuyenMaiService<KhuyenMai, String> {

    String INSERT_SQL = "insert into dbo.KHUYENMAI(MAKM, TENCT,HINHTHUC,BATDAU,KETTHUC,GIAMGIA,TRANGTHAI,MOTA) VALUES(?,?,?,?,?,?,?,?)"
            + "insert into dbo.DANHMUC_KHUYENMAI values(?,?,?)";
    String UPDATE_SQL = "UPDATE dbo.KHUYENMAI SET TENCT = ? , HINHTHUC = ? , BATDAU = ? , KETTHUC = ? , GIAMGIA = ? , TRANGTHAI = ? , MOTA = ? WHERE MAKM = ?";
    String DELETE_SQL = "BEGIN TRY\n"
            + "	BEGIN TRAN\n"
            + "		DELETE FROM dbo.SANPHAMCHITIET_KHUYENMAI WHERE MAKM = ?\n"
            + "		DELETE FROM dbo.KHUYENMAI WHERE MAKM = ?\n"
            + "	COMMIT TRAN\n"
            + "END TRY\n"
            + "BEGIN CATCH\n"
            + "	ROLLBACK TRAN\n"
            + "END CATCH";
    String SELECT_ALL_SQL = "SELECT dbo.KHUYENMAI.MAKM , TENCT,HINHTHUC,GIAMGIA ,dbo.SANPHAMCHITIET.TENSPCT,dbo.SANPHAM.TENSP,dbo.DANHMUC.TENDM,BATDAU,KETTHUC,KHUYENMAI.TRANGTHAI,KHUYENMAI.MOTA\n"
            + "from DBO.KHUYENMAI JOIN DBO.SANPHAMCHITIET_KHUYENMAI ON DBO.KHUYENMAI.MAKM = DBO.SANPHAMCHITIET_KHUYENMAI.MAKM\n"
            + "				   JOIN DBO.SANPHAMCHITIET ON DBO.SANPHAMCHITIET_KHUYENMAI.MASPCT = DBO.SANPHAMCHITIET.MASPCT\n"
            + "				   JOIN dbo.SANPHAM ON dbo.SANPHAMCHITIET.MASP = dbo.SANPHAM.MASP\n"
            + "				   JOIN dbo.DANHMUC ON DBO.SANPHAM.MADANHMUC = DBO.DANHMUC.MADANHMUC";

    String SELECT_BY_ID_SQL = "SELECT dbo.KHUYENMAI.MAKM , TENCT,HINHTHUC,GIAMGIA ,dbo.SANPHAMCHITIET.TENSPCT,dbo.SANPHAM.TENSP,dbo.DANHMUC.TENDM,BATDAU,KETTHUC,KHUYENMAI.TRANGTHAI,KHUYENMAI.MOTA\n"
            + "from DBO.KHUYENMAI JOIN DBO.SANPHAMCHITIET_KHUYENMAI ON DBO.KHUYENMAI.MAKM = DBO.SANPHAMCHITIET_KHUYENMAI.MAKM\n"
            + "				   JOIN DBO.SANPHAMCHITIET ON DBO.SANPHAMCHITIET_KHUYENMAI.MASPCT = DBO.SANPHAMCHITIET.MASPCT\n"
            + "				   JOIN dbo.SANPHAM ON dbo.SANPHAMCHITIET.MASP = dbo.SANPHAM.MASP\n"
            + "				   JOIN dbo.DANHMUC ON DBO.SANPHAM.MADANHMUC = DBO.DANHMUC.MADANHMUC\n"
            + "				   where DBO.KHUYENMAI.MAKM = ?";

    @Override
    public void insertData(KhuyenMai entity) {
        try {
            JdbcHelper.excuteUpdate(INSERT_SQL, entity.getMaKM(), entity.getTenChuongTrinh(), entity.getHinhThuc(), entity.getThoiGianBatDau(), entity.getThoiGianKetThuc(),
                    entity.getGiamGia(), entity.getTrangThai(), entity.getMoTa());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(KhuyenMai entity) {
        try {
            JdbcHelper.excuteUpdate(UPDATE_SQL, entity.getTenChuongTrinh(), entity.getHinhThuc(), entity.getThoiGianBatDau(), entity.getThoiGianKetThuc(),
                    entity.getGiamGia(), entity.getTrangThai(), entity.getMoTa(), entity.getMaKM());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteData(String key) {
        try {
            JdbcHelper.excuteUpdate(DELETE_SQL, key, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<KhuyenMai> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public KhuyenMai selectByID(String key) {
        List<KhuyenMai> list = this.selectBySQL(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhuyenMai> selectBySQL(String sql, Object... args) {
        List<KhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                KhuyenMai entity = new KhuyenMai();
                entity.setMaKM(rs.getString("MaKM"));
                entity.setTenChuongTrinh(rs.getString("TenCT"));
                entity.setHinhThuc(rs.getString("HinhThuc"));
                entity.setGiamGia(rs.getFloat("GiamGia"));
                entity.setTenDM(rs.getString("TenDM"));
                entity.setTenSP(rs.getString("tensp"));
                entity.setTenSPCT(rs.getString("TenSPCT"));
                entity.setThoiGianBatDau(rs.getDate("BatDau"));
                entity.setThoiGianKetThuc(rs.getDate("KetThuc"));
                entity.setTrangThai(rs.getString("TrangThai"));
                entity.setMoTa(rs.getString("MoTa"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

}
