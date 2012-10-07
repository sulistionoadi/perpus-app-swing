/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import perpus.Main;
import perpus.domain.security.Screen;
import perpus.ui.admin.FormKonfigurasi;
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
public class MainMenu extends javax.swing.JFrame {

    private List<JMenu> menus;
    private List<JMenuItem> menuItems;
    private Integer indexTab = -1;
    
    /**
     * Creates new form MainForm
     */
    public MainMenu() {
        initComponents();
        mnItemLogin.setVisible(false);
        
        menus = new ArrayList<JMenu>();
        menuItems = new ArrayList<JMenuItem>();
        
        menus.add(menuFile);
        menus.add(menuMaster);
        menus.add(menuTransaksi);
        menus.add(menuAdmin);
        menus.add(mnItemUserManagemen);
        menus.add(menuLaporan);
        
        menuItems.add(mnItemLogout);
        
        menuItems.add(mnItemAnggota);
        menuItems.add(mnItemBuku);
        menuItems.add(mnItemPegawai);
        
        menuItems.add(mnuPeminjaman);
        
        menuItems.add(mnItemKonfigurasiDenda);
        menuItems.add(mnItemHakAkses);
        menuItems.add(mnItemGrupAkses);
        
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void initSecurity() {
        for (JMenu jMenu : menus) {
            for (Screen screen :Main.getScreens()) {
                if (jMenu.getText().equals(screen.getNamaScreen())) {
                    jMenu.setEnabled(screen.getEnable());
                    jMenu.setVisible(screen.getVisible());
                }
            }
        }
        
        for (JMenuItem jMenuItem : menuItems) {
            for (Screen screen :Main.getScreens()) {
                if (jMenuItem.getText().equals(screen.getNamaScreen())) {
                    jMenuItem.setEnabled(screen.getEnable());
                    jMenuItem.setVisible(screen.getVisible());
                }
            }
        }
    }
    
    private void resetLaf() {
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    private int getComponentIndexByName(String panelName) {
        return mainTabbedPane.indexOfTab(panelName);
    }
    
    private void setSelectedPanel(String panelName) {
        mainTabbedPane.setSelectedComponent(mainTabbedPane.getComponentAt(getComponentIndexByName(panelName)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeaderDashboard1 = new perpus.ui.PanelHeaderDashboard();
        jPanel1 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        lblStatus = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        mainTabbedPane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        mnItemLogin = new javax.swing.JMenuItem();
        mnItemLogout = new javax.swing.JMenuItem();
        menuMaster = new javax.swing.JMenu();
        mnItemPegawai = new javax.swing.JMenuItem();
        mnItemAnggota = new javax.swing.JMenuItem();
        mnItemBuku = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mnItemMetal = new javax.swing.JMenuItem();
        mnItemSystem = new javax.swing.JMenuItem();
        mnItemNimbus = new javax.swing.JMenuItem();
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

        javax.swing.GroupLayout panelHeaderDashboard1Layout = new javax.swing.GroupLayout(panelHeaderDashboard1);
        panelHeaderDashboard1.setLayout(panelHeaderDashboard1Layout);
        panelHeaderDashboard1Layout.setHorizontalGroup(
            panelHeaderDashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelHeaderDashboard1Layout.setVerticalGroup(
            panelHeaderDashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblUserName.setText("UserName : AA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblStatus)
                .addComponent(lblUserName))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblStatus, lblUserName, progressBar});

        menuFile.setText("File");
        menuFile.setName("File"); // NOI18N

        mnItemLogin.setText("Login");
        mnItemLogin.setEnabled(false);
        mnItemLogin.setName("Login"); // NOI18N
        mnItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemLoginActionPerformed(evt);
            }
        });
        menuFile.add(mnItemLogin);

        mnItemLogout.setText("Logout");
        mnItemLogout.setName("Logout"); // NOI18N
        mnItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemLogoutActionPerformed(evt);
            }
        });
        menuFile.add(mnItemLogout);

        jMenuBar1.add(menuFile);

        menuMaster.setText("Master");
        menuMaster.setName("Master"); // NOI18N

        mnItemPegawai.setText("Entri Pegawai");
        mnItemPegawai.setName("Entri Pegawai"); // NOI18N
        mnItemPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemPegawaiActionPerformed(evt);
            }
        });
        menuMaster.add(mnItemPegawai);

        mnItemAnggota.setText("Entri Anggota");
        mnItemAnggota.setName("Entri Anggota"); // NOI18N
        mnItemAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemAnggotaActionPerformed(evt);
            }
        });
        menuMaster.add(mnItemAnggota);

        mnItemBuku.setText("Entri Buku");
        mnItemBuku.setName("Entri Buku"); // NOI18N
        mnItemBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemBukuActionPerformed(evt);
            }
        });
        menuMaster.add(mnItemBuku);

        jMenuBar1.add(menuMaster);

        jMenu6.setText("Themes");

        mnItemMetal.setText("Metal");
        mnItemMetal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemMetalActionPerformed(evt);
            }
        });
        jMenu6.add(mnItemMetal);

        mnItemSystem.setText("System");
        mnItemSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemSystemActionPerformed(evt);
            }
        });
        jMenu6.add(mnItemSystem);

        mnItemNimbus.setText("Nimbus");
        mnItemNimbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemNimbusActionPerformed(evt);
            }
        });
        jMenu6.add(mnItemNimbus);

        jMenuBar1.add(jMenu6);

        menuTransaksi.setText("Transaksi");
        menuTransaksi.setName("Transaksi"); // NOI18N

        mnuPeminjaman.setText("Peminjaman");
        mnuPeminjaman.setName("Peminjaman"); // NOI18N
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
        menuAdmin.setName("Admin"); // NOI18N

        mnItemKonfigurasiDenda.setText("Konfigurasi Denda");
        mnItemKonfigurasiDenda.setName("Konfigurasi Denda"); // NOI18N
        mnItemKonfigurasiDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemKonfigurasiDendaActionPerformed(evt);
            }
        });
        menuAdmin.add(mnItemKonfigurasiDenda);

        mnItemUserManagemen.setText("User Managemen");
        mnItemUserManagemen.setName("User Managemen"); // NOI18N

        mnItemHakAkses.setText("Hak Akses");
        mnItemHakAkses.setName("Hak Akses"); // NOI18N
        mnItemHakAkses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemHakAksesActionPerformed(evt);
            }
        });
        mnItemUserManagemen.add(mnItemHakAkses);

        mnItemGrupAkses.setText("Grup Akses");
        mnItemGrupAkses.setName("Grup Akses"); // NOI18N
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
            .addComponent(panelHeaderDashboard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeaderDashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnItemLoginActionPerformed

    private void mnItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemLogoutActionPerformed
        this.dispose();
        Main.initLogin();
    }//GEN-LAST:event_mnItemLogoutActionPerformed

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

    private void mnItemMetalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemMetalActionPerformed
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            resetLaf();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnItemMetalActionPerformed

    private void mnItemSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemSystemActionPerformed
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            resetLaf();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnItemSystemActionPerformed

    private void mnItemNimbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemNimbusActionPerformed
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            resetLaf();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnItemNimbusActionPerformed

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

    private void mnItemKonfigurasiDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemKonfigurasiDendaActionPerformed
        FormKonfigurasi.getPanel().setName(FormKonfigurasi.PANEL_NAME);
        indexTab = getComponentIndexByName(FormKonfigurasi.PANEL_NAME);
        if(indexTab == -1){
            mainTabbedPane.addTab(FormKonfigurasi.PANEL_NAME, FormKonfigurasi.getPanel());
            setSelectedPanel(FormKonfigurasi.PANEL_NAME);
        } else {
            mainTabbedPane.setSelectedIndex(indexTab);
        }
    }//GEN-LAST:event_mnItemKonfigurasiDendaActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUserName;
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
    private javax.swing.JMenuItem mnItemMetal;
    private javax.swing.JMenuItem mnItemNimbus;
    private javax.swing.JMenuItem mnItemPegawai;
    private javax.swing.JMenuItem mnItemSystem;
    private javax.swing.JMenu mnItemUserManagemen;
    private javax.swing.JMenuItem mnuPeminjaman;
    private javax.swing.JMenuItem mnuPengembalian;
    private perpus.ui.PanelHeaderDashboard panelHeaderDashboard1;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
