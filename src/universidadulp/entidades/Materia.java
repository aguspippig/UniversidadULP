/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadulp.entidades;

/**
 *
 * @author agus_
 */
public class Materia {
    
    private int idMateria, anioMateria;
    private String nombre;
    private boolean estado;

    public Materia() {
    }

    public Materia(int idMateria, int anioMateria, String nombre, boolean estado) {
        this.idMateria = idMateria;
        this.anioMateria = anioMateria;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Materia(int anioMateria, String nombre, boolean estado) {
        this.anioMateria = anioMateria;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre+", "+idMateria;
    }
}
