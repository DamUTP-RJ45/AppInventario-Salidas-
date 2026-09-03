
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author osmar
 */
public class FormHeaderCenter extends DefaultTableCellRenderer {
    
     public FormHeaderCenter() {
        setForeground(new java.awt.Color(255,102,0));   
        setHorizontalAlignment(SwingConstants.CENTER);
    }
}
