/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author ThuSinh
 */
public class quanlixe_form extends javax.swing.JFrame {
    private DanhSachXeNoiThanh dsxenoi = new DanhSachXeNoiThanh();
    /**
     * Creates new form quanlixe_form
     */
    public quanlixe_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_soxe = new javax.swing.JTextField();
        tf_machuyen = new javax.swing.JTextField();
        tf_sochuyen = new javax.swing.JTextField();
        tf_doanhthu = new javax.swing.JTextField();
        tf_taixe = new javax.swing.JTextField();
        tf_sokmdi = new javax.swing.JTextField();
        bt_themxe = new javax.swing.JButton();
        bt_uudanhsachxe = new javax.swing.JButton();
        bt_modanhsach = new javax.swing.JButton();
        bt_thoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hienthi = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã chuyến:");

        jLabel2.setText("Số xe");

        jLabel3.setText("Số chuyến:");

        jLabel4.setText("Tài xế:");

        jLabel5.setText("Doanh thu:");

        jLabel6.setText("Số km đi:");

        tf_machuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_machuyenActionPerformed(evt);
            }
        });

        bt_themxe.setText("Thêm xe");
        bt_themxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themxeActionPerformed(evt);
            }
        });

        bt_uudanhsachxe.setText("Lưu danh sách xe");
        bt_uudanhsachxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_uudanhsachxeActionPerformed(evt);
            }
        });

        bt_modanhsach.setText("Mở danh sách xe");
        bt_modanhsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modanhsachActionPerformed(evt);
            }
        });

        bt_thoat.setText("Thoat");
        bt_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_thoatActionPerformed(evt);
            }
        });

        hienthi.setColumns(20);
        hienthi.setRows(5);
        jScrollPane1.setViewportView(hienthi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_themxe)
                        .addGap(48, 48, 48)
                        .addComponent(bt_uudanhsachxe)
                        .addGap(31, 31, 31)
                        .addComponent(bt_modanhsach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(bt_thoat)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_machuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_sochuyen))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)
                                .addComponent(tf_soxe)))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_taixe, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(tf_doanhthu)
                            .addComponent(tf_sokmdi))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_machuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_taixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(tf_soxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_doanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_sochuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_sokmdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_uudanhsachxe)
                    .addComponent(bt_modanhsach)
                    .addComponent(bt_themxe)
                    .addComponent(bt_thoat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_machuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_machuyenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_machuyenActionPerformed

    private void bt_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_thoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bt_thoatActionPerformed

    private void bt_uudanhsachxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_uudanhsachxeActionPerformed
        // TODO add your handling code here:
        
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView());
            int returnvalue = jfc.showSaveDialog(null);
            if(returnvalue == JFileChooser.APPROVE_OPTION){
                File selectedfile = jfc.getSelectedFile();
            
            try{
                FileOutputStream fos = new FileOutputStream(selectedfile.getAbsolutePath());
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(this.dsxenoi);
                oos.close();
            } catch(IOException ioex){
               JOptionPane.showMessageDialog(null,"Lỗi mở file lưu", "thông báo", JOptionPane.ERROR_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(null, "Đã lưu thành công");
            }
    }//GEN-LAST:event_bt_uudanhsachxeActionPerformed

    private void bt_modanhsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modanhsachActionPerformed
        // TODO add your handling code here:
         JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView());
        int returnvalue = jfc.showOpenDialog(null);
        if(returnvalue == JFileChooser.APPROVE_OPTION){
            File selectedfile = jfc.getSelectedFile();
            try{
                FileInputStream fis = new FileInputStream(selectedfile.getAbsolutePath());
                ObjectInputStream ois = new ObjectInputStream(fis);
                this.dsxenoi = (DanhSachXeNoiThanh)ois.readObject();
                ois.close();
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "IO erorr");
            }
            hienthi.setText(this.dsxenoi.toString()+ "\n");
            JOptionPane.showMessageDialog(null,"Đã đọc thành dòng", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_bt_modanhsachActionPerformed

    private void bt_themxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themxeActionPerformed
        // TODO add your handling code here:
        String mc = tf_machuyen.getText();
        String taixe = tf_taixe.getText();
        String soxe = tf_soxe.getText();
        double dt = Double.parseDouble(tf_doanhthu.getText());
        int sotuyen = Integer.parseInt(tf_sochuyen.getText());
        int sokmdi = Integer.parseInt(tf_sokmdi.getText());
        
        xenoithanh xenoi = new xenoithanh(mc, taixe, soxe,dt,sotuyen,sokmdi);
        if(dsxenoi.themMotXeNoiThanh(xenoi) == true)
            JOptionPane.showMessageDialog(null,"Đã thêm xe mới thành công", "Thông báo",JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"Việc thêm xe mới thất bại do trùng mã chuyến", "Thông báo",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_bt_themxeActionPerformed

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
            java.util.logging.Logger.getLogger(quanlixe_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanlixe_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanlixe_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanlixe_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quanlixe_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_modanhsach;
    private javax.swing.JButton bt_themxe;
    private javax.swing.JButton bt_thoat;
    private javax.swing.JButton bt_uudanhsachxe;
    private javax.swing.JTextArea hienthi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tf_doanhthu;
    private javax.swing.JTextField tf_machuyen;
    private javax.swing.JTextField tf_sochuyen;
    private javax.swing.JTextField tf_sokmdi;
    private javax.swing.JTextField tf_soxe;
    private javax.swing.JTextField tf_taixe;
    // End of variables declaration//GEN-END:variables

    private FileOutputStream FileOutputStream(String absolutePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
