/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo;

/**
 *
 * @author 123
 */
public class Estudiante {
    String nombre;
    int nivel;
    public Estudiante() {
    }
    public Estudiante(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
public String getNombre() {
        return nombre;
    }
    public int getNivel() {
        return nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
