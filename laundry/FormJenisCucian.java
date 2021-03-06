/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import laundry.connect;
import javax.swing.table.DefaultTableModel;/*
/**
 *
 * @author asus
 */
public class FormJenisCucian extends javax.swing.JFrame {

    /**
     * Creates new form FormJenisCucian
     */
    public FormJenisCucian() {
        initComponents();
        datable();
    }

   public void datable(){
        
        DefaultTableModel tbl=new DefaultTableModel();
        tbl.addColumn("Id Pengguna");
        tbl.addColumn("Jenis Cucian");
        tbl.addColumn("Harga");
        tbcucian.setModel(tbl);
        try{
            Statement statement=(Statement) connect.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from tb_jeniscucian");
            while(res.next())
            {
                tbl.addRow(new Object[]{            
                res.getString("id_jeniscucian"),
                res.getString("jenis_cucian"),
                res.getString("harga")
                
            });
            tbcucian.setModel(tbl);
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "salah");
        
        }
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
        txtidcucian = new javax.swing.JTextField();
        txtnamacucian = new javax.swing.JTextField();
        txttarif = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcucian = new javax.swing.JTable();
        btntambah = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-hair-dryer-40.png"))); // NOI18N
        jLabel1.setText("Jenis Cucian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Cucian");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tarif");

        txtidcucian.setBackground(new java.awt.Color(0, 102, 153));

        txtnamacucian.setBackground(new java.awt.Color(0, 102, 153));
        txtnamacucian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamacucianActionPerformed(evt);
            }
        });

        txttarif.setBackground(new java.awt.Color(0, 102, 153));

        tbcucian.setBackground(new java.awt.Color(0, 102, 153));
        tbcucian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbcucian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcucianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbcucian);

        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-30.png"))); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png"))); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-cancel-30.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-google-web-search-30.png"))); // NOI18N
        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-tuttp-30.png"))); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(btntambah)
                    .addComponent(btnhapus)
                    .addComponent(btnsimpan))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnkeluar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btncari)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnamacucian, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(txtidcucian))
                            .addComponent(txttarif, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtidcucian, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtnamacucian, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txttarif, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btntambah)
                            .addComponent(btncari)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnkeluar))
                .addGap(27, 27, 27)
                .addComponent(btnhapus)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(785, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        txtidcucian.setText("");
        txtnamacucian.setText("");
        txttarif.setText("");
    }//GEN-LAST:event_btntambahActionPerformed

    private void txtnamacucianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamacucianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamacucianActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        String id = txtidcucian.getText();
        String jenis= txtnamacucian.getText();
        String tarif= txttarif.getText();
        
        
        
        
        
        try {
            Statement statement=(Statement) connect.GetConnection().createStatement();
            statement.executeUpdate("insert into tb_jeniscucian VALUES ('" + id + "', '" + jenis + "', '" + tarif +"' )");
            statement.close();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
        }catch (Exception t) {
            JOptionPane.showMessageDialog(null, "data gagal disimpan");
        }
        datable();
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        String id = txtidcucian.getText();
        try {
            Statement statement = (Statement) connect.GetConnection().createStatement();
            statement.executeUpdate("DELETE from tb_jeniscucian where id_jeniscucian=('" + id + "');");
            JOptionPane.showMessageDialog(null, "data berhasil di HAPUS");
            txtidcucian.setText("");
            txtnamacucian.setText("");
            txttarif.setText("");
         

        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Data gagal di HAPUS");
                    
        }
        datable();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
        try{
            Statement statement = (Statement) connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from tb_jeniscucian where " + "id_jeniscucian='" + txtidcucian.getText() + "'");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Id ");
            tbl.addColumn("Jenis Cucian");
            tbl.addColumn("Harga");
            
            tbcucian.setModel(tbl);
            
            while(res.next()){
                tbl.addRow(new Object[]{
                    res.getString("id_jeniscucian"),
                    res.getString("jenis_cucian"),
                    res.getString("harga"),
                    
                });
                tbcucian.setModel(tbl);
            }
        }catch(Exception t){
            JOptionPane.showMessageDialog(rootPane,"salah");
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void tbcucianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcucianMouseClicked
        // TODO add your handling code here:
       int baris = tbcucian.rowAtPoint(evt.getPoint());
       String id = tbcucian.getValueAt(baris, 0).toString();
       txtidcucian.setText(id);
       String jenis = tbcucian.getValueAt(baris, 1).toString();
       txtnamacucian.setText(jenis);
       String tarif = tbcucian.getValueAt(baris, 2).toString();
       txttarif.setText(tarif);
    
    }//GEN-LAST:event_tbcucianMouseClicked

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
            java.util.logging.Logger.getLogger(FormJenisCucian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormJenisCucian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormJenisCucian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormJenisCucian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormJenisCucian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbcucian;
    private javax.swing.JTextField txtidcucian;
    private javax.swing.JTextField txtnamacucian;
    private javax.swing.JTextField txttarif;
    // End of variables declaration//GEN-END:variables
}
