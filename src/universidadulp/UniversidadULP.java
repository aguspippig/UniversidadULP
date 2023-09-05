/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadulp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author agus_
 */
public class UniversidadULP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion con = new Conexion("universidadulp");
        con.conectar();
        
        try {
            String sql = "INSERT INTO alumno (dni,apellido,nombre,fechaNacimiento,estado) "
                    + "VALUES (37555630,'Pippig','Agustin','1994-01-11',true)";
            
            PreparedStatement ps = con.conectar().prepareStatement(sql);
            
            int registro = ps.executeUpdate();
            
            System.out.println(registro);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error!"+ex.getMessage());
        }
    }
    
}
