/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mvcView;

import javax.swing.JTable;
import javax.swing.JTextField;
import mvcController.ControllerHistory;

/**
 *
 * @author micha
 */
public class FormHistoryPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form HistoryPeminjaman
     */
    public FormHistoryPeminjaman() {
        initComponents();
        ctHistory = new ControllerHistory(this);
        ctHistory.isiTable();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdAdminDiHistory = new javax.swing.JTextField();
        txtIdBukuDiHistory = new javax.swing.JTextField();
        txtJudulDiHistory = new javax.swing.JTextField();
        txtNamaPeminjam = new javax.swing.JTextField();
        txtTglPinjam = new javax.swing.JTextField();
        txtTglPengembalian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataHistory = new javax.swing.JTable();
        btnSimpanDiHistory = new javax.swing.JButton();
        btnEditDiHistory = new javax.swing.JButton();
        btnResetDiHistory = new javax.swing.JButton();
        btnHapusDiHistory = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPencarianDiHistory = new javax.swing.JTextField();
        btnCariDiHistory = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtIdHistory = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("History Peminjaman Buku");

        jLabel2.setText("ID Admin");

        jLabel3.setText("ID Buku");

        jLabel4.setText("Judul");

        jLabel5.setText("Tanggal Peminjaman");

        jLabel6.setText("Nama Peminjam");

        jLabel7.setText("Tanggal Pengembalian");

        txtNamaPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaPeminjamActionPerformed(evt);
            }
        });

        tblDataHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tblDataHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataHistoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataHistory);

        btnSimpanDiHistory.setText("Simpan");
        btnSimpanDiHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanDiHistoryActionPerformed(evt);
            }
        });

        btnEditDiHistory.setText("Edit");
        btnEditDiHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDiHistoryActionPerformed(evt);
            }
        });

        btnResetDiHistory.setText("Reset");
        btnResetDiHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDiHistoryActionPerformed(evt);
            }
        });

        btnHapusDiHistory.setText("Hapus");
        btnHapusDiHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDiHistoryActionPerformed(evt);
            }
        });

        jLabel8.setText("Search");

        btnCariDiHistory.setText("Cari");
        btnCariDiHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariDiHistoryActionPerformed(evt);
            }
        });

        jLabel9.setText("ID History");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(335, 335, 335))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPencarianDiHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCariDiHistory)
                        .addGap(34, 34, 34))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(87, 87, 87)
                            .addComponent(txtIdBukuDiHistory))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)
                            .addComponent(txtJudulDiHistory))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(16, 16, 16)
                            .addComponent(txtTglPinjam))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(40, 40, 40)
                            .addComponent(txtNamaPeminjam))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTglPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSimpanDiHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditDiHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnResetDiHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapusDiHistory)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel9))
                            .addGap(75, 75, 75)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIdAdminDiHistory)
                                .addComponent(txtIdHistory))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtIdHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdAdminDiHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdBukuDiHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtJudulDiHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNamaPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTglPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanDiHistory)
                    .addComponent(btnEditDiHistory)
                    .addComponent(btnResetDiHistory)
                    .addComponent(btnHapusDiHistory))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPencarianDiHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariDiHistory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPeminjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaPeminjamActionPerformed

    private void btnHapusDiHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDiHistoryActionPerformed
        ctHistory.delete();
        ctHistory.isiTable();
        ctHistory.reset();
    }//GEN-LAST:event_btnHapusDiHistoryActionPerformed

    private void btnSimpanDiHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanDiHistoryActionPerformed
        ctHistory.insert();
        ctHistory.isiTable();
        ctHistory.reset();
    }//GEN-LAST:event_btnSimpanDiHistoryActionPerformed

    private void btnEditDiHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDiHistoryActionPerformed
        ctHistory.update();
        ctHistory.isiTable();
        ctHistory.reset();
    }//GEN-LAST:event_btnEditDiHistoryActionPerformed

    private void tblDataHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataHistoryMouseClicked
        int row = tblDataHistory.getSelectedRow();
        ctHistory.isiField(row);
    }//GEN-LAST:event_tblDataHistoryMouseClicked

    private void btnResetDiHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDiHistoryActionPerformed
        ctHistory.reset();
    }//GEN-LAST:event_btnResetDiHistoryActionPerformed

    private void btnCariDiHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariDiHistoryActionPerformed
        ctHistory.search();
        ctHistory.reset();
    }//GEN-LAST:event_btnCariDiHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(FormHistoryPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHistoryPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHistoryPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHistoryPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHistoryPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariDiHistory;
    private javax.swing.JButton btnEditDiHistory;
    private javax.swing.JButton btnHapusDiHistory;
    private javax.swing.JButton btnResetDiHistory;
    private javax.swing.JButton btnSimpanDiHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDataHistory;
    private javax.swing.JTextField txtIdAdminDiHistory;
    private javax.swing.JTextField txtIdBukuDiHistory;
    private javax.swing.JTextField txtIdHistory;
    private javax.swing.JTextField txtJudulDiHistory;
    private javax.swing.JTextField txtNamaPeminjam;
    private javax.swing.JTextField txtPencarianDiHistory;
    private javax.swing.JTextField txtTglPengembalian;
    private javax.swing.JTextField txtTglPinjam;
    // End of variables declaration//GEN-END:variables
    ControllerHistory ctHistory;

    public JTable getTabelData() {
        return tblDataHistory;
    }
    
    public JTextField gettxtIdHistory(){
        return txtIdHistory;
    }
    
    public JTextField gettxtIdAdmin(){
        return txtIdAdminDiHistory;
    }
    
    public JTextField gettxtIdBuku(){
        return txtIdBukuDiHistory;
    }
    
    public JTextField gettxtJudul(){
        return txtJudulDiHistory;
    }
    
    public JTextField gettxtTglPeminjaman(){
        return txtTglPinjam;
    }
    
    public JTextField gettxtNamaPeminjam(){
        return txtNamaPeminjam;
    }
    
    public JTextField gettxtTglPengembalian(){
        return txtTglPengembalian;
    }
    
    public JTextField gettxtCariNama(){
        return txtPencarianDiHistory;
    }
}
