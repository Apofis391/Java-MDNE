/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcalculadora;

/**
 *
 * @author alumnos
 */
public class Calculadora {
    private int a;
    private int b;
    
    public int geta(){
        return this.a;
    }
    
    public int getb(){
        return this.b;
    }
    
    public void seta(int a){
        this.a=a;
    }
    
    public void setb(int b){
        this.b=b;
    }
    
    public int Suma(int a, int b){
        return a+b;
    }
    
    public int Multiplicacion(int a, int b){
        return a*b;
    }
    
    public int Resta(int a, int b){
        return a-b;
    }
    
    public double Division(int a, int b){
        return a/b;
    }
}
