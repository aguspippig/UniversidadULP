
package universidadulp.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadulp.entidades.Materia;


public class MateriaData {
    private Connection con=null;
    
    public MateriaData(){
        
        con = Conexion.conectar();
        
    }
    public void guardarMateria(Materia materia){
        
        String sql = "INSERT INTO materia (nombre, año, estado)"
                + "VALUE(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada!"); 
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
    }
    
    public void modificarMateria(Materia materia){
        
        String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ?"
                + "WHERE idMateria = ?";  
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            int exito = ps.executeUpdate();
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Alumno modificado!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
    }
    
}
