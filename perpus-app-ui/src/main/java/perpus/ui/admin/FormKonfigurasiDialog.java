/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.ui.admin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import perpus.Main;
import perpus.domain.JenisBuku;
import perpus.domain.Konfigurasi;
import perpus.ui.tablemodel.JenisBukuComboModel;
import perpus.util.TextComponentUtils;

/**
 *
 * @author adi
 */
public class FormKonfigurasiDialog extends javax.swing.JDialog {

    
    private Konfigurasi konfig;
    private List<JenisBuku> listJenisBuku = new ArrayList<JenisBuku>();
    /**
     * Creates new form FormKonfigurasiDialog
     */
    public FormKonfigurasiDialog() {
        super(new JFrame(), true);
        initComponents();
        
        TextComponentUtils.setNumericTextOnly(txtMaxLama);
        TextComponentUtils.setNumericTextOnly(txtMaxPinjam);
        TextComponentUtils.setCurrency(txtDenda);
        listJenisBuku = Main.getMasterService().findAllJenisBuku(0, Main.getMasterService().countAllJenisBuku().intValue());
        cmbJenis.setModel(new JenisBukuComboModel(listJenisBuku));
        
        setLocationRelativeTo(null);
    }
    
    public Konfigurasi showDialog() {
        setVisible(true);
        return konfig;
    }
    
    public Konfigurasi editDialog(Konfigurasi konfig) {
        this.konfig = konfig;
        loadDomainToForm();
        setVisible(true);
        return konfig;
    }
    
    private void loadDomainToForm() {
        txtDenda.setText(TextComponentUtils.formatNumber(konfig.getDendaPerHari()));
        txtMaxLama.setText(konfig.getMaxLamaPinjam().toString());
        txtMaxPinjam.setText(konfig.getMaxBukuPinjam().toString());
        cmbJenis.getModel().setSelectedItem(konfig.getJenisBuku());
    }
    
    private void loadFormToDomain() {
        if (konfig == null) {
            konfig = new Konfigurasi();
        }
        
        konfig.setDendaPerHari(TextComponentUtils.parseNumberToBigDecimal(txtDenda.getText()));
        konfig.setJenisBuku((JenisBuku)cmbJenis.getModel().getSelectedItem());
        konfig.setMaxBukuPinjam(Integer.parseInt(txtMaxPinjam.getText()));
        konfig.setMaxLamaPinjam(Integer.parseInt(txtMaxLama.getText()));
    }
    
    private Boolean validateForm() {
        if (txtDenda.getText().length() > 0 && 
            txtMaxLama.getText().length() > 0 &&
            txtMaxPinjam.getText().length() > 0 &&
            cmbJenis.getModel().getSelectedItem() != null) {
            return true;
        } else {
            return false;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbJenis = new javax.swing.JComboBox();
        txtMaxLama = new javax.swing.JTextField();
        txtMaxPinjam = new javax.swing.JTextField();
        txtDenda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Jenis Buku *");

        jLabel2.setText("Max Lama Pinjam *");

        jLabel3.setText("Max Pinjam Buku *");

        jLabel4.setText("Denda *");

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtMaxPinjam))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtMaxLama, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(98, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)
                        .addGap(22, 22, 22))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancel, btnOk});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaxLama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaxPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbJenis, jLabel1, jLabel2, jLabel3, jLabel4, txtDenda, txtMaxLama, txtMaxPinjam});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancel, btnOk});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (validateForm()) {
            loadFormToDomain();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(Main.getMainForm(),
                        "Kolom bertanda * harus diisi !!",
                        "Terjadi Kesalahan !!",
                        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox cmbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtMaxLama;
    private javax.swing.JTextField txtMaxPinjam;
    // End of variables declaration//GEN-END:variables
}