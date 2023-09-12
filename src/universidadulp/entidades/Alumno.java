/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadulp.entidades;

import java.time.LocalDate;

/**
 *
 * @author agus_
 */
public class Alumno {
    
    private int idAlumno, dni;
    private String apellido, nombre;
    private LocalDate fechaNacimiento;
    private boolean estado;

    public Alumno() {
    }

    public Alumno(int idAlumno, int dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public Alumno(int dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "ID: " + idAlumno + ", DNI: " + dni + ", Apellido: " + apellido + ", Nombre:" + nombre + ", Fecha de Nacimiento: " + fechaNacimiento + ", Estado: " + estado;
=======
        return "Alumno{" + "ID=" + idAlumno + "DNI=" + dni + ", Apellido=" + apellido + ", Nombre=" + nombre + ", Fecha de Nacimiento=" + fechaNacimiento + ", Estado=" + estado + '}';
>>>>>>> parent of f9264c5 (Buscar alumno por ID)
    }
}
