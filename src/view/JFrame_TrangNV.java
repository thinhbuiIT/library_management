package view;

import java.awt.Dimension;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import model.Cache_NV;
import model.Data;
import model.Util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author abc
 */
public final class JFrame_TrangNV extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form JFrame_TrangChu
     */
    public JFrame_TrangNV() {
        initComponents();
        setTimer = Util.setTimer(bntTime, "dd-MM-yyyy hh:mm:ss");
        setTimer.start();
        this.setLocationRelativeTo(null);
        this.OnloadStaff();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        tbrChucNang = new javax.swing.JToolBar();
        bntNhanVien = new javax.swing.JButton();
        bntDocGia = new javax.swing.JButton();
        spr1 = new javax.swing.JToolBar.Separator();
        bntClear = new javax.swing.JButton();
        pnlStatus = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        bntTime = new javax.swing.JButton();
        lrp = new javax.swing.JLayeredPane();
        pnlNV = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        mnuList = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        tbrChucNang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbrChucNang.setFloatable(false);
        tbrChucNang.setOrientation(javax.swing.SwingConstants.VERTICAL);
        tbrChucNang.setRollover(true);
        tbrChucNang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbrChucNang.setDoubleBuffered(true);
        tbrChucNang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        bntNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bntNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/staff.png"))); // NOI18N
        bntNhanVien.setText("Nhân viên");
        bntNhanVien.setFocusable(false);
        bntNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bntNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        bntNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNhanVienActionPerformed(evt);
            }
        });
        tbrChucNang.add(bntNhanVien);

        bntDocGia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bntDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reading.png"))); // NOI18N
        bntDocGia.setText("Đọc giả");
        bntDocGia.setFocusable(false);
        bntDocGia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bntDocGia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        bntDocGia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDocGiaActionPerformed(evt);
            }
        });
        tbrChucNang.add(bntDocGia);
        tbrChucNang.add(spr1);

        bntClear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bntClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        bntClear.setText("Clear");
        bntClear.setFocusable(false);
        bntClear.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        bntClear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntClearActionPerformed(evt);
            }
        });
        tbrChucNang.add(bntClear);

        pnlStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT);
        flowLayout1.setAlignOnBaseline(true);
        pnlStatus.setLayout(flowLayout1);

        lblTrangThai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.gif"))); // NOI18N
        lblTrangThai.setText("TrangChu");
        pnlStatus.add(lblTrangThai);

        bntTime.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        bntTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clock.png"))); // NOI18N
        bntTime.setText("00:00 AM");
        bntTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntTimeActionPerformed(evt);
            }
        });
        pnlStatus.add(bntTime);

        lrp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout lrpLayout = new javax.swing.GroupLayout(lrp);
        lrp.setLayout(lrpLayout);
        lrpLayout.setHorizontalGroup(
            lrpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        lrpLayout.setVerticalGroup(
            lrpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        lblAnh.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lblAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/staff.png"))); // NOI18N
        lblAnh.setText("Tên nhân viên");
        lblAnh.setToolTipText("");
        lblAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblAnh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAnh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnlNVLayout = new javax.swing.GroupLayout(pnlNV);
        pnlNV.setLayout(pnlNVLayout);
        pnlNVLayout.setHorizontalGroup(
            pnlNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlNVLayout.setVerticalGroup(
            pnlNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        mnuList.add(jMenu1);

        jMenu2.setText("Edit");
        mnuList.add(jMenu2);

        setJMenuBar(mnuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbrChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                    .addComponent(lrp))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lrp))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbrChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNhanVienActionPerformed
        this.lblTrangThai.setIcon(new ImageIcon("./src/icons/employees.png"));
        this.pnl = new JPanel_QLNhanVien();
        this.setlayer();
    }//GEN-LAST:event_bntNhanVienActionPerformed

    private void bntTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntTimeActionPerformed
        if (setTimer.isRunning()) {
            setTimer.stop();
            lblTrangThai.setText("Stoped: " + new Date(evt.getWhen()));
        } else {
            lblTrangThai.setText("Ran at: " + new Date(evt.getWhen()));
            setTimer.start();
        }
    }//GEN-LAST:event_bntTimeActionPerformed

    private void bntDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDocGiaActionPerformed
//        pnl = new JPanel_DocGia();
//        this.setlayer();
    }//GEN-LAST:event_bntDocGiaActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        if (pnl != null) {
            pnl.setSize(lrp.getSize().width, lrp.getSize().height);
        }
    }//GEN-LAST:event_formComponentResized

    private void bntClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntClearActionPerformed
        this.lrp.removeAll();
        this.lrp.repaint();
        this.validate();

    }//GEN-LAST:event_bntClearActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_TrangNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrame_TrangNV().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntClear;
    private javax.swing.JButton bntDocGia;
    private javax.swing.JButton bntNhanVien;
    private javax.swing.JButton bntTime;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel lblAnh;
    public static javax.swing.JLabel lblTrangThai;
    private javax.swing.JLayeredPane lrp;
    private javax.swing.JMenuBar mnuList;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnlNV;
    private javax.swing.JPanel pnlStatus;
    private javax.swing.JToolBar.Separator spr1;
    private javax.swing.JToolBar tbrChucNang;
    // End of variables declaration//GEN-END:variables

    private final Timer setTimer;

    private void setlayer() {
        lrp.removeAll();
        if (pnl != null) {
            lblTrangThai.setText("Open: " + pnl.getName());
            pnl.setSize(lrp.getSize().width, lrp.getSize().height);
            this.lrp.add(pnl);
        }
        lrp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lrp.validate();
    }

    private void OnloadStaff() {
        Dimension size = this.pnlNV.getSize();
        ImageIcon img = Data.convert.Image(
                Cache_NV.getImg(), size.width - 10, size.height - 10
        );
        lblAnh.setIcon(img);
        lblAnh.setText(Cache_NV.getName());
    }
}
