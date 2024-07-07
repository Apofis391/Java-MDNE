/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciohyp;

/**
 *
 * @author alumnos
 */
public class Serie extends Netflix {
    int noTemporadas=1;
    
    public Serie(){
        titulo="Desconocido";
        creador="Desconocido";
        duracion=0;
        genero="Desconocido";
    }
    public Serie(String titulo, String creador){
        this.titulo=titulo;
        this.creador=creador;
        duracion=0;
    }
    public Serie(String titulo, String creador, int duracion, String genero, int noTemporadas ){
        this.titulo=titulo;
        this.creador=creador;
        this.duracion=duracion;
        this.genero=genero;
        this.noTemporadas=noTemporadas;
    }
    
    public int getNoTemporadas(){
        return noTemporadas;
    }
    
    public void setNoTemporadas(int noTemporadas){
        this.noTemporadas=noTemporadas;
    }
    
    @Override
    public String toString(){
        return ("Titulo: "+titulo+"\nNo. Temporadas: "+noTemporadas+"\nVisto: "+visto+"\nCreador: "+creador+"\nDuracion: "+duracion+"\nTiempo Visto: "+tiempoVisto());
    }
}
