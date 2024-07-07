/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciohyp;

/**
 *
 * @author alumnos
 */
public class Pelicula extends Netflix{
    private String genero;
    private int anio;
    
    public Pelicula(){
        titulo="Desconocido";
        genero="Desconocido";
        creador="Desconocido";
        anio=2000;
        duracion=0;
    }
    
    public Pelicula(String titulo, String creador){
        this.titulo=titulo;
        genero="Desconocido";
        this.creador=creador;
        anio=2000;
        duracion=0;
    }
    
    public Pelicula(String titulo, String genero, String creador, int anio, int duracion){
        this.titulo=titulo;
        this.genero=genero;
        this.creador=creador;
        this.anio=anio;
        this.duracion=duracion;
    }
    
    public String getGenero(){
        return genero;
    }
    public int getAnio(){
        return anio;
    }
   
    
    
    
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    public void setAnio(int anio){
        this.anio=anio;
    }
    
    
    @Override
    public String toString(){
        return ("Titulo: "+titulo+"\nGenero: "+genero+"\nCreador: "+creador+"\nAnio: "+anio+"\nDuracion: "+duracion+"\nVisto: "+visto+"\nTiempo Visto: "+tiempoVisto());
    }
}
