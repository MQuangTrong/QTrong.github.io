/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_java;

import db.Access;
import db.DBConnect;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import validate.untity;

/**
 *
 * @author Tran Quoc
 */
public class naptien extends javax.swing.JFrame {

    /**
     * Creates new form naptien
     */
    public  String stk ="";
    public naptien() {
        initComponents();
        setLocationRelativeTo(null);
        lblhinhanh.setIcon(new ImageIcon("src/images/banner.png"));
         btnYES.setIcon(new ImageIcon("src/images/thuchien.png"));
        btnNO.setIcon(new ImageIcon("src/images/exit.png"));
        btnNapTien.setIcon(new ImageIcon("src/images/tru.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnYES = new javax.swing.JButton();
        btnNO = new javax.swing.JButton();
        lblhinhanh = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnhapsotien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnNapTien = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtSotaikhoan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Bạn Có Muốn Thực Hiện Giao Dịch Khác Không ?");

        btnYES.setText("yes");
        btnYES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYESActionPerformed(evt);
            }
        });

        btnNO.setText("no");
        btnNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOActionPerformed(evt);
            }
        });

        jLabel1.setText("Nhập Số Tiền ");

        jLabel2.setText("VNĐ");

        btnNapTien.setText("Nạp Tiền");
        btnNapTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNapTienActionPerformed(evt);
            }
        });

        jLabel4.setText("Số Tài Khoản:");

        txtSotaikhoan.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblhinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnYES)
                                .addGap(42, 42, 42)
                                .addComponent(btnNO)
                                .addGap(60, 60, 60)))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnhapsotien, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(txtSotaikhoan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)
                        .addComponent(btnNapTien)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblhinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSotaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnhapsotien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNapTien)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYES)
                    .addComponent(btnNO))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYESActionPerformed
        stk = txtSotaikhoan.getText();
        Connection con = null;
        ResultSet rs = null;
        CallableStatement cstmt = null;
        con = DBConnect.opConnection();
        try {
            cstmt = con.prepareCall("{call getCustomerId (?)}");
            cstmt.setString(1, stk);
            rs = cstmt.executeQuery();
            if (rs.next()) {
                giaodien gd = new giaodien();
                gd.loadName(stk);
                Access.CanleAcess(gd, this);

            }
            //
            //
            //
            //
        } catch (SQLException ex) {
            Logger.getLogger(giaodien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnYESActionPerformed

    private void btnNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOActionPerformed
        nhapSTK stk = new nhapSTK();
        stk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNOActionPerformed

    private void btnNapTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNapTienActionPerformed
        Date day = null;
        stk = txtSotaikhoan.getText();
        String ruttien = txtnhapsotien.getText();
        float sotiennap = 0;
        float tongtien = 0;

        if (ruttien.length() == 0 && !untity.checkTien(txtnhapsotien.getText())) {
            JOptionPane.showMessageDialog(null, "Lỗi", "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
        } else {
            sotiennap = Float.parseFloat(txtnhapsotien.getText());
            if (sotiennap % 50000 != 0) {
                JOptionPane.showMessageDialog(null, "Số tiền không hợp lệ", "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
            } else {
                Connection con = null;
                ResultSet rs = null;
                CallableStatement cstmt = null;
                con = DBConnect.opConnection();
                try {
                    cstmt = con.prepareCall("{call getCustomerId(?)}");
                    cstmt.setString(1, stk);
                    rs = cstmt.executeQuery();
                    while (rs.next()) {
                        cstmt = con.prepareCall("{call getCustomer}");
                        tongtien = rs.getFloat("Money");
                        sotiennap = Float.parseFloat(txtnhapsotien.getText());
                        tongtien = tongtien + sotiennap;
                        
                            cstmt = con.prepareCall("{call updateMoney(?,?)}");
                            cstmt.setString(1, txtSotaikhoan.getText());
                            cstmt.setFloat(2, tongtien);
                            int i = cstmt.executeUpdate();
                            if (i > 0) {
                                JOptionPane.showMessageDialog(null, "Nạp tiền thành công");
                                //  tien hanh lap bien lai
                                cstmt = con.prepareCall("{call insertHistory (?,?,?,?)}");
                                cstmt.setInt(1, 4);
                                cstmt.setString(2, stk);

                                cstmt.setDate(3, day);
                                cstmt.setString(4, txtnhapsotien.getText());
                                int k = cstmt.executeUpdate();
                                if (k > 0) {
                                    if (JOptionPane.showConfirmDialog(null, "Bạn muốn nhận biên lai", "", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                                        cstmt = con.prepareCall("{call getHistory}");
                                        rs = cstmt.executeQuery();
                                        while (rs.next()) {
                                            Object[] dt = {
                                                rs.getString("Sotaikhoan"),
                                                rs.getString("Id"),
                                                rs.getString("MaId"),
                                                rs.getString("Reason"),
                                                rs.getString("Sotien"),
                                                rs.getString("Date"),
                                                rs.getString("Content"),};
                                            ObjectOutputStream ghi = null;
                                            try {
                                                ghi = new ObjectOutputStream(new FileOutputStream("src/data/bienlai.txt"));
                                                ghi.writeObject(dt);
                                            } catch (IOException ex) {
                                                Logger.getLogger(ruttien.class.getName()).log(Level.SEVERE, null, ex);
                                            } finally {
                                                try {
                                                    ghi.close();
                                                } catch (IOException ex) {
                                                    Logger.getLogger(ruttien.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            }

                                        }
                                    } else {
                                    }

                                    this.clear();
                                }
                            }
                         

                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Nạp tiền không thành công!!!", "LOI", JOptionPane.ERROR_MESSAGE);
                } finally {
                    DBConnect.closeAll(con, cstmt, rs);
                }

            }
        }
        
    }//GEN-LAST:event_btnNapTienActionPerformed

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
            java.util.logging.Logger.getLogger(naptien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(naptien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(naptien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(naptien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new naptien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNO;
    private javax.swing.JButton btnNapTien;
    private javax.swing.JButton btnYES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblhinhanh;
    private javax.swing.JTextField txtSotaikhoan;
    private javax.swing.JTextField txtnhapsotien;
    // End of variables declaration//GEN-END:variables

    void loadnt(String stk) {
        Connection con = null;
        ResultSet rs = null;
        CallableStatement cstmt = null;
        con = DBConnect.opConnection();
        try {
            cstmt = con.prepareCall("{call getCustomerId(?)}");
            cstmt.setString(1, stk);
            rs = cstmt.executeQuery();
            while (rs.next()) {
                cstmt = con.prepareCall("{call getCustomer}");
                txtSotaikhoan.setText(stk);

            }
        } catch (SQLException ex) {
            Logger.getLogger(dangnhapATM.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBConnect.closeAll(con, cstmt, rs);
        }
    }

    private void clear() {
        txtnhapsotien.setText("");
    }
}
