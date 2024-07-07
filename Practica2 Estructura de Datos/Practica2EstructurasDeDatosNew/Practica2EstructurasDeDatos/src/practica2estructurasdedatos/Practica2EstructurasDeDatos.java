/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2estructurasdedatos;

/**
 *
 * @author Danny
 */
public class Practica2EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int time=0;
        int timeSal;
        int persona=1;
        int personasAten=0;
        Cola co=new Cola();
        co.encolar(time);
        do{
            timeSal=time+(int)Math.floor(Math.random()*(4-2+1)+2);
            if(timeSal<600){
                co.desencolar();
                personasAten++;
            }
            persona++;
            time+=(int)Math.floor(Math.random()*(3-2+1)+2);
            if(time<600)
                co.encolar(time);
        }while(time<600);
        System.out.println("Cantidad de clientes atendidas en 10 horas: "+personasAten);
        System.out.println("Cantidad de clientes despues de 10 horas: "+co.size());
        int minutos;
        int horas;
        if(!co.vacia()){
            horas=(int)(co.getllegada()/60);
            minutos=co.getllegada()%60;
            System.out.println("Hora de llegada del primer cliente no atendido de las 10 horas: "+horas+":"+minutos);
        }else{
            System.out.println("Todos fueron atendidos");
        }
    }
    
}
