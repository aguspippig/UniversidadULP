/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadulp.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadulp.entidades.*;

/**
 *
 * @author agus_
 */
public class InscripcionData {

    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
        con = Conexion.conectar();
    }

    public void guardarInscripcion(Inscripcion insc) {

        if (verificarInscripcion(insc)) {
            String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES (?,?,?)";

            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                ps.setDouble(1, insc.getNota());
                ps.setInt(2, insc.getAlumno().getIdAlumno());
                ps.setInt(3, insc.getMateria().getIdMateria());

                ps.executeUpdate();

                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()) {
                    insc.setIdInscripcion(rs.getInt(1));

                    JOptionPane.showMessageDialog(null, "Inscripcion realizada con exito.");
                }

                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion." + ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null,"El alumno ya esta inscripto en la materia.");
        }

    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<Inscripcion>();

        try {
            String sql = "SELECT * FROM inscripcion";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            Inscripcion insc = new Inscripcion();

            while (rs.next()) {
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                insc.getAlumno().setIdAlumno(rs.getInt("idAlumno"));
                insc.getMateria().setIdMateria(rs.getInt("idMateria"));

                inscripciones.add(insc);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion." + ex.getMessage());
        }

        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripciones = new ArrayList<Inscripcion>();

        try {
            String sql = "SELECT idInscripto, dni, apellido, nombre, nota FROM inscripcion JOIN alumno ON (inscripcion.idAlumno = alumno.idAlumno) WHERE alumno.idAlumno = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            Inscripcion insc = new Inscripcion();

            while (rs.next()) {
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                insc.getAlumno().setDni(rs.getInt("dni"));
                insc.getAlumno().setApellido(rs.getString("apellido"));
                insc.getAlumno().setNombre(rs.getString("nombre"));
                insc.setNota(rs.getDouble("nota"));

                inscripciones.add(insc);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion." + ex.getMessage());
        }

        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();

        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion JOIN materia ON (inscripcion.idMateria = materia.idMateria) WHERE inscripcion.idAlumno = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));

                materias.add(materia);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion." + ex.getMessage());
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();

        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion JOIN materia ON (inscripcion.idMateria = materia.idMateria) WHERE inscripcion.idAlumno != ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            Materia materia = new Materia();

            while (rs.next()) {
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));

                materias.add(materia);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion." + ex.getMessage());
        }

        return materias;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        try {
            String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int registro = ps.executeUpdate();

            if (registro == 1) {
                JOptionPane.showMessageDialog(null, "Inscripcion borrada.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion." + ex.getMessage());
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        try {
            String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int registro = ps.executeUpdate();

            if (registro == 1) {
                JOptionPane.showMessageDialog(null, "Nota actualizada.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion." + ex.getMessage());
        }
    }

    public List<Alumno> obtenerAlumnosXMateria(int id) {
        List<Alumno> alumnos = new ArrayList<Alumno>();

        try {
            String sql = "SELECT alumno.idAlumno,dni,apellido,alumno.nombre FROM alumno JOIN inscripcion ON (alumno.idAlumno = inscripcion.idAlumno) JOIN materia ON (inscripcion.idMateria = materia.idMateria) WHERE materia.idMateria = ? ORDER BY materia.nombre";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno alumno = new Alumno();
                
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion." + ex.getMessage());
        }

        return alumnos;
    }

    private boolean verificarInscripcion(Inscripcion insc) {
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,insc.getAlumno().getIdAlumno());
            ps.setInt(2,insc.getMateria().getIdMateria());
            
            ResultSet rs = ps.executeQuery();
            
            return !rs.next();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripcion. "+ex.getMessage());
        }
        
        return false;
    }
}
