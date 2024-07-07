/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epractica_2;
import java.util.*;
/**
 *⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⡋⠉⠒⢤⡀⠀⠀⠀⠀⠀⢠⠖⠉⠉⠙⠢⡄⠀
⠀⠀⠀⠀⠀⠀⢀⣼⣟⡒⠒⠀⠀⠀⠀  ⠙⣆⠀⠀⠀⢠⠃⠀⠀⠀⠀ ⠀⠹⡄
⠀⠀⠀⠀⠀⠀⣼⠷⠖⠀⠀⠀⠀⠀⠀⠀   ⠘⡆⠀⠀⡇⠀⠀⠀⠀⠀ ⠀⠀⢷
⠀⠀⠀⠀⠀⠀⣷⡒⠀⠀⢐⣒⣒⡒⠀⣐⣒⣒ ⣧⠀⠀⡇⠀⢠⢤⢠⡠⠀⢸
⠀⠀⠀⠀⠀⢰⣛⣟⣂⠀⠘⠤⠬⠃⠰⠑⠥⠊⣿⠀⢴⠃⠀⠘⠚⠘⠑⠐⢸
⠀⠀⠀⠀⠀⢸⣿⡿⠤⠀⠀⠀⠀⠀⢀⡆⠀ ⠀⣿⠀⠀⡇⠀⠀⠀⠀⠀⠀ ⠀⣸
⠀⠀⠀⠀⠀⠈⠿⣯⡭⠀⠀⠀⠀⢀⣀⠀⠀⠀⡟⠀  ⢸⠀⠀⠀⠀⠀  ⢠⠏
⠀⠀⠀⠀⠀⠀⠀⠈⢯⡥⠄⠀⠀⠀⠀ ⠀⠀⡼⠁⠀⠀⠀⠳⢄⣀⣀⣀⡴⠃⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⡦⣄⣀⣀⣀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠈⠉⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⠛⠃⠀⠀⠀⢹⠳⡶⣤⡤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⣠⢴⣿⣿⣿⡟⡷⢄⣀⣀⣀⡼⠳⡹⣿⣷⠞⣳⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⢰⡯⠭⠹⡟⠿⠧⠷⣄⣀⣟⠛⣦⠔⠋⠛⠛⠋⠙⡆⠀⠀⠀⠀⠀⠀⠀
⠀⠀⢸⣿⠭⠉⠀⢠⣤⠀⠀⠀⠘⡷⣵⢻⠀⠀⠀⠀⣼⠀⣇⠀⠀⠀⠀⠀⠀⠀
⠀⠀⡇⣿⠍⠁⠀⢸⣗⠂⠀⠀⠀⣧⣿⣼⠀⠀⠀⠀⣯⠀⢸⠀⠀⠀⠀⠀⠀⠀
 * @author Marcelo Narváez
 */
