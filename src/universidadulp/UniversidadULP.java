/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadulp;

import universidadulp.accesoADatos.AlumnoData;
import universidadulp.entidades.Alumno;

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
        
        Alumno alumno = aluData.buscarAlumno(37555630);
        
        System.out.println(alumno.getApellido());
    }
    
}
