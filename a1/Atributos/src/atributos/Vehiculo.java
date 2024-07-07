/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atributos;

/**
 *
 * @author alumnos
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;
    
    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.tarifa=tarifa;
    }
    
    public void setmatricula(String matricula){
        this.matricula=matricula;
    }
    
    public void setmarca(String marca){
        this.marca=marca;
    }
    
    public void setmodelo(String modelo){
        this.modelo=modelo;
    }
    
    public void setcolor(String color){
        this.color=color;
    }
    
    public void settarifa(double tarifa){
        this.tarifa=tarifa;
    }
    
    public void setdisponible(boolean disponible){
        this.disponible=disponible;
    }
    
    public String getmatricula(){
        return matricula;
    }
    
    public String getmarca(){
        return marca;
    }
    
    public String getmodelo(){
        return modelo;
    }
    
    public String getcolor(){
        return color;
    }
    
    public double gettarifa(){
        return tarifa;
    }
    
    public boolean setdisponible(){
        return disponible;
    }
    
    public void showInfo(){
        System.out.println("Matricula: "+matricula);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Color: "+color);
        System.out.println("Tarifa: "+tarifa);
        if(disponible){
            System.out.println("Disponibilidad: Hay disponibilidad");
        }else{
            System.out.println("Disponibilidad: No hay disponibilidad");
        }
    }
}
