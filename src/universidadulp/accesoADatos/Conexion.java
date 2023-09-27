/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadulp.accesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author agus_
 */
public class Conexion {

    private static final String bd = "universidadulp";
    private static final String url = "jdbc:mariadb://localhost:3306/";
    private static final String usuario = "root";
    private static final String pass = "";
    private static final String driver = "org.mariadb.jdbc.Driver";
    
    private static Connection cx;

    public Conexion() {
    }

    public static Connection conectar() {
        if (cx == null) {
            try {
                Class.forName(driver);
                cx = DriverManager.getConnection(url + bd, usuario, pass);
                System.out.println("Conexion exitosa.");

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar driver" + ex.getMessage());
            } catch (SQLException ex1) {
                JOptionPane.showMessageDialog(null, "Error en la conexion" + ex1.getMessage());
            }
        }
        return cx;
    }

}
