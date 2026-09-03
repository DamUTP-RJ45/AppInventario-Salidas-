
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author osmar
 */
public class Carga_y_Asignacion {
    
    Icon imgIcon;
    Image imagen;
    
    public static String GlobFecha = "";
    public static String GlobHora = "";
 
    public void ChargImg (String img) {
        imagen = new ImageIcon (getClass().getResource("/Images/" + img)).getImage();
        imgIcon = new ImageIcon(imagen);
    }
    
    public void AsgImgLb (String img, JLabel label){
        ChargImg(img);
        Image newimg = this.imagen.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        imgIcon = new ImageIcon (newimg);
        label.setIcon(imgIcon);
    }
    
    public void AsgImgBtn (String img, JButton button){
        ChargImg(img);
        Image newimg = this.imagen.getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
        imgIcon = new ImageIcon (newimg);
        button.setIcon(imgIcon);
    }
    
    
    public void ChargeTime(JTextField TextF){
        Timer time = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LocalDateTime now = LocalDateTime.now();
                
                
                //Formato de Fecha para subir a la base de datos
                DateTimeFormatter formOneS = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                DateTimeFormatter formTwoS = DateTimeFormatter.ofPattern("HH:mm:ss");
                String FechaS = now.format(formOneS);
                
               //Formato de Fecha que se insertara en los TextField
                DateTimeFormatter formOneM = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter formTwoM = DateTimeFormatter.ofPattern("HH:mm:ss");
                String Fecha = now.format(formOneM);
                String Hora = now.format(formTwoM);
                
                TextF.setText(Fecha + " - " + Hora);
                
                GlobFecha = Fecha;
                GlobHora = Hora;
                
                
            }
        });
        
        time.start();
    }
}
