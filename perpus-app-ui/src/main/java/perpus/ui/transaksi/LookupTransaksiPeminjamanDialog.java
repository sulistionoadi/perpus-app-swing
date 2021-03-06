/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LookupTransaksiPeminjamanDialog.java
 *
 * Created on Oct 7, 2012, 12:20:55 PM
 */
package perpus.ui.transaksi;

import com.jgoodies.looks.HeaderStyle;
import com.jgoodies.looks.Options;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;
import org.springframework.util.StringUtils;
import perpus.Main;
import perpus.domain.Peminjaman;
import perpus.ui.TableUtil;
import perpus.ui.tablemodel.PeminjamanTableModel;

/**
 *
 * @author adi
 */
public class LookupTransaksiPeminjamanDialog extends javax.swing.JDialog {

    private Peminjaman pinjam;
    private List<Peminjaman> listPeminjaman;
    private Integer start = 0;
    private Integer rows = 30;
    
    /** Creates new form LookupTransaksiPeminjamanDialog */
    public LookupTransaksiPeminjamanDialog() {
        super(new JFrame(), true);
        initComponents();
        setLocationRelativeTo(null);
        
        initPaging();
        loadDataToTable();
    }
    private void initPaging(){
        //start konfigurasi untuk paging
        Long count = 0L;
        
        if(StringUtils.hasText(txtSearch.getText())){
            count = Main.getTransaksiService().countTransaksiPeminjaman(
                    cmbOption.getSelectedItem().toString(), txtSearch.getText());
        } else {
            count = Main.getTransaksiService().countTransaksiPeminjaman();
        }
        
        Long hasilBagi = count/rows;
        long page = Math.round(hasilBagi); 
        
        if ((count%rows) > 0) {
            page = page + 1;
        }
        if(page==0){page=1;}
        lblMaxPage.setText(String.valueOf(page));
        spPaging.setModel(new SpinnerNumberModel(1, 1, page, 1));
        lblCountRows.setText(String.valueOf(count));
        //end konfigurasi untuk paging
    }
    
    private void loadDataToTable(){
        Double hal = (Double) spPaging.getModel().getValue();
        start = (hal.intValue() - 1) * rows;
        
        if(StringUtils.hasText(txtSearch.getText())){
            listPeminjaman = Main.getTransaksiService().getTransaksiBelumKembali(
                    cmbOption.getSelectedItem().toString(), txtSearch.getText(),
                    start, rows);
        } else {
            listPeminjaman = Main.getTransaksiService().getTransaksiBelumKembali(start, rows);
        }
        
        if(listPeminjaman != null){
            tbl.setModel(new PeminjamanTableModel(listPeminjaman));
            TableUtil.initColumn(tbl);
            tbl.getSelectionModel().addListSelectionListener(new TableSelection());
        }
    }
    
    public Peminjaman showDialog(){
        setVisible(true);
        return pinjam;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbOption = new javax.swing.JComboBox();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable() {
            public Component prepareRenderer(
                TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);

                if (!isRowSelected(row)) {
                    c.setBackground(row % 2 == 0 ? getBackground() : new java.awt.Color(237, 243, 254));
                }

                return c;
            }
        };
        jToolBar2 = new javax.swing.JToolBar();
        lblRows = new javax.swing.JLabel();
        lblCountRows = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMinPage = new javax.swing.JLabel();
        spPaging = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        lblMaxPage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnOK1 = new javax.swing.JButton();
        btnBatal1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lookup Transaksi Peminjaman");
        setResizable(false);

        cmbOption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID_TRX", "KODE", "NAMA" }));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Transaksi", "Tanggal Pinjam", "Kode Anggota", "Nama Anggota"
            }
        ));
        tbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tbl);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.putClientProperty(Options.HEADER_STYLE_KEY, HeaderStyle.BOTH);

        lblRows.setText(" rows : ");
        lblRows.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblRows.setMaximumSize(new java.awt.Dimension(55, 55));
        lblRows.setMinimumSize(new java.awt.Dimension(10, 10));
        jToolBar2.add(lblRows);

        lblCountRows.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblCountRows.setMaximumSize(new java.awt.Dimension(50, 50));
        lblCountRows.setMinimumSize(new java.awt.Dimension(10, 10));
        jToolBar2.add(lblCountRows);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Page");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4.setMinimumSize(new java.awt.Dimension(50, 50));
        jToolBar2.add(jLabel4);

        lblMinPage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMinPage.setText("  1  ");
        lblMinPage.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblMinPage.setMaximumSize(new java.awt.Dimension(30, 30));
        lblMinPage.setMinimumSize(new java.awt.Dimension(10, 10));
        jToolBar2.add(lblMinPage);

        spPaging.setMaximumSize(new java.awt.Dimension(50, 50));
        spPaging.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spPagingStateChanged(evt);
            }
        });
        jToolBar2.add(spPaging);

        jLabel5.setMaximumSize(new java.awt.Dimension(10, 10));
        jToolBar2.add(jLabel5);

        lblMaxPage.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblMaxPage.setMaximumSize(new java.awt.Dimension(50, 50));
        lblMaxPage.setMinimumSize(new java.awt.Dimension(10, 10));
        jToolBar2.add(lblMaxPage);

        jLabel1.setMaximumSize(new java.awt.Dimension(200, 200));
        jToolBar2.add(jLabel1);

        btnOK1.setText("OK");
        btnOK1.setFocusable(false);
        btnOK1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOK1.setMaximumSize(new java.awt.Dimension(60, 60));
        btnOK1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOK1ActionPerformed(evt);
            }
        });
        jToolBar2.add(btnOK1);

        btnBatal1.setText("Batal");
        btnBatal1.setFocusable(false);
        btnBatal1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBatal1.setMaximumSize(new java.awt.Dimension(60, 60));
        btnBatal1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });
        jToolBar2.add(btnBatal1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbOption, 0, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbOption, txtSearch});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            initPaging();
            loadDataToTable();
//            listPeminjaman = Main.getTransaksiService().getTransaksiBelumKembali(
//                    cmbOption.getSelectedItem().toString(), txtSearch.getText());
//            tbl.setModel(new PeminjamanTableModel(listPeminjaman));
//            TableUtil.initColumn(tbl);
        }
}//GEN-LAST:event_txtSearchKeyPressed

    private void spPagingStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spPagingStateChanged
        loadDataToTable();
    }//GEN-LAST:event_spPagingStateChanged

    private void btnOK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOK1ActionPerformed
        if(pinjam!=null){
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(Main.getMainForm(), "Tidak ada Data yang dipilih !");
        }
    }//GEN-LAST:event_btnOK1ActionPerformed

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        pinjam = null;
        this.dispose();
    }//GEN-LAST:event_btnBatal1ActionPerformed
 
    private class TableSelection implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (e.getValueIsAdjusting()) {
                return;
            }

            if (tbl.getSelectedRow() >= 0) {
                pinjam = listPeminjaman.get(tbl.getSelectedRow());
            }
        
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal1;
    private javax.swing.JButton btnOK1;
    private javax.swing.JComboBox cmbOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblCountRows;
    private javax.swing.JLabel lblMaxPage;
    private javax.swing.JLabel lblMinPage;
    private javax.swing.JLabel lblRows;
    private javax.swing.JSpinner spPaging;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
