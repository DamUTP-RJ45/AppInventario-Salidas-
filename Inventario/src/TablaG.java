
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author osmar
 */
public class TablaG extends javax.swing.JPanel {

    public static int EstSelTab = 0;
    
    public String BaseP = Conexion.Base;
    public static int Frame;
    
    public TablaG() {
        initComponents(); 
        
        System.out.println(Frame);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        TbBusqueda = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        TbBusqueda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TbBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TbBusqueda.setRowHeight(35);
        TbBusqueda.setSelectionBackground(new java.awt.Color(255, 102, 0));
        TbBusqueda.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TbBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TbBusquedaFocusGained(evt);
            }
        });
        TbBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbBusquedaMouseClicked(evt);
            }
        });
        TbBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TbBusquedaKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(TbBusqueda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TbBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TbBusquedaKeyPressed
        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_F1){
            FiltroID FID = new FiltroID();
            FID.setVisible(true);
        }else
        if (keyCode == KeyEvent.VK_F2){
            BuscarProducto FP = new BuscarProducto();
            FP.setVisible(true);
            FP.txtBuscador.requestFocus();
        }else
        if (keyCode == KeyEvent.VK_F3){
            FiltroCant FC = new FiltroCant();
            FC.setVisible(true);
        }else
        if (keyCode == KeyEvent.VK_F4){
            FlitroFecha FCH = new FlitroFecha();
            FCH.setVisible(true);
        }else
        if (keyCode == KeyEvent.VK_F5){
            FiltroHora FH = new FiltroHora();
            FH.setVisible(true);
        }else
        if (keyCode == KeyEvent.VK_F6){
            FiltroTurno FT = new FiltroTurno();
            FT.setVisible(true);
        }
    }//GEN-LAST:event_TbBusquedaKeyPressed

    private void TbBusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TbBusquedaFocusGained
        //HOLACOMOESTAS
    }//GEN-LAST:event_TbBusquedaFocusGained

    private void TbBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbBusquedaMouseClicked

            String sql = "select idSalida, Cantidad, Fecha, Usuario, Producto from " + BaseP + ".Salida where idSalida = " + TbBusqueda.getValueAt(TbBusqueda.getSelectedRow(), 0) + ";";
            ResultSet rs;
            Statement st;
            
            int idSalSel = 0;
            double CantSalSel = 0;
            String FechSalSel = "";
            String UsSalSel = "";
            String ProdSalSel = "";
            
            try {
                st = cn.createStatement();
                rs = st.executeQuery(sql);
            
                while (rs.next()) {
                    idSalSel = rs.getInt(1);
                    CantSalSel = rs.getDouble(2);
                    FechSalSel = rs.getString(3);
                    UsSalSel = rs.getString(4);
                    ProdSalSel = rs.getString(5);
                }
                
                switch(Frame){
                    case 1:
                        ModificarC.txtIDMod.setText(Integer.toString(idSalSel));
                        ModificarC.txtProdMod.setText(ProdSalSel);
                        ModificarC.txtCantMod.setText(Double.toString(CantSalSel));
                        ModificarC.txtFechMod.setText(FechSalSel);
                        ModificarC.txtTurnMod.setText(UsSalSel);
                
                        ModificarC.Cantidad1 = CantSalSel;

                        break;
                        
                    case 2:
                        SalidasPAdmin.txtIDSalP.setText(Integer.toString(idSalSel));
                        SalidasPAdmin.txtProdSalP.setText(ProdSalSel);
                        SalidasPAdmin.txtCantSalP.setText(Double.toString(CantSalSel));
                        SalidasPAdmin.txtFechSalP.setText(FechSalSel);
                        SalidasPAdmin.txtTurnSalP.setText(UsSalSel);               
                        
                        break;
                }
                
                
                rs.close();
            }catch (SQLException ex){
                Logger.getLogger(ModificarC.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_TbBusquedaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TbBusqueda;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
}
