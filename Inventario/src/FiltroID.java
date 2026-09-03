
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author osmar
 */
public class FiltroID extends javax.swing.JFrame {
        
        int ValCodEvnt;
        public String BaseP = Conexion.Base;
        
    public FiltroID() {
        
        setUndecorated(true);
                
        initComponents();
        
        txtFID.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFID = new javax.swing.JTextField();
        BtnAdID = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresa el ID que");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtFID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        txtFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFIDActionPerformed(evt);
            }
        });
        txtFID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFIDKeyPressed(evt);
            }
        });

        BtnAdID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnAdID.setForeground(new java.awt.Color(255, 102, 0));
        BtnAdID.setText("Agregar (Enter)");
        BtnAdID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        BtnAdID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdIDActionPerformed(evt);
            }
        });
        BtnAdID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnAdIDKeyPressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Presiona Esc. para salir.");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("deseas BUSCAR:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFID)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(BtnAdID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFID, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAdID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdIDActionPerformed
        if(!txtFID.getText().equals("")){
            if (Digit(txtFID.getText())){
                JOptionPane.showMessageDialog(null, "Favor de ingresar un valor valido", "Advertencia", JOptionPane.ERROR_MESSAGE);
            }else{
                Cons(); 
            } 
        }else{
            JOptionPane.showConfirmDialog(null, "Favor de ingresar un ID", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_BtnAdIDActionPerformed

    private void BtnAdIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnAdIDKeyPressed
        int keyCode = evt.getKeyCode();
         
        if (keyCode == KeyEvent.VK_ESCAPE){
                    System.out.println("La tecla que se presiono en el TXT fue Escape");
                    dispose();
        }
    }//GEN-LAST:event_BtnAdIDKeyPressed

    private void txtFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFIDActionPerformed

    }//GEN-LAST:event_txtFIDActionPerformed

    private void txtFIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFIDKeyPressed
        int keyCode = evt.getKeyCode();
        
        if (keyCode == KeyEvent.VK_ENTER){
            System.out.println("La tecla que se presiono en el TXT fue Enter");
            BtnAdID.requestFocus();
        }else
            if (keyCode == KeyEvent.VK_ESCAPE){
                    System.out.println("La tecla que se presiono en el TXT fue Escape");
                    dispose();
                }else
                    System.out.println("La tecla que se presiono en el TXT no coincide con ninguna condicion");
    }//GEN-LAST:event_txtFIDKeyPressed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        this.dispose();
    }//GEN-LAST:event_formWindowDeactivated

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
            java.util.logging.Logger.getLogger(FiltroID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiltroID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiltroID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiltroID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiltroID().setVisible(true);
            }
        });
    }
    
    public void ActBtnFilt(){
        String Con = txtFID.getText();
        if(Con.equals("")){           
            JOptionPane.showMessageDialog(this, "Por favor ingresa un valor", "Advertencia", JOptionPane.WARNING_MESSAGE);           
            txtFID.requestFocus();
        }else{
            if (Con.matches("\\d+")){
                //ANALIZAR CODIGO PARA FUNCIONALIDAD
            }else{
                JOptionPane.showMessageDialog(this, "Por favor ingresa un digito SIN espacios", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtFID.setText("");
                txtFID.requestFocus();
            }
        }
    }
    
    private void Cons() {
        String ID = txtFID.getText();
        String sql;
        ResultSet rs;
        Statement st;
        String[] datos = new String[5];
        
        int idSalSel = 0;
        double CantSalSel = 0;
        String FechSalSel = "";
        String UsSalSel = "";
        String ProdSalSel = "";
        
        sql = "select idSalida, Cantidad, Fecha, Usuario, Producto from " + BaseP + ".Salida where idSalida = " + ID + ";";

        try {
                
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            
            if (!rs.next()){
                JOptionPane.showMessageDialog(null, "Lo sentimos, el ID que nos proporcionaste no coincide con ningun existente", "Advertencia", JOptionPane.ERROR_MESSAGE);
            }else{
                    idSalSel = rs.getInt(1);
                    CantSalSel = rs.getDouble(2);
                    FechSalSel = rs.getString(3);
                    UsSalSel = rs.getString(4);
                    ProdSalSel = rs.getString(5);
                    
                    ModificarC.txtIDMod.setText(Integer.toString(idSalSel));
                    ModificarC.txtProdMod.setText(ProdSalSel);
                    ModificarC.txtCantMod.setText(Double.toString(CantSalSel));
                    ModificarC.txtFechMod.setText(FechSalSel);
                    ModificarC.txtTurnMod.setText(UsSalSel);
                
                    ModificarC.Cantidad1 = CantSalSel;
                    
                    System.out.println("Hola el valor de la cantidad es: " + String.valueOf(ModificarC.Cantidad1));
     
                    ModificarC.txtCant.requestFocus();
            
                    rs.close(); 
            }        
        } catch (SQLException ex) {
            Logger.getLogger(NuevaC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean Digit(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtFID;
    // End of variables declaration//GEN-END:variables
    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
}
