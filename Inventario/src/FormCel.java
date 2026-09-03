
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author osmar
 */
public class FormCel extends DefaultTableCellRenderer{
    public FormCel() {
        setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    /*
        Codigo para hacer uso de esta clase
    
        TableCellRenderer cells = new FormCel();
        TbBuscador.setDefaultRenderer(Object.class, cells);
    */
}

