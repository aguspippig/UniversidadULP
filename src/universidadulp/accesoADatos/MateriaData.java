
package universidadulp.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
            ps.setInt(4,materia.getIdMateria());
            int exito = ps.executeUpdate();
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }
    
    
    public void eliminarAlmuno (int id){
        
       // String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
             
        
        try {
            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
          //  if (exito==1) 
              //  JOptionPane.showMessageDialog(null, "Alumno eliminado!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia."+ ex);
        }
    }
    
    public Materia buscarMateria(int id){
        Materia materia = null;
        
        String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria = ?";
                
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia ingresada.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia."+ ex);
        }
        return materia;           
    }
    public List<Materia> listarMaterias(){
        
        String sql = "SELECT idMateria, nombre, año, estado FROM materia"
                + "WHERE estado = 1";
        ArrayList<Materia> materias = new ArrayList<>();
        Materia materia = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                
                materias.add(materia);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en acceder a la tabla materia.");
        }
        return materias;
    }
}
