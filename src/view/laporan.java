/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import javax.swing.*;
import javax.swing.UIManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.konek;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Innetawati
 */
public class laporan extends javax.swing.JFrame {

    private Connection conn = new konek().connect();
    public static int status = 0;
    public String harian, bulanan, tahunan;
    private DefaultTableModel tabmode;
    

    /**
     * Creates new form laporan
     */
    public laporan() {
        initComponents();
      setLocationRelativeTo(null);
        kosong();
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        Locale locale = new Locale("id","ID");
        Locale.setDefault(locale);
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        btnlaporan = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btncetakbarang = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCetaksSupplier = new javax.swing.JButton();
        btnTransaksiMasuk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 230, 219));

        jDateChooser1.setIcon(null);
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Bulan-", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Tahun-", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnlaporan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnlaporan.setText("Laporan Transaksi Keluar");
        btnlaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaporanActionPerformed(evt);
            }
        });

        btncetakbarang.setText("Laporan Barang");
        btncetakbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakbarangActionPerformed(evt);
            }
        });

        jButton1.setText("Cetak");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(244, 230, 219));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Laporan Transaksi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Laporan PerTanggal");

        jLabel3.setText("Laporan PerBulan");

        jLabel4.setText("Laporan PerTahun");

        btnCetaksSupplier.setText("Laporan Supplier");
        btnCetaksSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetaksSupplierActionPerformed(evt);
            }
        });

        btnTransaksiMasuk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTransaksiMasuk.setText("Laporan Transaksi Masuk");
        btnTransaksiMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiMasukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnlaporan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(btncetakbarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCetaksSupplier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTransaksiMasuk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btncetakbarang)
                .addGap(18, 18, 18)
                .addComponent(btnCetaksSupplier)
                .addGap(28, 28, 28)
                .addComponent(btnTransaksiMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(93, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        try {
            if (jDateChooser1.getDate() != null) {
                String pattern = "yyyy-MM-dd";
                SimpleDateFormat format = new SimpleDateFormat(pattern);
                harian = String.valueOf(format.format(jDateChooser1.getDate()));
            cetakhari();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
       bulan();
       
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
         tahun();
  
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnlaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaporanActionPerformed
        // TODO add your handling code here    
        try{
            String path="src/report/laporanfull.jasper";
            JasperPrint print = JasperFillManager.fillReport(path,null,conn);
            JasperViewer.viewReport(print,false);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(rootPane,"Dokumen Tidak Ada"+ex);
        }kosong();
    }//GEN-LAST:event_btnlaporanActionPerformed

    private void btncetakbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakbarangActionPerformed
        // TODO add your handling code here:
         try{
            String path="src/report/laporanbarang.jasper";
            JasperPrint print = JasperFillManager.fillReport(path,null,conn);
            JasperViewer.viewReport(print,false);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(rootPane,"Dokumen Tidak Ada"+ex);
        }kosong();
    }//GEN-LAST:event_btncetakbarangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tahun();
        bulan();
          cetakbulandantahun();
          kosong();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCetaksSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetaksSupplierActionPerformed
        // TODO add your handling code here:
         try{
            String path="src/report/laporansupplier.jasper";
            JasperPrint print = JasperFillManager.fillReport(path,null,conn);
            JasperViewer.viewReport(print,false);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(rootPane,"Dokumen Tidak Ada"+ex);
        }kosong();
    }//GEN-LAST:event_btnCetaksSupplierActionPerformed

    private void btnTransaksiMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiMasukActionPerformed
        // TODO add your handling code here    
        try{
            String path="src/report/laporanfull_msk.jasper";
            JasperPrint print = JasperFillManager.fillReport(path,null,conn);
            JasperViewer.viewReport(print,false);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(rootPane,"Dokumen Tidak Ada"+ex);
        }kosong();
    }//GEN-LAST:event_btnTransaksiMasukActionPerformed

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
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetaksSupplier;
    private javax.swing.JButton btnTransaksiMasuk;
    private javax.swing.JButton btncetakbarang;
    private javax.swing.JButton btnlaporan;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
public void tahun() {
        String thn = "";
        if (jComboBox1.getSelectedItem() == "2016") {
            thn = "2016-";
        } else if (jComboBox1.getSelectedItem() == "2017") {
            thn = "2017-";
        } else if (jComboBox1.getSelectedItem() == "2018") {
            thn = "2018-";
        } else if (jComboBox1.getSelectedItem() == "2019") {
            thn = "2019-";
        } else if (jComboBox1.getSelectedItem() == "2020") {
            thn = "2020-";
        } else if (jComboBox1.getSelectedItem() == "2021") {
            thn = "2021-";
        } else if (jComboBox1.getSelectedItem() == "2022") {
            thn = "2022-";
        } else if (jComboBox1.getSelectedItem() == "2023") {
            thn = "2023-";
        } else if (jComboBox1.getSelectedItem() == "2024") {
            thn = "2024-";
        } else if (jComboBox1.getSelectedItem() == "2025") {
            thn = "2025-";
        } else if (jComboBox1.getSelectedItem() == "2026") {
            thn = "2026-";
        }
        jTextField1.setText(thn);
    }

    public void bulan() {
        String bln = "";
        if (jComboBox2.getSelectedItem() == "Januari") {
            bln = "01-";
        } else if (jComboBox2.getSelectedItem() == "Februari") {
            bln = "02-";
        } else if (jComboBox2.getSelectedItem() == "Maret") {
            bln = "03-";
        } else if (jComboBox2.getSelectedItem() == "April") {
            bln = "04-";
        } else if (jComboBox2.getSelectedItem() == "Mei") {
            bln = "05-";
        } else if (jComboBox2.getSelectedItem() == "Juni") {
            bln = "06-";
        } else if (jComboBox2.getSelectedItem() == "Juli") {
            bln = "07-";
        } else if (jComboBox2.getSelectedItem() == "Agustus") {
            bln = "08-";
        } else if (jComboBox2.getSelectedItem() == "September") {
            bln = "09-";
        } else if (jComboBox2.getSelectedItem() == "Oktober") {
            bln = "10-";
        } else if (jComboBox2.getSelectedItem() == "November") {
            bln = "11-";
        } else if (jComboBox2.getSelectedItem() == "Desember") {
            bln = "12-";
        }
        jTextField2.setText(bln);
    }


 


    private void kosong() {
    
        jTextField1.setText("");
        jTextField2.setText("");
        jComboBox1.setSelectedItem("-Tahun-");
        jComboBox2.setSelectedItem("-Bulan-");
        jDateChooser1.setDate(null);
    }

    public void cetakhari() {
        try {
            String namaFile2 = "src/report/laporan.jasper";
            HashMap parameter = new HashMap();
            parameter.put("NTA", String.valueOf(harian));
            JasperPrint jasperPrint = JasperFillManager.fillReport(namaFile2, parameter, conn);
            JasperViewer.viewReport(jasperPrint);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }kosong();
    }
    

    public void cetakbulandantahun() {
        try {

            String path = "src/report/laporan.jasper";
            HashMap parameter = new HashMap();
            parameter.put("NTA", String.valueOf(jTextField1.getText())
             + String.valueOf(jTextField2.getText()));
            File reportfile = new File (path);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(reportfile.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}