public class Epractica_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       int saldo = 3000, retirar, deposito,j,n;
       int saldo1 = 1000, saldo2 = 50000, saldo3 = 6000;
        Scanner s = new Scanner(System.in);
        Scanner opc = new Scanner(System.in);
        Queue<Persona> cola = new PriorityQueue<>();
        cola.add(new Persona("Daniel", 1));
        cola.add(new Persona("Katherine", 3));
        cola.add(new Persona("Julio", 2));
        cola.add(new Persona("Maria", 1));
        do{
            do{
        
                System.out.println("son las contraseñas de cada cliente ingresar de acuerdo al orden de prioridad");
                System.out.println("Daniel = 1290");
                System.out.println("Katherine = 2579");
                System.out.println("Julio = 3465");
                System.out.println("Marcia = 4156");
                System.out.println("Ingrese 0 para salir");
                System.out.println("Ingrese la contraseña");
                j = opc.nextInt();
                switch(j){
                    case 1290:
                        do{
                            do{
                                System.out.println("BIENVENIDO AL CAJERO AUTOMATICO DANIEL");
                                System.out.println("-----------------------------------");
                                System.out.println("PRESIONE 1 PARA RETIRAR SALDO");
                                System.out.println("PRESIONE 2 PARA DEPOSITAR SALDO");
                                System.out.println("PRESIONE 3 PARA VERIFICAR SU SALDO");
                                System.out.println("PRESIONE 4 PARA SALIR");
                                System.out.println("------------------------------------\n");
                                System.out.print("POR FAVOR SELECCIONE LA OPERACION QUE DESEA REALIZAR:");
                                n = s.nextInt();
                                switch(n)
                                {
                                    case 1:
                                    System.out.print("\nINGRESE LA CANTIDAD QUE DESEA RETIRAR:");
                                    retirar = s.nextInt();
                                    if(saldo >= retirar)
                                    {
                                        saldo = saldo - retirar;
                                        System.out.println("\nDINERO RETIRADO EXITOSAMENTE");
                                    }
                                    else
                                    {
                                        System.out.println("\nBALANCE INSUFICIENTE");
                                    }

                                    System.out.println("");
                                    break;

                                    case 2:
                                    System.out.print("\nINGRESE LA CANTIDAD QUE DESEA DEPOSITAR:");
                                    deposito = s.nextInt();
                                    saldo = saldo + deposito;
                                    System.out.println("\nSU DINERO HA SIDO DEPOSITADO EXITOSAMENTE");

                                    break;

                                    case 3:
                                    System.out.println("SALDO : "+saldo);

                                    break;

                                    case 4:
                                    System.out.println("GRACIAS POR USAR EL CAJERO AUTOMATICO");
                                    break;
                                }
                            }while(n<1 || n>4);

                        }while(n!=4);
                    break;
                    case 2579:
                        do{
                            do{
                                System.out.println("BIENVENIDO AL CAJERO AUTOMATICO KATHERINE");
                                System.out.println("-----------------------------------");
                                System.out.println("PRESIONE 1 PARA RETIRAR SALDO");
                                System.out.println("PRESIONE 2 PARA DEPOSITAR SALDO");
                                System.out.println("PRESIONE 3 PARA VERIFICAR SU SALDO");
                                System.out.println("PRESIONE 4 PARA SALIR");
                                System.out.println("------------------------------------\n");
                                System.out.print("POR FAVOR SELECCIONE LA OPERACION QUE DESEA REALIZAR:");
                                n = s.nextInt();
                                switch(n)
                                {
                                    case 1:
                                    System.out.print("\nINGRESE LA CANTIDAD QUE DESEA RETIRAR:");
                                    retirar = s.nextInt();
                                    if(saldo >= retirar)
                                    {
                                        saldo = saldo - retirar;
                                        System.out.println("\nDINERO RETIRADO EXITOSAMENTE");
                                    }
                                    else
                                    {
                                        System.out.println("\nBALANCE INSUFICIENTE");
                                    }

                                    System.out.println("");
                                    break;

                                    case 2:
                                    System.out.print("\nINGRESE LA CANTIDAD QUE DESEA DEPOSITAR:");
                                    deposito = s.nextInt();
                                    saldo = saldo + deposito;
                                    System.out.println("\nSU DINERO HA SIDO DEPOSITADO EXITOSAMENTE");

                                    break;

                                    case 3:
                                    System.out.println("SALDO : "+saldo);

                                    break;

                                    case 4:
                                    System.out.println("GRACIAS POR USAR EL CAJERO AUTOMATICO");
                                    break;
                                }
                            }while(n<1 || n>4);

                        }while(n!=4);
                    break;
                    case 3465:
                        do{
                            do{
                                System.out.println("BIENVENIDO AL CAJERO AUTOMATICO JULIO");
                                System.out.println("-----------------------------------");
                                System.out.println("PRESIONE 1 PARA RETIRAR SALDO");
                                System.out.println("PRESIONE 2 PARA DEPOSITAR SALDO");
                                System.out.println("PRESIONE 3 PARA VERIFICAR SU SALDO");
                                System.out.println("PRESIONE 4 PARA SALIR");
                                System.out.println("------------------------------------\n");
                                System.out.print("POR FAVOR SELECCIONE LA OPERACION QUE DESEA REALIZAR:");
                                n = s.nextInt();
                                switch(n)
                                {
                                    case 1:
                                    System.out.print("\nINGRESE LA CANTIDAD QUE DESEA RETIRAR:");
                                    retirar = s.nextInt();
                                    if(saldo >= retirar)
                                    {
                                        saldo = saldo - retirar;
                                        System.out.println("\nDINERO RETIRADO EXITOSAMENTE");
                                    }
                                    else
                                    {
                                        System.out.println("\nBALANCE INSUFICIENTE");
                                    }

                                    System.out.println("");
                                    break;

                                    case 2:
                                    System.out.print("\nINGRESE LA CANTIDAD QUE DESEA DEPOSITAR:");
                                    deposito = s.nextInt();
                                    saldo = saldo + deposito;
                                    System.out.println("\nSU DINERO HA SIDO DEPOSITADO EXITOSAMENTE");

                                    break;

                                    case 3:
                                    System.out.println("SALDO : "+saldo);

                                    break;

                                    case 4:
                                    System.out.println("GRACIAS POR USAR EL CAJERO AUTOMATICO");
                                    break;
                                }
                            }while(n<1 || n>4);

                        }while(n!=4);
                    break;
                    case 4165:
                        do{
                            do{
                                System.out.println("BIENVENIDO AL CAJERO AUTOMATICO MARCIA");
                                System.out.println("-----------------------------------");
                                System.out.println("PRESIONE 1 PARA RETIRAR SALDO");
                                System.out.println("PRESIONE 2 PARA DEPOSITAR SALDO");
                                System.out.println("PRESIONE 3 PARA VERIFICAR SU SALDO");
                                System.out.println("PRESIONE 4 PARA SALIR");
                                System.out.println("------------------------------------\n");
                                System.out.print("POR FAVOR SELECCIONE LA OPERACION QUE DESEA REALIZAR:");
                                n = s.nextInt();
                                switch(n)
                                {
                                    case 1:
                                    System.out.print("\nINGRESE LA CANTIDAD QUE DESEA RETIRAR:");
                                    retirar = s.nextInt();
                                    if(saldo >= retirar)
                                    {
                                        saldo = saldo - retirar;
                                        System.out.println("\nDINERO RETIRADO EXITOSAMENTE");
                                    }
                                    else
                                    {
                                        System.out.println("\nBALANCE INSUFICIENTE");
                                    }

                                    System.out.println("");
                                    break;

                                    case 2:
                                    System.out.print("\nINGRESE LA CANTIDAD QUE DESEA DEPOSITAR:");
                                    deposito = s.nextInt();
                                    saldo = saldo + deposito;
                                    System.out.println("\nSU DINERO HA SIDO DEPOSITADO EXITOSAMENTE");

                                    break;

                                    case 3:
                                    System.out.println("SALDO : "+saldo);

                                    break;

                                    case 4:
                                    System.out.println("GRACIAS POR USAR EL CAJERO AUTOMATICO");
                                    break;
                                }
                            }while(n<1 || n>4);

                        }while(n!=4);
                    break;
                }
            }while(j<0 || j>4156);
        }while(j!=0);
        System.out.println("Gracias por usar nuestro sistema");
    }
    
}
