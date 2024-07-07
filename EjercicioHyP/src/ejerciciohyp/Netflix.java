/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciohyp;

/**
 *
 * @author alumnos
 */
public abstract class Netflix implements Visualizable {
    protected String titulo;
    protected String creador;
    protected int duracion;
    protected String genero;
    protected boolean visto=false;
    protected int tiempoVisto;
    
    public String getTitulo(){
        return titulo;
    }
    public String getCreador(){
        return creador;
    }
    public int getDuracion(){
        return duracion;
    }
    public String getGenero(){
        return genero;
    }
    
    public void setTiempoVisto(int tiempoVisto){
        this.tiempoVisto=tiempoVisto;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setCreador(String creador){
        this.creador=creador;
    }
    public void setDuracion(int duracion){
        this.duracion=duracion;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    @Override
    public void marcarVisto(){
        visto=true;
    }
    @Override
    public boolean esVisto(){
        return visto;
    }
    @Override
    public int tiempoVisto(){
        return tiempoVisto;
    }
}
