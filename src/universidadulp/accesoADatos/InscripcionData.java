/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadulp.accesoADatos;

import java.sql.*;
import universidadulp.entidades.Inscripcion;

/**
 *
 * @author agus_
 */
public class InscripcionData {
    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES (?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setDouble(1, insc.getNota());
            ps.set
        }catch(SQLException ex){
            
        }
    }
}
