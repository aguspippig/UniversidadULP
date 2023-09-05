/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadulp;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author agus_
 */
public class Conexion {
    private String url,bd,usuario,pass,driver;
    private Connection cx;

    public Conexion(String bd) {
        this.bd = bd;
        url = "jdbc:mariadb://localhost:3306/";
        usuario = "root";
        pass = "";
        driver = "org.mariadb.jdbc.Driver";
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url+bd,usuario,pass);
            System.out.println("Conexion exitosa.");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar driver"+ex.getMessage());
        } catch (SQLException ex1) {
            JOptionPane.showMessageDialog(null, "Error en la conexion"+ex1.getMessage());
        }
        return cx;
    }
    
    public void desconectar(){
        try{
            cx.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudo desconectar"+ex.getMessage());
        }
    }
}
