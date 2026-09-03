
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author osmar
 */
public class BuscarProducto extends javax.swing.JFrame {
    
    
    public String BaseP = Conexion.Base;
    int Index = 0;
    public int Frame;

    Inicio CallInicio = new Inicio();
    

    public BuscarProducto() {
        
        setUndecorated(true);
                
        initComponents();

        ConsProd();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbBuscador = new javax.swing.JTable();
        txtBuscador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setForeground(new java.awt.Color(255, 102, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Esc. para CANCELAR");

        BtnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 102, 0));
        BtnAgregar.setText("AGREGAR");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        BtnAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnAgregarKeyPressed(evt);
            }
        });

        TbBuscador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TbBuscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TbBuscador.setEditingColumn(0);
        TbBuscador.setEditingRow(0);
        TbBuscador.setRowHeight(30);
        TbBuscador.setSelectionBackground(new java.awt.Color(255, 102, 0));
        TbBuscador.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TbBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TbBuscadorKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TbBuscador);

        txtBuscador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBuscador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscadorMouseClicked(evt);
            }
        });
        txtBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorActionPerformed(evt);
            }
        });
        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Producto:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAgregar))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyTyped
        
    }//GEN-LAST:event_txtBuscadorKeyTyped

    private void txtBuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyPressed

        int keyCode = evt.getKeyCode();
        
        if (keyCode == KeyEvent.VK_ENTER){
            BtnAgregar.requestFocus();
        }else{
            
        if (keyCode != KeyEvent.VK_ESCAPE)
            if (keyCode == KeyEvent.VK_DOWN){
                TbBuscador.requestFocus(true);
                TbBuscador.setRowSelectionInterval(0, 0);
            }else 
                System.out.println("Sigue haciendo su buseuqda ");
        else
           this.dispose();
        }
        
    }//GEN-LAST:event_txtBuscadorKeyPressed

    private void txtBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyReleased
        
        BuscarProd();
               
    }//GEN-LAST:event_txtBuscadorKeyReleased

    private void txtBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscadorMouseClicked
         
    }//GEN-LAST:event_txtBuscadorMouseClicked

    private void txtBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorActionPerformed

    private void TbBuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TbBuscadorKeyPressed
        
        int keyCode = evt.getKeyCode();
        
        if (keyCode == KeyEvent.VK_ESCAPE)
           this.dispose();
        
    }//GEN-LAST:event_TbBuscadorKeyPressed

    private void BtnAgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnAgregarKeyPressed
        
        int keyCode = evt.getKeyCode();
        
        if (keyCode == KeyEvent.VK_ESCAPE)
           this.dispose();
        
    }//GEN-LAST:event_BtnAgregarKeyPressed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        mandarText();    
        this.dispose();
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost

    }//GEN-LAST:event_formFocusLost

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked
    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(BuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarProducto().setVisible(true);
            }
        });
    }

    public static void Insertar(DefaultTableModel modelo, String product){
        modelo.addRow(new Object[]{product});
    }
    
    public void ConsProd() {
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };
        
        modelo.addColumn("ID");
        modelo.addColumn("Producto");
        
        TbBuscador.setModel(modelo);
        
        String sql;
        ResultSet rs;
        Statement st;
        String[] datos = new String[2];
        
        sql = "select * from " + BaseP + ".Producto;";

        try {
                
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    modelo.addRow(datos);
                }
                TbBuscador.setModel(modelo);
                
                FunFocusBusc(null);
                
                rs.close();
                
        } catch (SQLException ex) {
            Logger.getLogger(NuevaC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ajustarAnchoColumnas(TbBuscador);
        centrarColumnas(TbBuscador);
        
        TableColumn primeraCol = TbBuscador.getColumnModel().getColumn(0);
        primeraCol.setHeaderRenderer(new FormHeaderCenter());    
        
        TableColumn SegCol = TbBuscador.getColumnModel().getColumn(1);
        SegCol.setHeaderRenderer(new FormHeaderLeft());   
    }
    
    public void BuscarProd() {
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };
        
        modelo.addColumn("ID");
        modelo.addColumn("Producto");

        TbBuscador.setModel(modelo);

        String sql;
        ResultSet rs;
        Statement st;
        String[] datos = new String[2];
        
        sql = "select * from " + BaseP + ".Producto where Producto.Producto like '" +txtBuscador.getText()+ "%' ;";

        try {
                
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    modelo.addRow(datos);
                }
                TbBuscador.setModel(modelo);
                FunFocusBusc(null);
                
                rs.close();
                
        } catch (SQLException ex) {
            Logger.getLogger(NuevaC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ajustarAnchoColumnas(TbBuscador);
        centrarColumnas(TbBuscador);
        
        TableColumn primeraCol = TbBuscador.getColumnModel().getColumn(0);
        primeraCol.setHeaderRenderer(new FormHeaderCenter()); 
        
        TableColumn SegCol = TbBuscador.getColumnModel().getColumn(1);
        SegCol.setHeaderRenderer(new FormHeaderLeft());
    }
       
    private static void ajustarAnchoColumnas(JTable table) {

        TableColumn column = null;

        column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(10);
        column.setResizable(false);

        column = table.getColumnModel().getColumn(1);
        column.setPreferredWidth(300);
        column.setResizable(false);
    }
    
    private static void centrarColumnas(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        }
    }
    
    private static void FunFocusBusc(java.awt.event.KeyEvent evt) {
           
        if (TbBuscador.getRowCount() != 0){
            
                TbBuscador.requestFocus();
                TbBuscador.setRowSelectionInterval(0, 0);
                txtBuscador.requestFocus();
                
        }else
            System.out.println("Upsi, no hay productos que coincidan");
    }
    
    public void mandarText() {
        
        String ID = TbBuscador.getValueAt(TbBuscador.getSelectedRow(), 0).toString();
        String Producto = TbBuscador.getValueAt(TbBuscador.getSelectedRow(), 1).toString();
    
        /*
        textID.setText(ID);
        textProd.setText(Producto);
        */
        
        switch (Frame) {
        case 1:

            NuevaC.txtIDNuevaSalida.setText(ID);
            NuevaC.txtProdNueva.setText(Producto);

            System.out.println(ID);
            System.out.println(Producto);
            
            Frame = 0;
            
            break;
            
        case 2:
            
            ModificarC.txtFiltProdModF.setText(Producto);
            ModificarC.txtFiltProdModF.setForeground(Color.BLACK);
            
            System.out.println(Producto);
            
            Frame = 0;
            
            break;
                        
        case 3:
            
            SalidasPAdmin.txtFiltProdModF.setText(Producto);
            SalidasPAdmin.txtFiltProdModF.setForeground(Color.BLACK);
            
            System.out.println(Producto);
            
            Frame = 0;
            
            break;
            
            default:
            System.out.println("No hacae nada jeje");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    public static javax.swing.JTable TbBuscador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
}
