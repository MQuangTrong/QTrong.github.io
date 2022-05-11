/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmserver;


import db.Access;
import db.DBConnect;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import validate.untity;

/**
 *
 * @author Tran Quoc
 */
public class dangkitk extends javax.swing.JFrame {

    /**
     * Creates new form dangkitk
     */
    
    public dangkitk() {
        initComponents();
        setLocationRelativeTo(null);
        btnDangKy.setIcon(new ImageIcon("src/images/them.png"));
        btnTaoLai.setIcon(new ImageIcon("src/images/back.gif"));
        btnThoat.setIcon(new ImageIcon("src/images/quaylai.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnThoat = new javax.swing.JButton();
        txthovaten = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnDangKy = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnTaoLai = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtBirthday = new com.toedter.calendar.JDateChooser();
        txtsdt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmat = new javax.swing.JPasswordField();
        txtxacmk = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnDangKy.setText("Dăng Kí");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Nhập Thông Tin Khách Hàng");

        btnTaoLai.setText("Tạo Lại");
        btnTaoLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoLaiActionPerformed(evt);
            }
        });

        jLabel4.setText("Địa Chỉ");

        jLabel5.setText("Họ và Tên");

        jLabel7.setText("Email");

        jLabel9.setText("Giới tính");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel10.setText("Ngày sinh");

        jLabel11.setText("Số Điện Thoại");

        jLabel1.setText("Số tài khoản");

        jLabel12.setText("Tổng tiền");

        jLabel2.setText("Mật Khẩu");

        jLabel3.setText("Nhập lại MK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnDangKy)
                .addGap(38, 38, 38)
                .addComponent(btnTaoLai)
                .addGap(45, 45, 45)
                .addComponent(btnThoat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdoNam)
                        .addGap(36, 36, 36)
                        .addComponent(rdoNu)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtxacmk, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsdt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txthovaten, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 117, Short.MAX_VALUE))
                            .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTien, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmat, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtxacmk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangKy)
                    .addComponent(btnThoat)
                    .addComponent(btnTaoLai))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
            this.cancle();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        //dăng kí tài khoản.............
        
        String ma = txtMa.getText();
        String password = new String(txtmat.getPassword());
        String repassword = new String(txtxacmk.getPassword());
        String hovaten = txthovaten.getText();        
        String diachi = txtdiachi.getText();
        String sdt = txtsdt.getText();
        Date ngaysinh = txtBirthday.getDate();
        String email = txtEmail.getText();
        boolean gender = false;
        if (rdoNam.isSelected()) {
            gender = true;
        }
        if (rdoNu.isSelected()) {
            gender = false;
        }
        String tongtien = txtTien.getText();
        //validate..........
        String loi = "";
        if (ma.length()==0) {
            loi+="\n Số tài khoản không được để trống!!!";
        }else{
            if (!untity.checkStk(txtMa.getText())) {
                loi+="\n Số tài khoản phải là số và từ 10-15";
            }
        }
        if (hovaten.length()==0) {
            loi+="\n Họ tên không không được để trống!!!";
        }
        if (!untity.checkPhone(txtsdt.getText())) {
            loi+="\n Số điện thoại phải là số và phải dài từ 10-15";
        }
        if (email.length()==0) {
            loi+="\n Email không được để trống!!!";
        }else{
            if (!untity.checkEmail(txtEmail.getText())) {
                loi+="\n Email không đúng định dạng!!!";
            }
        }
        if (diachi.length()==0) {
            loi+="\n Địa chỉ không được để trống!!!";
        }
        if (ngaysinh == null) {
            loi+="\n Ngày sinh không được để trống!!!";
        }
        if (!rdoNam.isSelected() && !rdoNu.isSelected()) {
            loi+="\n Giới tinh không được để trống!!!";
        }
        float tien=0;
        if (tongtien.length()==0) {
            loi+="\n Tiền không được để trống!!!";
        }else{
            try {
                tien = Float.parseFloat(tongtien);
                if (tien<50000) {
                    loi+="\n Tiền phải là số dương hoặc Phải lớn hơn 50000";
                }
            } catch (Exception e) {
                loi+="\n Tiền phải bắt buộc là số!!!!";
            }
        }
        if (password.length()==0 && repassword.length()==0) {
            loi+="\n Mật khẩu Hoặc xác nhận mật khẩu không được để trống!!";
        }else{
            if(!password.equals(repassword)){
            JOptionPane.showMessageDialog(null, " loi mat khau ");
        }
            if (!untity.checkPass(new String (txtmat.getPassword()))) {
                loi+="\n Mật khẩu phải là số và chỉ được 6 kí tự!!!";
            }
        }
        
        if (loi.length()==0) {
            Connection con = null;
            CallableStatement cstmt = null;
            ResultSet rs = null;
            con = DBConnect.opConnection();
            try {
                
                cstmt = con.prepareCall("{call addNewCustomer (?,?,?,?,?,?,?,?,?)}");
                cstmt.setString(1, txtMa.getText());
                cstmt.setString(2, new String(txtmat.getPassword()));
                cstmt.setString(3, txthovaten.getText());
                cstmt.setString(4, txtdiachi.getText());
                cstmt.setDate(5, new java.sql.Date(ngaysinh.getTime()));
                cstmt.setString(6, txtEmail.getText());
                cstmt.setString(7, txtsdt.getText());
                cstmt.setString(8, txtTien.getText());
                cstmt.setBoolean(9, gender);
                int i = cstmt.executeUpdate();
                if (i>0) {
                    JOptionPane.showMessageDialog(null, "Đăng kí thông tin khách thành công");
                    this.clearForm();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Có lỗi khi đăng kí!!","THÔNG BÁO",JOptionPane.ERROR_MESSAGE);
            }finally{
                DBConnect.closeAll(con, cstmt, rs);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, loi,"THÔNG BÁO",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnTaoLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoLaiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnTaoLaiActionPerformed

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
            java.util.logging.Logger.getLogger(dangkitk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dangkitk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dangkitk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dangkitk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dangkitk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnTaoLai;
    private javax.swing.JButton btnThoat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private com.toedter.calendar.JDateChooser txtBirthday;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTien;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txthovaten;
    private javax.swing.JPasswordField txtmat;
    private javax.swing.JPasswordField txtmatkhau;
    private javax.swing.JPasswordField txtmatkhau1;
    private javax.swing.JPasswordField txtmatkhau2;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JPasswordField txtxacmk;
    // End of variables declaration//GEN-END:variables

    private void cancle() {
        panel p = new panel();
        Access.CanleAcess(p, this);
    }

    private void clearForm() {        
        txtdiachi.setText("");
        txtEmail.setText("");
        txtBirthday.setDate(new Date(0));
        buttonGroup1.clearSelection();
        txthovaten.setText("");
        txtsdt.setText("");
        txtMa.setText("");
        txtmat.setText("");
        txtxacmk.setText("");
        txtTien.setText("");
    }
}
