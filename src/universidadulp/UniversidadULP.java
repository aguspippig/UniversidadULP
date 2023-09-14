/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadulp;

import java.util.List;
import universidadulp.accesoADatos.AlumnoData;
import universidadulp.accesoADatos.InscripcionData;
import universidadulp.accesoADatos.MateriaData;
import universidadulp.entidades.Alumno;
import universidadulp.entidades.Inscripcion;
import universidadulp.entidades.Materia;

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
        AlumnoData aluData = new AlumnoData();
        MateriaData materiaData = new MateriaData();
        InscripcionData inscData = new InscripcionData();
        
        /*List<Inscripcion> lista2 = inscData.obtenerInscripciones();
        
        for (Inscripcion inscripcion : lista2) {
            System.out.println(inscripcion.getIdInscripcion()+" "+inscripcion.getNota());
        }
        
        Materia materia = materiaData.buscarMateria(1);
        
        System.out.println(materia.getNombre());*/
        
        /*List<Materia> lista = inscData.obtenerMateriasCursadas(5);
        
        for (Materia materia : lista) {
            System.out.println(materia.getNombre());
        }*/
        
        //Alumno alumno = aluData.buscarAlumno(37555630);
        
        //System.out.println(alumno.getApellido());
        
        /*Alumno alu = aluData.buscarAlumno(5);
        Materia mate = materiaData.buscarMateria(3);
        Inscripcion insc = new Inscripcion(alu, mate, 8);
        
        inscData.guardarInscripcion(insc);*/
        
        /*Materia mate = new Materia(3, "ESI 1", true);
        
        materiaData.guardarMateria(mate);*/
        
        List<Alumno> lista = inscData.obtenerAlumnosXMateria(3);
        
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }
    }
    
}
