/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

//import Model.ModelExcel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import Conexionsql.Conexion;
import Menu.MenuAdmin;
import Methods.ExtraMethods;
import javax.swing.ImageIcon;
import Login.LoginExcel;
import Search.SearchSql;
import java.sql.CallableStatement;
import Search.SearchSql;

/**
 *
 * @author arlom
 */
public class ViewExcel extends javax.swing.JFrame {
Conexion cone = new Conexion();
Connection con = cone.obtenerconexion();
//ModelExcel Mod = new ModelExcel();
ExtraMethods ex = new ExtraMethods();



    /**
     * Creates new form ViewExcel
     */
    public ViewExcel() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage (new ImageIcon(getClass().getResource("/IMAGES/ExcelSQL.png")).getImage());
        cbxperiod.setModel(ex.periodsproc());
        
        LoginExcel log= new LoginExcel();
            
        
        if(log.tu.equals("1")){
            btnback.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        btnImport = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        cbxperiod = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnback = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnexit = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblimport = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ViewExcel - ExcelToSQL");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtDatos);

        btnImport.setBackground(new java.awt.Color(102, 153, 0));
        btnImport.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        btnImport.setForeground(new java.awt.Color(255, 255, 255));
        btnImport.setText("IMPORT");
        btnImport.setEnabled(false);

        btnExport.setBackground(new java.awt.Color(102, 153, 0));
        btnExport.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("EXPORT");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        cbxperiod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxperiod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxperiodActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setText("Fiscal Period :");

        jPanel3.setBackground(new java.awt.Color(102, 153, 0));

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/ARROW (2).png"))); // NOI18N
        btnback.setToolTipText("Back");
        btnback.setBorder(null);
        btnback.setBorderPainted(false);
        btnback.setFocusPainted(false);
        btnback.setOpaque(false);
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 100)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Excel File Export");

        jPanel4.setBackground(new java.awt.Color(0, 102, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 0)));
        jPanel4.setForeground(new java.awt.Color(51, 102, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        btnexit.setBackground(new java.awt.Color(204, 51, 0));
        btnexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnexit.setText("X");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblimport.setText("SELECT FISCAL PERIOD BEFORE IMPORT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(cbxperiod, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblimport)
                                .addGap(182, 182, 182)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxperiod, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblimport, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
           
         try{
            for(int i=0; i< jtDatos.getRowCount();i++){
                 CallableStatement cmd = con.prepareCall("{CALL sp_insertschool(?,?,?)}");
                 cmd.setString(1,jtDatos.getValueAt(i,0).toString());
                 cmd.setString(2,jtDatos.getValueAt(i,1).toString());
                 cmd.setString(3,jtDatos.getValueAt(i,2).toString());
                 cmd.execute();
                 
                 CallableStatement cmd2 = con.prepareCall ("{CALL sp_insertAllotments(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                 cmd2.setString(1,jtDatos.getValueAt(i,0).toString());
                 cmd2.setInt(2,Integer.parseInt(jtDatos.getValueAt(i,3).toString()));
                 cmd2.setInt(3,Integer.parseInt(jtDatos.getValueAt(i,4).toString()));
                 cmd2.setInt(4,Integer.parseInt(jtDatos.getValueAt(i,5).toString()));
                 cmd2.setInt(5,Integer.parseInt(jtDatos.getValueAt(i,6).toString()));
                 cmd2.setInt(6,Integer.parseInt(jtDatos.getValueAt(i,7).toString()));
                 cmd2.setInt(7,Integer.parseInt(jtDatos.getValueAt(i,8).toString()));
                 cmd2.setInt(8,Integer.parseInt(jtDatos.getValueAt(i,9).toString()));
                 cmd2.setInt(9,Integer.parseInt(jtDatos.getValueAt(i,10).toString()));
                 cmd2.setInt(10,Integer.parseInt(jtDatos.getValueAt(i,11).toString()));
                 cmd2.setString(11,jtDatos.getValueAt(i,12).toString());
                 cmd2.setInt(12,Integer.parseInt(jtDatos.getValueAt(i,13).toString()));
                 cmd2.setString(13,jtDatos.getValueAt(i,14).toString());
                 cmd2.setInt(14,Integer.parseInt(jtDatos.getValueAt(i,15).toString()));
                 cmd2.setString(15,jtDatos.getValueAt(i,16).toString());
                 cmd2.setInt(16,Integer.parseInt(jtDatos.getValueAt(i,17).toString()));
                 cmd2.setString(17,jtDatos.getValueAt(i,18).toString());
                 cmd2.setInt(18,cbxperiod.getSelectedIndex());
                 cmd2.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Succssesful Export");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
     btnback.isSelected();
    MenuAdmin MA= new MenuAdmin();
    MA.setVisible(true);
    setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
     System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       SearchSql Sea = new SearchSql();
                     Sea.setVisible(true);
                     setVisible(false);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbxperiodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxperiodActionPerformed

  
        if(cbxperiod.getSelectedItem()=="Select FP"){
           btnImport.setEnabled(false);
           lblimport.setVisible(true);
           
        }
        else{
           btnImport.setEnabled(true);
           lblimport.setVisible(false);
        }
        
     
        
        if(cbxperiod.getSelectedItem().equals("2023-2024")){
        jtDatos.setEnabled(true);
      
       
    }
        else{
            jtDatos.setEnabled(false);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxperiodActionPerformed

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
            java.util.logging.Logger.getLogger(ViewExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewExcel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExport;
    public javax.swing.JButton btnImport;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnexit;
    private javax.swing.JComboBox<String> cbxperiod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtDatos;
    private javax.swing.JLabel lblimport;
    // End of variables declaration//GEN-END:variables
}
