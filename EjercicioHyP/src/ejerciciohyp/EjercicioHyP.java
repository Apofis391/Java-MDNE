package ejerciciohyp;
import java.util.*;
/**
 *
 * @author Danny Jacome
 * Michael Villarreal
 * Brayan Zambrano
 * Marcelo Narvaez
 */
public class EjercicioHyP {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ArrayList<Pelicula> pelis=new ArrayList<>(5);
        ArrayList<Serie> series=new ArrayList<>(5);
        
        
        pelis.add(new Pelicula("Jurassic Park","Steven Spielberg"));
        pelis.add(new Pelicula("IT","Terror","Steven Spielberg",2017,135));
        pelis.add(new Pelicula("La momia","Aventura/Terror","Stephen Sommers",1999,124));
        pelis.add(new Pelicula("Mision Imposible","Acion","Brian De Palma",1996,110));
        pelis.add(new Pelicula("Copito de nieve","Infantil","Andre G Schaer",2011,90));
        
        series.add(new Serie("The Last of Us","Neil Dr",60,"Drama",1));
        series.add(new Serie("Rick y Morty","Dan Harmon",24,"Ficcion de aventuras",6));
        series.add(new Serie("Breaking bad","Vince Gilligan",47,"Drama",3));
        series.add(new Serie("Master Chef Espania","Macarena Rey(ES)",75,"Alimento",10));
        series.add(new Serie("Better Call Saul","Vince Gilligan",47,"Drama",6));
        
        pelis.get(0).marcarVisto();
        pelis.get(2).marcarVisto();
        pelis.get(3).marcarVisto();
        
        series.get(0).marcarVisto();
        series.get(1).marcarVisto();
        series.get(3).marcarVisto();
        
        
        series.get(0).setTiempoVisto(60);
        pelis.get(0).setTiempoVisto(145);
        series.get(1).setTiempoVisto(24);
        pelis.get(1).setTiempoVisto(102);
        series.get(2).setTiempoVisto(23);
        pelis.get(2).setTiempoVisto(124);
        series.get(3).setTiempoVisto(75);
        pelis.get(3).setTiempoVisto(110);
        series.get(4).setTiempoVisto(30);
        pelis.get(4).setTiempoVisto(45);
        
        System.out.println("PELICULAS\n");
        for(int i=0;i<5;i++){
            System.out.println(pelis.get(i).toString());
            System.out.println("---------------------------------------");
        }
        System.out.println("\nSERIES\n");
        for(int i=0;i<5;i++){
            System.out.println(series.get(i).toString());
            System.out.println("---------------------------------------");
        }
        
        /*System.out.println("\nPULSE ENTER PARA CONTINUAR");
        leer.next();*/
        
        Integer reciente =0;
        String recientep ="";
        int cont=0;
        for(int i=0; i<pelis.size();i++){
            if(pelis.get(i).getAnio()>reciente){
                reciente=pelis.get(i).getAnio();
                cont=i;
                recientep=pelis.get(i).getTitulo();
            }
        }
        System.out.println("La pelicula mas reciente es del anio: "+reciente);
        System.out.println("La pelicula es: "+recientep);
        
        int masTemp=0;
        String masTemps ="";
        for(int i=0; i<series.size();i++){
            if(series.get(i).getNoTemporadas()>masTemp){
                masTemp=series.get(i).getNoTemporadas();
                cont=i;
                masTemps=series.get(i).getTitulo();
            }
        }
        System.out.println("\nLa serie con mas temporadas tiene "+masTemp+" temporadas");
        System.out.println("La serie es: "+masTemps);
    }
    
}
