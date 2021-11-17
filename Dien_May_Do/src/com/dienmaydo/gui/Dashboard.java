/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.gui;

import com.dienmaydo.entity.HoaDon;
import com.dienmaydo.entity.HoaDonChiTiet;
import com.dienmaydo.utils.Auth;
import com.dienmaydo.utils.Msgbox;
import java.awt.Color;
import java.util.List;

/**
 *
 * @author DO TAT HOA
 */
public class Dashboard extends javax.swing.JFrame {

    Color defaultColor, clickColor;

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {// output của bạn đâu
        initComponents();
        setLocationRelativeTo(null);
        new F_DangNhap(this, true).setVisible(true);
        defaultColor = new Color(255, 204, 0);
        clickColor = new Color(153, 153, 153);

        danhMuc.setBackground(defaultColor);
        sanPham.setBackground(defaultColor);
        banHang.setBackground(defaultColor);
        hoaDon.setBackground(defaultColor);
        khuyenMai.setBackground(defaultColor);
        ThongKE.setBackground(defaultColor);
        NhanVien.setBackground(defaultColor);
        KhachHang.setBackground(defaultColor);
        thoat.setBackground(defaultColor);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        danhMuc = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JLabel();
        sanPham = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        banHang = new javax.swing.JPanel();
        lblBanHang = new javax.swing.JLabel();
        hoaDon = new javax.swing.JPanel();
        lblHoaDon = new javax.swing.JLabel();
        khuyenMai = new javax.swing.JPanel();
        lblKhuyenMai = new javax.swing.JLabel();
        thoat = new javax.swing.JPanel();
        lblThoat = new javax.swing.JLabel();
        NhanVien = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        KhachHang = new javax.swing.JPanel();
        lblKhachHang = new javax.swing.JLabel();
        ThongKE = new javax.swing.JPanel();
        lblThongKe = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        danhMuc.setBackground(new java.awt.Color(255, 204, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Danh mục");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout danhMucLayout = new javax.swing.GroupLayout(danhMuc);
        danhMuc.setLayout(danhMucLayout);
        danhMucLayout.setHorizontalGroup(
            danhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        danhMucLayout.setVerticalGroup(
            danhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(danhMuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 60));

        jPanel5.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtTenNhanVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTenNhanVien.setForeground(new java.awt.Color(51, 51, 51));
        txtTenNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTenNhanVien.setText("DO TAT HOA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTenNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenNhanVien)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 140));

        sanPham.setBackground(new java.awt.Color(255, 204, 0));

        lblSanPham.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(51, 51, 51));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setText("Sản phẩm");
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSanPhamMousePressed(evt);
            }
        });

        javax.swing.GroupLayout sanPhamLayout = new javax.swing.GroupLayout(sanPham);
        sanPham.setLayout(sanPhamLayout);
        sanPhamLayout.setHorizontalGroup(
            sanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        sanPhamLayout.setVerticalGroup(
            sanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(sanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 60));

        banHang.setBackground(new java.awt.Color(255, 204, 0));

        lblBanHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBanHang.setForeground(new java.awt.Color(51, 51, 51));
        lblBanHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanHang.setText("Bán Hàng");
        lblBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBanHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBanHangMousePressed(evt);
            }
        });

        javax.swing.GroupLayout banHangLayout = new javax.swing.GroupLayout(banHang);
        banHang.setLayout(banHangLayout);
        banHangLayout.setHorizontalGroup(
            banHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBanHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        banHangLayout.setVerticalGroup(
            banHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(banHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 60));

        hoaDon.setBackground(new java.awt.Color(255, 204, 0));

        lblHoaDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(51, 51, 51));
        lblHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoaDon.setText("Hóa đơn");
        lblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHoaDonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout hoaDonLayout = new javax.swing.GroupLayout(hoaDon);
        hoaDon.setLayout(hoaDonLayout);
        hoaDonLayout.setHorizontalGroup(
            hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        hoaDonLayout.setVerticalGroup(
            hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(hoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 220, 60));

        khuyenMai.setBackground(new java.awt.Color(255, 204, 0));

        lblKhuyenMai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblKhuyenMai.setForeground(new java.awt.Color(51, 51, 51));
        lblKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhuyenMai.setText("Khuyến mại");
        lblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhuyenMaiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblKhuyenMaiMousePressed(evt);
            }
        });

        javax.swing.GroupLayout khuyenMaiLayout = new javax.swing.GroupLayout(khuyenMai);
        khuyenMai.setLayout(khuyenMaiLayout);
        khuyenMaiLayout.setHorizontalGroup(
            khuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhuyenMai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        khuyenMaiLayout.setVerticalGroup(
            khuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(khuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 220, 60));

        thoat.setBackground(new java.awt.Color(255, 204, 0));

        lblThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblThoat.setForeground(new java.awt.Color(51, 51, 51));
        lblThoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThoat.setText("Thoát");
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblThoatMousePressed(evt);
            }
        });

        javax.swing.GroupLayout thoatLayout = new javax.swing.GroupLayout(thoat);
        thoat.setLayout(thoatLayout);
        thoatLayout.setHorizontalGroup(
            thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        thoatLayout.setVerticalGroup(
            thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThoat, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 220, 60));

        NhanVien.setBackground(new java.awt.Color(255, 204, 0));

        lblNhanVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(51, 51, 51));
        lblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhanVien.setText("Nhân viên");
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNhanVienMousePressed(evt);
            }
        });

        javax.swing.GroupLayout NhanVienLayout = new javax.swing.GroupLayout(NhanVien);
        NhanVien.setLayout(NhanVienLayout);
        NhanVienLayout.setHorizontalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        NhanVienLayout.setVerticalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 220, 60));

        KhachHang.setBackground(new java.awt.Color(255, 204, 0));

        lblKhachHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(51, 51, 51));
        lblKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHang.setText("Khách hàng");
        lblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblKhachHangMousePressed(evt);
            }
        });

        javax.swing.GroupLayout KhachHangLayout = new javax.swing.GroupLayout(KhachHang);
        KhachHang.setLayout(KhachHangLayout);
        KhachHangLayout.setHorizontalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        KhachHangLayout.setVerticalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(KhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 220, -1));

        ThongKE.setBackground(new java.awt.Color(255, 204, 0));

        lblThongKe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(51, 51, 51));
        lblThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongKe.setText("Thống kê");
        lblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblThongKeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ThongKELayout = new javax.swing.GroupLayout(ThongKE);
        ThongKE.setLayout(ThongKELayout);
        ThongKELayout.setHorizontalGroup(
            ThongKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        ThongKELayout.setVerticalGroup(
            ThongKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(ThongKE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 220, 60));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 220, 768));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1146, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        jPanel3.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -2, 1146, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        // TODO add your handling code here:
        danhMuc.setBackground(clickColor);
        sanPham.setBackground(defaultColor);
        banHang.setBackground(defaultColor);
        hoaDon.setBackground(defaultColor);
        khuyenMai.setBackground(defaultColor);
        ThongKE.setBackground(defaultColor);
        NhanVien.setBackground(defaultColor);
        KhachHang.setBackground(defaultColor);
        thoat.setBackground(defaultColor);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void lblSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMousePressed
        // TODO add your handling code here:
        danhMuc.setBackground(defaultColor);
        sanPham.setBackground(clickColor);
        banHang.setBackground(defaultColor);
        hoaDon.setBackground(defaultColor);
        khuyenMai.setBackground(defaultColor);
        ThongKE.setBackground(defaultColor);
        NhanVien.setBackground(defaultColor);
        KhachHang.setBackground(defaultColor);
        thoat.setBackground(defaultColor);
    }//GEN-LAST:event_lblSanPhamMousePressed

    private void lblBanHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMousePressed
        // TODO add your handling code here
        danhMuc.setBackground(defaultColor);
        sanPham.setBackground(defaultColor);
        banHang.setBackground(clickColor);
        hoaDon.setBackground(defaultColor);
        khuyenMai.setBackground(defaultColor);
        ThongKE.setBackground(defaultColor);
        NhanVien.setBackground(defaultColor);
        KhachHang.setBackground(defaultColor);
        thoat.setBackground(defaultColor);
    }//GEN-LAST:event_lblBanHangMousePressed

    private void lblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseClicked
        // TODO add your handling code here:
        F_HoaDon hd = new F_HoaDon();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(hd).setVisible(true);
    }//GEN-LAST:event_lblHoaDonMouseClicked

    private void lblKhuyenMaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhuyenMaiMousePressed
        // TODO add your handling code here:
        danhMuc.setBackground(defaultColor);
        sanPham.setBackground(defaultColor);
        banHang.setBackground(defaultColor);
        hoaDon.setBackground(defaultColor);
        khuyenMai.setBackground(clickColor);
        ThongKE.setBackground(defaultColor);
        NhanVien.setBackground(defaultColor);
        KhachHang.setBackground(defaultColor);
        thoat.setBackground(defaultColor);
    }//GEN-LAST:event_lblKhuyenMaiMousePressed

    private void lblThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMousePressed
        // TODO add your handling code here:
        danhMuc.setBackground(defaultColor);
        sanPham.setBackground(defaultColor);
        banHang.setBackground(defaultColor);
        hoaDon.setBackground(defaultColor);
        khuyenMai.setBackground(defaultColor);
        ThongKE.setBackground(clickColor);
        NhanVien.setBackground(defaultColor);
        KhachHang.setBackground(defaultColor);
        thoat.setBackground(defaultColor);
    }//GEN-LAST:event_lblThongKeMousePressed

    private void lblThoatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMousePressed
        // TODO add your handling code here:
        danhMuc.setBackground(defaultColor);
        sanPham.setBackground(defaultColor);
        banHang.setBackground(defaultColor);
        hoaDon.setBackground(defaultColor);
        khuyenMai.setBackground(defaultColor);
        ThongKE.setBackground(defaultColor);
        NhanVien.setBackground(defaultColor);
        KhachHang.setBackground(defaultColor);
        thoat.setBackground(clickColor);
    }//GEN-LAST:event_lblThoatMousePressed

    private void lblBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseClicked
        // TODO add your handling code here:
        F_BanHang b = new F_BanHang();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(b).setVisible(true);
    }//GEN-LAST:event_lblBanHangMouseClicked

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        // TODO add your handling code here:
        if (Msgbox.confirm(this, "Bạn muốn thoát ứng dụng ?")) {
            Auth.clear();
            System.exit(0);
        }
    }//GEN-LAST:event_lblThoatMouseClicked

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        SanPhamInterJfame b = new SanPhamInterJfame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(b).setVisible(true);
    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMousePressed
        // TODO add your handling code here:
        danhMuc.setBackground(defaultColor);
        sanPham.setBackground(defaultColor);
        banHang.setBackground(defaultColor);
        hoaDon.setBackground(clickColor);
        khuyenMai.setBackground(defaultColor);
        ThongKE.setBackground(defaultColor);
        NhanVien.setBackground(defaultColor);
        KhachHang.setBackground(defaultColor);
        thoat.setBackground(defaultColor);
    }//GEN-LAST:event_lblHoaDonMousePressed

    private void lblNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMousePressed
        // TODO add your handling code here:
        danhMuc.setBackground(defaultColor);
        sanPham.setBackground(defaultColor);
        banHang.setBackground(defaultColor);
        hoaDon.setBackground(defaultColor);
        khuyenMai.setBackground(defaultColor);
        ThongKE.setBackground(defaultColor);
        NhanVien.setBackground(clickColor);
        KhachHang.setBackground(defaultColor);
        thoat.setBackground(defaultColor);
    }//GEN-LAST:event_lblNhanVienMousePressed

    private void lblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangMouseClicked

    private void lblKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMousePressed
        // TODO add your handling code here:
        danhMuc.setBackground(defaultColor);
        sanPham.setBackground(defaultColor);
        banHang.setBackground(defaultColor);
        hoaDon.setBackground(defaultColor);
        khuyenMai.setBackground(defaultColor);
        ThongKE.setBackground(defaultColor);
        NhanVien.setBackground(defaultColor);
        KhachHang.setBackground(clickColor);
        thoat.setBackground(defaultColor);
    }//GEN-LAST:event_lblKhachHangMousePressed

    private void lblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhuyenMaiMouseClicked
        F_KhuyenMai km = new F_KhuyenMai();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(km).setVisible(true);
    }//GEN-LAST:event_lblKhuyenMaiMouseClicked

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked
        F_ThongKe fThongKe = new F_ThongKe();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(fThongKe).setVisible(true);
    }//GEN-LAST:event_lblThongKeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel KhachHang;
    private javax.swing.JPanel NhanVien;
    private javax.swing.JPanel ThongKE;
    private javax.swing.JPanel banHang;
    private javax.swing.JPanel danhMuc;
    private javax.swing.JPanel hoaDon;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel khuyenMai;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblKhuyenMai;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JPanel sanPham;
    private javax.swing.JPanel thoat;
    private javax.swing.JLabel txtTenNhanVien;
    // End of variables declaration//GEN-END:variables

}
