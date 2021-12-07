package com.dienmaydo.gui;

import com.dienmaydo.entity.DanhMuc;
import com.dienmaydo.utils.Msgbox;
import com.dienmaydo.utils.XDate;
import com.dienmaydo.entity.KhuyenMai;
import com.dienmaydo.entity.SanPham;
import com.dienmaydo.entity.SanPhamChiTiet;
import com.dienmaydo.entity.SanPhamChiTietKhuyenMai;
import com.dienmaydo.service.DanhMucService;
import com.dienmaydo.service.KhuyenMaiService;
import com.dienmaydo.service.SanPhamChiTietService;
import com.dienmaydo.service.SanPhamChiTiet_KhuyenMaiService;
import com.dienmaydo.service.SanPhamService;
import com.dienmaydo.utils.Auth;
import com.dienmaydo.utils.JavaMail;
import com.dienmaydo.utils.XMoney;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class F_KhuyenMai extends javax.swing.JInternalFrame {
    
    DefaultTableModel model;
    KhuyenMaiService kmSV = new KhuyenMaiService();
    DanhMucService dmSV = new DanhMucService();
    SanPhamService spSV = new SanPhamService();
    SanPhamChiTietService spctSV = new SanPhamChiTietService();
    
    int row = -1;
    
    public F_KhuyenMai() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        setResizable(false);
        
        fillToTableSP();
        fillToSP();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaKM = new javax.swing.JTextField();
        txtTenCT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboHinhThuc = new javax.swing.JComboBox<>();
        txtGiamGia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        chkSelectAllSP = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dcBatDau = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dcKetThuc = new com.toedter.calendar.JDateChooser();
        btnLuu = new javax.swing.JButton();
        btnLammoi = new javax.swing.JButton();
        btnSua1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblDanhSachSP = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chương trình khuyến mại", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Tạo mã khuyến mại");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Tạo chương trình khuyến mại");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Hình thức giảm giá");

        cboHinhThuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giảm theo %", "Giảm theo số tiền" }));
        cboHinhThuc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboHinhThucItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Mức giảm giá");

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Boolean(false), null, null},
                { new Boolean(false), null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Select", "Mã sản phẩm", "Tên sản phẩm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblSanPham);

        chkSelectAllSP.setText("Select All");
        chkSelectAllSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkSelectAllSPItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cboHinhThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtGiamGia)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkSelectAllSP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtTenCT, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenCT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboHinhThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkSelectAllSP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Thời gian bắt đầu giảm giá");

        dcBatDau.setDateFormatString("dd-MM-yyyy");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Thời gian kết thúc giảm giá");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Mô tả");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Thời gian sử dụng");

        dcKetThuc.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(dcKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dcBatDau, dcKetThuc});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(dcBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dcBatDau, dcKetThuc});

        btnLuu.setBackground(new java.awt.Color(255, 204, 0));
        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(51, 51, 51));
        btnLuu.setText("Lưu ");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnLammoi.setBackground(new java.awt.Color(255, 204, 0));
        btnLammoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLammoi.setForeground(new java.awt.Color(51, 51, 51));
        btnLammoi.setText("Làm mới");
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        btnSua1.setBackground(new java.awt.Color(255, 204, 0));
        btnSua1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSua1.setText("Sửa");
        btnSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnLammoi)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua1)))
                        .addContainerGap())))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLuu, btnSua1});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khuyến mại", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblDanhSachSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khuyến mại", "Tên chương trình", "Hình thức giảm giá", "Giảm giá", "Sản phẩm", "Ngày bắt đầu", "Ngày kết thúc", "Trạng thái", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachSPMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblDanhSachSP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboHinhThucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHinhThucItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHinhThucItemStateChanged

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        row = tblSanPham.getSelectedRow();
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void chkSelectAllSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkSelectAllSPItemStateChanged
        // TODO add your handling code here:
        if (chkSelectAllSP.isSelected()) {
            for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                tblSanPham.setValueAt(true, i, 0);
            }
        } else {
            for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                tblSanPham.setValueAt(false, i, 0);
            }
        }
    }//GEN-LAST:event_chkSelectAllSPItemStateChanged

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
//        SanPhamChiTietKhuyenMai spctkm;
//        SanPhamChiTiet_KhuyenMaiService spctkmSV = new SanPhamChiTiet_KhuyenMaiService();
//        if (chkSelectAllSP.isSelected()) {
//            for (int i = 0; i < tblDanhSachSP.getRowCount(); i++) {
//                for (int j = 0; j < tblSanPham.getRowCount(); j++) {
//                    if (tblDanhSachSP.getValueAt(i, 4).toString().equalsIgnoreCase(tblSanPham.getValueAt(j, 2).toString()) && tblDanhSachSP.getValueAt(i, 7).toString().equalsIgnoreCase("Hết hạn")) {
//                        spctkm = new SanPhamChiTietKhuyenMai(txtMaKM.getText(), tblSanPham.getValueAt(j, 1).toString());
//                    }
//                }
//            }
//        } else if (Msgbox.confirm(this, "Bạn muốn thêm sản phẩm?")) {
//            
//            if (Validate()) {
//                return;
//            } else if (ischeckTrungSPCT()) {
//                Msgbox.alert(this, "Sản phẩm đã được khuyến mãi.Vui lòng chọn sản phẩm khác!!");
//                return;
//            } else if (isCheckTrungSPCT()) {
//                return;
//            } else {
//                insertKhuyenMaiSP();
//            }
//        }
        if (Msgbox.confirm(this, "Bạn muốn thêm sản phẩm?")) {
            
            if (Validate()) {
                return;
            } else if (ischeckTrungSPCT()) {
                Msgbox.alert(this, "Sản phẩm đã được khuyến mãi.Vui lòng chọn sản phẩm khác!!");
                return;
            } else if (isCheckTrungSPCT()) {
                return;
            } else {
                insertKhuyenMaiSP();
            }
        }
        
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void btnSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua1ActionPerformed
        // TODO add your handling code here:
        int rowUpdate = tblDanhSachSP.getSelectedRow();
        if (rowUpdate < 0) {
            Msgbox.alert(this, "Vui lòng chọn khuyến mại để sửa");
            return;
        } else if (Msgbox.confirm(this, "Bạn muốn sửa khuyến mại?")) {
            if (Validate()) {
                return;
            } else {
                updatetSP();
            }
        }
    }//GEN-LAST:event_btnSua1ActionPerformed

    private void tblDanhSachSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachSPMouseClicked
        // TODO add your handling code here:
        row = tblDanhSachSP.getSelectedRow();
        clicktblKhuyenMaiSP();
    }//GEN-LAST:event_tblDanhSachSPMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua1;
    private javax.swing.JComboBox<String> cboHinhThuc;
    private javax.swing.JCheckBox chkSelectAllSP;
    private com.toedter.calendar.JDateChooser dcBatDau;
    private com.toedter.calendar.JDateChooser dcKetThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblDanhSachSP;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTenCT;
    // End of variables declaration//GEN-END:variables

    private void fillToTableSP() {//sửa entity và service
        model = (DefaultTableModel) tblDanhSachSP.getModel();
        model.setRowCount(0);
        try {
            List<KhuyenMai> listKM = kmSV.selectAll();
            
            for (KhuyenMai x : listKM) {
                if (x.getHinhThuc().equalsIgnoreCase("Giảm theo %")) {
                    model.addRow(new Object[]{
                        x.getMaKM(), x.getTenChuongTrinh(), x.getHinhThuc(), x.getGiamGia() + " %", x.getTenSP() + " " + x.getTenSPCT(), x.getThoiGianBatDau(), x.getThoiGianKetThuc(), x.getTrangThai(), x.getMoTa()
                    });
                } else {
                    model.addRow(new Object[]{
                        x.getMaKM(), x.getTenChuongTrinh(), x.getHinhThuc(), XMoney.themDauCham(x.getGiamGia()) + " VNĐ", x.getTenSP() + " " + x.getTenSPCT(), x.getThoiGianBatDau(), x.getThoiGianKetThuc(), x.getTrangThai(), x.getMoTa()
                    });
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void clicktblKhuyenMaiSP() {
        
        try {
            for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                tblSanPham.setValueAt(false, i, 0);
            }
            tblDanhSachSP.getRowCount();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tblDanhSachSP.getValueAt(row, 5).toString());
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(tblDanhSachSP.getValueAt(row, 6).toString());
            dcBatDau.setDate(date);
            dcKetThuc.setDate(date1);
            txtMaKM.setText((String) tblDanhSachSP.getValueAt(tblDanhSachSP.getSelectedRow(), 0));
            txtTenCT.setText((String) tblDanhSachSP.getValueAt(tblDanhSachSP.getSelectedRow(), 1));
            if (tblDanhSachSP.getValueAt(row, 2).toString().equalsIgnoreCase("Giảm theo %")) {
                cboHinhThuc.setSelectedIndex(0);
            } else {
                cboHinhThuc.setSelectedIndex(1);
            }
            
            txtMoTa.setText((String) tblDanhSachSP.getValueAt(tblDanhSachSP.getSelectedRow(), 8));
            
            for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                if (tblDanhSachSP.getValueAt(row, 4).toString().equals(tblSanPham.getValueAt(row, 2))) {
                    
                    tblSanPham.setValueAt(true, row, 0);
                    
                }
            }
            dcBatDau.setDate(date);
            dcKetThuc.setDate(date1);
            
            txtGiamGia.setText(String.valueOf(tblDanhSachSP.getValueAt(tblDanhSachSP.getSelectedRow(), 3)));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
    }
    
    private void fillToSP() {
        DefaultTableModel model2 = (DefaultTableModel) tblSanPham.getModel();
        model2.setRowCount(0);
        try {
            List<SanPhamChiTiet> lstSP = spctSV.selectAll();
            for (SanPhamChiTiet x : lstSP) {
                model2.addRow(new Object[]{
                    x.getSelect(), x.getMaSPCT(), x.getTenSP() + " " + x.getTenSPCT()//khai báo thêm select bên entitySPCT
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void clearForm() {
        txtMaKM.setText("");
        txtTenCT.setText("");
        txtGiamGia.setText("");
        txtMoTa.setText("");
        cboHinhThuc.setSelectedIndex(0);
        dcBatDau.setDate(null);
        dcKetThuc.setDate(null);
    }
    
    KhuyenMai getForm() {
        KhuyenMai km = new KhuyenMai();
        km.setMaKM(txtMaKM.getText());
        km.setTenChuongTrinh(txtTenCT.getText());
        km.setHinhThuc(cboHinhThuc.getSelectedItem() + "");
        if (cboHinhThuc.getSelectedIndex() == 0) {
            km.setGiamGia(Long.parseLong(txtGiamGia.getText()));// lấy đến subtring -1
        } else {
            km.setGiamGia(Long.parseLong(txtGiamGia.getText()));
        }
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        Date nowDate = new Date();
        String hienTaiString = s.format(nowDate);
        String BatdauString = s.format(dcBatDau.getDate());
        String KetthucString = s.format(dcKetThuc.getDate());
        
        try {
            Date hientai = s.parse(hienTaiString);
            Date BatDau = s.parse(BatdauString);
            Date KetThuc = s.parse(KetthucString);
//            System.out.println("Ngày hiện tại: " + hientai + " Ngày băt đầu: " + BatDau + " Ngày kết thúc: " + KetThuc);
            if (hientai.equals(BatDau)) {
                km.setTrangThai("Đang áp dụng");
            }
            if (hientai.after(BatDau) && hientai.before(KetThuc)) {
                km.setTrangThai("Đang áp dụng");
            }
            if (hientai.before(BatDau)) {
                km.setTrangThai("Chưa được áp dụng");
            }
            if (hientai.equals(KetThuc)) {
                km.setTrangThai("Hết hạn");
            }
            if (hientai.after(KetThuc)) {
                km.setTrangThai("Hết hạn");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
// 1. bạn xử lý lấy getForm lấy thêm mã sản pphaamr
// 2. bạn insert như dòng 957
// 3. validate
// 4. tạo thêm pt nữa là cập nhật trạng thái
        km.setThoiGianBatDau(dcBatDau.getDate());
        km.setThoiGianKetThuc(dcKetThuc.getDate());
        km.setMoTa(txtMoTa.getText());
        return km;
    }
    
    void insertKhuyenMaiSP() {
        KhuyenMai kmsp = getForm();
        try {
            kmSV.insertData(kmsp);
            try {
                for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                    if (tblSanPham.getValueAt(i, 0).toString().equalsIgnoreCase("true")) {
                        KhuyenMai km = new KhuyenMai();
                        km.setMaKM(txtMaKM.getText());
                        km.setMaSPCT(tblSanPham.getValueAt(i, 1).toString());
                        kmSV.insertBangChung(km);
                    }
                }
            } catch (Exception e) {
            }
            fillToTableSP();
            Msgbox.alert(this, "Thêm khuyến mại sản phẩm thành công");
            clearForm();
        } catch (Exception e) {
            e.printStackTrace();
            Msgbox.alert(this, "Thêm khuyến mại sản phẩm thất bại");
        }
    }
    
    void updatetSP() {
        if (!Auth.isManager()) {
            Msgbox.alert(this, "Bạn không có quyền sửa sản phẩm");
        } else {
            KhuyenMai km = getForm();
            try {
                kmSV.updateData(km);
                fillToTableSP();
                clearForm();
                Msgbox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                e.printStackTrace();
                Msgbox.alert(this, "Cập nhật thất bại!");
            }
        }
    }

//------------------------Điều kiện check--------------------------------------
    boolean Validate() {
        try {
            if (txtMaKM.getText().trim().equals("")) {
                Msgbox.alert(this, "Mã khuyến mại đang để trống!!");
                return true;
            } else if (txtTenCT.getText().trim().equals("")) {
                Msgbox.alert(this, "Tên chương trình đang để trống!!");
                return true;
            } else if (txtGiamGia.getText().trim().equals("")) {
                Msgbox.alert(this, "Mức giảm giá đang để trống đang để trống!!");
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            Msgbox.alert(this, "Mức giảm giá phải là số");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
    
    boolean isCheckTrungSPCT() {
        boolean check = false;
        List<KhuyenMai> list = kmSV.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTenSPCT().equalsIgnoreCase(txtMaKM.getText())) {
                Msgbox.alert(this, "Mã khuyến mại đã tồn tại");
                check = true;
                break;
            }
        }
        return check;
    }
    
    private boolean ischeckTrungSPCT() {
        
        if (chkSelectAllSP.isSelected()) {
            return true;
        } else {
            for (int i = 0; i < tblDanhSachSP.getRowCount(); i++) {
                
                if (tblDanhSachSP.getValueAt(i, 4).toString().equalsIgnoreCase(tblSanPham.getValueAt(row, 2).toString()) && tblDanhSachSP.getValueAt(i, 7).toString().equalsIgnoreCase("Đang áp dụng")) {
                    return true;
                } else if (tblDanhSachSP.getValueAt(i, 4).toString().equalsIgnoreCase(tblSanPham.getValueAt(row, 2).toString()) && tblDanhSachSP.getValueAt(i, 7).toString().equalsIgnoreCase("Chưa được áp dụng")) {
                    return true;
                }
                if (tblDanhSachSP.getValueAt(i, 4).toString().equalsIgnoreCase(tblSanPham.getValueAt(row, 2).toString()) && tblDanhSachSP.getValueAt(i, 7).toString().equalsIgnoreCase("Hết hạn")) {
                    return false;
                }
            }
            
        }
        return false;
    }
}
