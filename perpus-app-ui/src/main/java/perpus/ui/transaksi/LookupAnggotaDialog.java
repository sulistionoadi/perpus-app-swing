/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LookupAnggotaDialog.java
 *
 * Created on Oct 7, 2012, 4:30:54 AM
 */
package perpus.ui.transaksi;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import perpus.Main;
import perpus.domain.Anggota;
import perpus.ui.TableUtil;
import perpus.ui.tablemodel.MasterAnggotaTableModel;

/**
 *
 * @author adi
 */
public class LookupAnggotaDialog extends javax.swing.JDialog {

    private Anggota anggota;
    private List<Anggota> listAnggota = new ArrayList<Anggota>();
    
    /** Creates new form LookupAnggotaDialog */
    public LookupAnggotaDialog() {
        super(new JFrame(), true);
        initComponents();
        setLocationRelativeTo(null);
        loadDataToTable();
    }
    
    private void loadDataToTable(){
        listAnggota = Main.getMasterService().findAllAnggota();
        if(listAnggota!=null){
            tbl.setModel(new MasterAnggotaTableModel(listAnggota));
            TableUtil.initColumn(tbl);
            tbl.getSelectionModel().addListSelectionListener(new TableSelection());
        }
    }
    
    public Anggota showDialog(){
        setVisible(true);
        return anggota;
    }
    
    private class TableSelection implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (e.getValueIsAdjusting()) {
                return;
            }

            if (tbl.getSelectedRow() >= 0) {
                anggota = listAnggota.get(tbl.getSelectedRow());
            }
        
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btnBatal = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        cmbOption = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lookup Data Anggota");
        setResizable(false);

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama", "Alamat", "Email", "No Telp"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        cmbOption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KODE", "NAMA" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbOption, 0, 143, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBatal, btnOK});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnBatal))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBatal, btnOK, cmbOption, txtSearch});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        anggota = null;
        this.dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        if(anggota!=null){
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(Main.getMainForm(), "Tidak ada Data yang dipilih !");
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(cmbOption.getSelectedItem().toString().equals("KODE")){
                listAnggota = Main.getMasterService().findAnggotaByKode(txtSearch.getText());
            } else {
                listAnggota = Main.getMasterService().findAnggotaByNama(txtSearch.getText());
            }
            tbl.setModel(new MasterAnggotaTableModel(listAnggota));
            TableUtil.initColumn(tbl);
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox cmbOption;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}