/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.ui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import perpus.ui.admin.GrupAkses;
import perpus.ui.admin.HakAkses;
import perpus.ui.master.MasterAnggota;
import perpus.ui.master.MasterBuku;
import perpus.ui.master.MasterPegawai;
import perpus.ui.transaksi.FormPeminjaman;
import perpus.ui.transaksi.FormPengembalian;

/**
 *
 * @author martinusadyh
 */
public class MainForm extends javax.swing.JFrame {
    
    private List<JMenu> menus;
    private List<JMenuItem> menuItems;
    private Integer indexTab = -1;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        menus = new ArrayList<JMenu>();
        menuItems = new ArrayList<JMenuItem>();
        
        menus.add(menuFile);
        menus.add(menuMaster);
        menus.add(menuTransaksi);
        menus.add(menuAdmin);
        menus.add(menuLaporan);
        
        menuItems.add(mnItemLogout);
        menuItems.add(mnItemLogin);
        
        menuItems.add(mnItemAnggota);
        menuItems.add(mnItemBuku);
        menuItems.add(mnItemPegawai);
               
                
        setExtendedState(MAXIMIZED_BOTH);
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
        mainTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        mnItemLogin = new javax.swing.JMenuItem();
        mnItemLogout = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuMaster = new javax.swing.JMenu();
        mnItemPegawai = new javax.swing.JMenuItem();
        mnItemAnggota = new javax.swing.JMenuItem();
        mnItemBuku = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenu();
        mnuPeminjaman = new javax.swing.JMenuItem();
        mnuPengembalian = new javax.swing.JMenuItem();
        menuAdmin = new javax.swing.JMenu();
        mnItemKonfigurasiDenda = new javax.swing.JMenuItem();
        mnItemUserManagemen = new javax.swing.JMenu();
        mnItemHakAkses = new javax.swing.JMenuItem();
        mnItemGrupAkses = new javax.swing.JMenuItem();
        menuLaporan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Perpustakaan v0.1");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        menuFile.setText("File");

