package atributos;

public class Atributos {

    public static void main(String[] args) {
        
        Vehiculo vehiculo1=new Vehiculo("PCB 4072","Chevrolet","Onix","Negro",64999.99);
        Vehiculo vehiculo2=new Vehiculo("PAQ 8712","Toyota","Raft","Morado",19999.99);
        Vehiculo vehiculo3=new Vehiculo("ICH 7714","Mazda","CX-30","Verde",39999.99);
        Vehiculo vehiculo4=new Vehiculo("ABM 8124","Nissan","Versa","Azul",24999.99);
        Vehiculo vehiculo5=new Vehiculo("IUN 1220","Peugeot","SUV 3008","Blanco",14999.99);
        
        vehiculo1.setdisponible(true);
        vehiculo2.setdisponible(false);
        vehiculo3.setdisponible(true);
        vehiculo4.setdisponible(false);
        vehiculo5.setdisponible(true);
        
        System.out.println("Vehiculo 1:");
        vehiculo1.showInfo();
        System.out.println("\n Vehiculo 2:");
        vehiculo2.showInfo();
        System.out.println("\n Vehiculo 3:");
        vehiculo3.showInfo();
        System.out.println("\n Vehiculo 4:");
        vehiculo4.showInfo();
        System.out.println("\n Vehiculo 5:");
        vehiculo5.showInfo();
    }
}