        mnItemLogin.setText("Login");
        mnItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemLoginActionPerformed(evt);
            }
        });
        menuFile.add(mnItemLogin);

        mnItemLogout.setText("Logout");
        menuFile.add(mnItemLogout);

        jMenuBar1.add(menuFile);

        jMenu6.setText("Themes");
        jMenuBar1.add(jMenu6);

        menuMaster.setText("Master");

        mnItemPegawai.setText("Entri Pegawai");
        mnItemPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemPegawaiActionPerformed(evt);
            }
        });
        menuMaster.add(mnItemPegawai);

        mnItemAnggota.setText("Entri Anggota");
        mnItemAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemAnggotaActionPerformed(evt);
            }
        });
        menuMaster.add(mnItemAnggota);

        mnItemBuku.setText("Entri Buku");
        mnItemBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemBukuActionPerformed(evt);
            }
        });
        menuMaster.add(mnItemBuku);

        jMenuBar1.add(menuMaster);

        menuTransaksi.setText("Transaksi");

        mnuPeminjaman.setText("Peminjaman");
        mnuPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPeminjamanActionPerformed(evt);
            }
        });
        menuTransaksi.add(mnuPeminjaman);

        mnuPengembalian.setText("Pengembalian");
        mnuPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPengembalianActionPerformed(evt);
            }
        });
        menuTransaksi.add(mnuPengembalian);

        jMenuBar1.add(menuTransaksi);

        menuAdmin.setText("Admin");

        mnItemKonfigurasiDenda.setText("Konfigurasi Denda");
        menuAdmin.add(mnItemKonfigurasiDenda);

        mnItemUserManagemen.setText("User Managemen");

        mnItemHakAkses.setText("Hak Akses");
        mnItemHakAkses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemHakAksesActionPerformed(evt);
            }
        });
        mnItemUserManagemen.add(mnItemHakAkses);

        mnItemGrupAkses.setText("Grup Akses");
        mnItemGrupAkses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemGrupAksesActionPerformed(evt);
            }
        });
        mnItemUserManagemen.add(mnItemGrupAkses);

        menuAdmin.add(mnItemUserManagemen);

        jMenuBar1.add(menuAdmin);

        menuLaporan.setText("Laporan");
        jMenuBar1.add(menuLaporan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemPegawaiActionPerformed
        MasterPegawai.getPanel().setName(MasterPegawai.PANEL_NAME);
        indexTab = getComponentIndexByName(MasterPegawai.PANEL_NAME);
        if (indexTab == -1) {
            mainTabbedPane.addTab(MasterPegawai.PANEL_NAME, MasterPegawai.getPanel());
            setSelectedPanel(MasterPegawai.PANEL_NAME);
        } else {
            mainTabbedPane.setSelectedIndex(indexTab);
        }
    }//GEN-LAST:event_mnItemPegawaiActionPerformed

    private void mnItemAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemAnggotaActionPerformed
        MasterAnggota.getPanel().setName(MasterAnggota.PANEL_NAME);
        indexTab = getComponentIndexByName(MasterAnggota.PANEL_NAME);
        if (indexTab == -1) {
            mainTabbedPane.addTab(MasterAnggota.PANEL_NAME, MasterAnggota.getPanel());
            setSelectedPanel(MasterAnggota.PANEL_NAME);
        } else {
            mainTabbedPane.setSelectedIndex(indexTab);
        }
    }//GEN-LAST:event_mnItemAnggotaActionPerformed

    private void mnItemBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemBukuActionPerformed
        MasterBuku.getPanel().setName(MasterBuku.PANEL_NAME);
        indexTab = getComponentIndexByName(MasterBuku.PANEL_NAME);
        if (indexTab == -1) {
            mainTabbedPane.addTab(MasterBuku.PANEL_NAME, MasterBuku.getPanel());
            setSelectedPanel(MasterBuku.PANEL_NAME);
        } else {
            mainTabbedPane.setSelectedIndex(indexTab);
        }
    }//GEN-LAST:event_mnItemBukuActionPerformed

    private void mnItemHakAksesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemHakAksesActionPerformed
        HakAkses.getPanel().setName(HakAkses.PANEL_NAME);
        indexTab = getComponentIndexByName(HakAkses.PANEL_NAME);
        if (indexTab == -1) {
            mainTabbedPane.addTab(HakAkses.PANEL_NAME, HakAkses.getPanel());
            setSelectedPanel(HakAkses.PANEL_NAME);
        } else {
            mainTabbedPane.setSelectedIndex(indexTab);
        }
    }//GEN-LAST:event_mnItemHakAksesActionPerformed

    private void mnItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnItemLoginActionPerformed

    private void mnuPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPeminjamanActionPerformed
        FormPeminjaman.getPanel().setName(FormPeminjaman.PANEL_NAME);
        indexTab = getComponentIndexByName(FormPeminjaman.PANEL_NAME);
        if(indexTab == -1){
            mainTabbedPane.addTab(FormPeminjaman.PANEL_NAME, FormPeminjaman.getPanel());
            setSelectedPanel(FormPeminjaman.PANEL_NAME);
        } else {
            mainTabbedPane.setSelectedIndex(indexTab);
        }
    }//GEN-LAST:event_mnuPeminjamanActionPerformed

    private void mnItemGrupAksesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemGrupAksesActionPerformed
        GrupAkses.getPanel().setName(GrupAkses.PANEL_NAME);
        indexTab = getComponentIndexByName(GrupAkses.PANEL_NAME);
        if(indexTab == -1){
            mainTabbedPane.addTab(GrupAkses.PANEL_NAME, GrupAkses.getPanel());
            setSelectedPanel(GrupAkses.PANEL_NAME);
        } else {
            mainTabbedPane.setSelectedIndex(indexTab);
        }
    }//GEN-LAST:event_mnItemGrupAksesActionPerformed

    private void mnuPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPengembalianActionPerformed
        FormPengembalian.getPanel().setName(FormPengembalian.PANEL_NAME);
        indexTab = getComponentIndexByName(FormPengembalian.PANEL_NAME);
        if(indexTab == -1){
            mainTabbedPane.addTab(FormPengembalian.PANEL_NAME, FormPengembalian.getPanel());
            setSelectedPanel(FormPengembalian.PANEL_NAME);
        } else {
            mainTabbedPane.setSelectedIndex(indexTab);
        }
    }//GEN-LAST:event_mnuPengembalianActionPerformed

    private int getComponentIndexByName(String panelName) {
        return mainTabbedPane.indexOfTab(panelName);
    }
    
    private void setSelectedPanel(String panelName) {
        mainTabbedPane.setSelectedComponent(mainTabbedPane.getComponentAt(getComponentIndexByName(panelName)));
    }
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainForm().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuLaporan;
    private javax.swing.JMenu menuMaster;
    private javax.swing.JMenu menuTransaksi;
    private javax.swing.JMenuItem mnItemAnggota;
    private javax.swing.JMenuItem mnItemBuku;
    private javax.swing.JMenuItem mnItemGrupAkses;
    private javax.swing.JMenuItem mnItemHakAkses;
    private javax.swing.JMenuItem mnItemKonfigurasiDenda;
    private javax.swing.JMenuItem mnItemLogin;
    private javax.swing.JMenuItem mnItemLogout;
    private javax.swing.JMenuItem mnItemPegawai;
    private javax.swing.JMenu mnItemUserManagemen;
    private javax.swing.JMenuItem mnuPeminjaman;
    private javax.swing.JMenuItem mnuPengembalian;
    // End of variables declaration//GEN-END:variables
}