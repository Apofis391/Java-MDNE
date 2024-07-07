/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conciertoapp;

/**
 * @author Marcelo Narváez
 * ⠂⡅⠒⢄⠢⠐⡄⢢⠐⢄⠢⡐⢄⠢⡐⠄⢢⠐⢄⠢⡐⠰⠐⣂⠒⡄⠊⢷⠀⠀
⠑⣈⠱⢈⢂⠣⢘⠠⣉⠂⢆⠱⣈⢂⠱⡈⠆⣉⠂⢆⠡⢃⠱⡀⠣⢌⠱⠈⢧⠀
⠡⢂⠱⡈⢆⠱⣈⠒⠤⢉⢂⠒⠠⠌⢂⠱⠈⠤⢉⠢⡑⢌⠢⣁⠣⠌⡂⢍⡈⡆
⠘⡄⢣⠘⢄⠒⣠⠵⠞⣒⠯⠝⠉⠙⠋⠛⠛⠛⠲⠷⣤⣌⠒⢠⠃⡜⢐⠢⠄⡇
⢨⠐⣡⠼⣒⠯⠥⣴⡽⢲⣶⠒⡤⢖⣲⣤⠁⠀⠀⠀⠀⠈⢛⠶⠬⠤⡧⠶⠛⠁
⢠⣿⡷⠋⣁⠆⡄⠸⢷⡤⡩⠵⣧⣝⠥⠃⠀⠀⠀⠀⣀⠀⣿⣄⣀⣠⢤⣀⡀⠀
⣼⡟⠀⠀⢻⣾⡔⣠⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⢴⡋⠣⠀⠀⠀⠀⠙⣄⠉⢻
⣿⡱⠀⢀⠈⣿⣮⣁⣚⠐⠂⠂⠐⠈⠉⠁⠀⠀⣀⡿⠀⠀⠀⠀⠀⠀⠀⡬⢀⠀
⣿⣳⡁⠈⡆⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠁⠠⢈
⣿⣳⢧⣁⠺⣜⠿⠿⠿⣯⣟⣹⣋⠛⣍⣫⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⡌⠄
⢸⣯⡷⣵⠒⡌⠹⢄⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⢰⢡
⢀⠻⣿⣵⣻⡘⣇⠢⣉⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡤⢄⠀⢀⣴⡛⡬⢒
⢨⡖⢒⡋⢳⡋⢺⣗⣊⡑⢲⡖⠒⣚⡴⢲⣐⣦⠖⣒⡒⢶⡇⢸⡖⢋⡐⢫⠖⡭
⡠⡇⢸⡇⢸⡇⢸⡋⠰⡆⠘⡏⢸⡿⣟⠲⠆⣹⣀⠳⠞⣺⡄⢸⣄⠛⠃⣸⡹⢲
⠙⠏⠑⢫⢙⢮⣙⣾⣿⣿⢿⢛⡟⣛⢻⡛⣟⢫⡍⢯⣿⠛⣭⢇⡳⢻⡙⢮⡱⢣
 */
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConciertoApp {
    private static char[][] matrizAsientos = new char[27][11]; // Matriz de asientos (26 filas para el alfabeto y 10 columnas para números)
    private static List<String> reservas = new ArrayList<>(); // Lista para almacenar las reservas

    public static void main(String[] args) {
        inicializarMatriz(); // Llenar la matriz con caracteres y ceros

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("|------------ Menú -------------|");
            System.out.println("| Ingrese una opcion del 1 al 6 |");
            System.out.println("|  1. Desear comprar tickets    |");
            System.out.println("|  2. Ordenar por prioridad     |");
            System.out.println("|  3. Ver asientos disponibles  |");
            System.out.println("|  4. Ingreso al concierto      |");
            System.out.println("|  5. Devolución de ticket     |");
            System.out.println("|  6. Salir                     |");
            System.out.println("---------------------------------");
            
            int opcion = 0;
            boolean opcionValida = false;

            do {
                System.out.print("Ingrese la opción deseada: ");
                try {
                    opcion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    opcionValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un número válido.");
                    scanner.nextLine(); // Limpiar el buffer de entrada en caso de error
                }
            } while (!opcionValida);
            
            switch (opcion) {
                case 1:
                    comprarTickets(scanner);
                    break;
                case 2:
                    ordenarPorPrioridad();
                    break;
                case 3:
                    verAsientosDisponibles();
                    break;
                case 4:
                    mostrarReservasConRetraso();
                    break;
                case 5:
                    devolucionDeTicket();
                    break;
                case 6:
                    salir = true;
                    break;
                case 20:
                    System.out.println("* ⠂⡅⠒⢄⠢⠐⡄⢢⠐⢄⠢⡐⢄⠢⡐⠄⢢⠐⢄⠢⡐⠰⠐⣂⠒⡄⠊⢷⠀⠀\n" +
"⠑⣈⠱⢈⢂⠣⢘⠠⣉⠂⢆⠱⣈⢂⠱⡈⠆⣉⠂⢆⠡⢃⠱⡀⠣⢌⠱⠈⢧⠀\n" +
"⠡⢂⠱⡈⢆⠱⣈⠒⠤⢉⢂⠒⠠⠌⢂⠱⠈⠤⢉⠢⡑⢌⠢⣁⠣⠌⡂⢍⡈⡆\n" +
"⠘⡄⢣⠘⢄⠒⣠⠵⠞⣒⠯⠝⠉⠙⠋⠛⠛⠛⠲⠷⣤⣌⠒⢠⠃⡜⢐⠢⠄⡇\n" +
"⢨⠐⣡⠼⣒⠯⠥⣴⡽⢲⣶⠒⡤⢖⣲⣤⠁⠀⠀⠀⠀⠈⢛⠶⠬⠤⡧⠶⠛⠁\n" +
"⢠⣿⡷⠋⣁⠆⡄⠸⢷⡤⡩⠵⣧⣝⠥⠃⠀⠀⠀⠀⣀⠀⣿⣄⣀⣠⢤⣀⡀⠀\n" +
"⣼⡟⠀⠀⢻⣾⡔⣠⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⢴⡋⠣⠀⠀⠀⠀⠙⣄⠉⢻\n" +
"⣿⡱⠀⢀⠈⣿⣮⣁⣚⠐⠂⠂⠐⠈⠉⠁⠀⠀⣀⡿⠀⠀⠀⠀⠀⠀⠀⡬⢀⠀\n" +
"⣿⣳⡁⠈⡆⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠁⠠⢈\n" +
"⣿⣳⢧⣁⠺⣜⠿⠿⠿⣯⣟⣹⣋⠛⣍⣫⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⡌⠄\n" +
"⢸⣯⡷⣵⠒⡌⠹⢄⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⢰⢡\n" +
"⢀⠻⣿⣵⣻⡘⣇⠢⣉⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡤⢄⠀⢀⣴⡛⡬⢒\n" +
"⢨⡖⢒⡋⢳⡋⢺⣗⣊⡑⢲⡖⠒⣚⡴⢲⣐⣦⠖⣒⡒⢶⡇⢸⡖⢋⡐⢫⠖⡭\n" +
"⡠⡇⢸⡇⢸⡇⢸⡋⠰⡆⠘⡏⢸⡿⣟⠲⠆⣹⣀⠳⠞⣺⡄⢸⣄⠛⠃⣸⡹⢲\n" +
"⠙⠏⠑⢫⢙⢮⣙⣾⣿⣿⢿⢛⡟⣛⢻⡛⣟⢫⡍⢯⣿⠛⣭⢇⡳⢻⡙⢮⡱⢣");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        
        }
        System.out.println("Gracias por usar la aplicación de conciertos. ¡Hasta luego!");
    }

    private static void inicializarMatriz() {
        char letra = 'A';
        for (int i = 0; i < 27; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0 && j > 0) {
                    matrizAsientos[i][j] = (char) ('0' + j - 1); // Rellenar la primera fila con números
                } else if (j == 0 && i > 0) {
                    matrizAsientos[i][j] = letra; // Rellenar la primera columna con el alfabeto
                    letra++;
                } else {
                    matrizAsientos[i][j] = '0'; // Rellenar el resto con ceros
                }
            }
        }
    }

    private static void comprarTickets(Scanner scanner) {
        System.out.println("Seleccione el tipo de ticket:");
        System.out.println("1. Ticket de 50 dólares");
        System.out.println("2. Ticket de 20 dólares");
        System.out.print("Ingrese la opción deseada: ");
        int opcionTicket = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        switch (opcionTicket) {
            case 1:
                System.out.println("Ha seleccionado comprar un ticket de 50 dólares.");
                // Mostrar la matriz desde la fila A hasta la fila C y todas las columnas
                for (int i = 0; i <= 3; i++) {
                    for (int j = 0; j < matrizAsientos[i].length; j++) {
                        System.out.print(matrizAsientos[i][j] + " ");
                    }
                    System.out.println();
                }
                // Pedir al usuario la fila y columna deseadas
                System.out.print("Ingrese la fila deseada (A-C): ");
                String filaStr = scanner.next();
                scanner.nextLine(); // Limpiar el buffer de entrada

                char fila = filaStr.charAt(0);
                int filaIndex = fila - 'A' + 1; // Calcular el índice de la fila en la matriz
                
                int opcion = 0;
                boolean opcionValidass = false;

                do {
                    System.out.print("Ingrese la columna deseada (0-9): ");
                    
                    try {
                        int columna = scanner.nextInt();
                        
                        opcionValidass = true;
                        // Validar que la fila sea válida
                        if (fila >= '0' && fila <= 'C') {
                            // Validar que la columna sea válida
                            if (columna >= 0 && columna <= 9) {
                                // Cambiar el valor de la matriz a "X" en la fila y columna ingresadas por el usuario
                                matrizAsientos[filaIndex][columna + 1] = 'X';
                                System.out.println("Se ha reservado el asiento " + fila + columna + " exitosamente.");
                                // Agregar la reserva a la lista
                                reservas.add(fila + String.valueOf(columna));
                            } else {
                                System.out.println("Columna no válida, por favor intente nuevamente.");
                            }
                        } else {
                            System.out.println("Fila no válida, por favor intente nuevamente.");
                        }
                        
                        } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un número válido.");
                    scanner.nextLine(); // Limpiar el buffer de entrada en caso de error
                    
                }
                    
            } while (!opcionValidass);
                break;
            case 2:
                System.out.println("Ha seleccionado comprar un ticket de 20 dólares.");
                // Mostrar la matriz desde la fila D hasta la última fila y todas las columnas
                for (int i = 4; i < matrizAsientos.length; i++) {
                    for (int j = 0; j < matrizAsientos[i].length; j++) {
                        System.out.print(matrizAsientos[i][j] + " ");
                    }
                    System.out.println();
                }
                // Pedir al usuario la fila y columna deseadas
                System.out.print("Ingrese la fila deseada (D-Z): ");
                filaStr = scanner.next();
                scanner.nextLine(); // Limpiar el buffer de entrada

                fila = filaStr.charAt(0);
                filaIndex = fila - 'A' + 1; // Calcular el índice de la fila en la matrizint opcion = 0;
                boolean opcionValidas = false;

                do {
                    System.out.print("Ingrese la columna deseada (0-9): ");
                    
                    try {
                        int columna = scanner.nextInt();
                        
                        scanner.nextLine(); // Limpiar el buffer de entrada
                        opcionValidas = true;
                        // Validar que la fila sea válida
                        if (fila >= 'D' && fila <= 'Z') {
                            // Validar que la columna sea válida
                            if (columna >= 0 && columna <= 9) {
                                // Cambiar el valor de la matriz a "X" en la fila y columna ingresadas por el usuario
                                matrizAsientos[filaIndex][columna + 1] = 'X';
                                System.out.println("Se ha reservado el asiento " + fila + columna + " exitosamente.");
                                // Agregar la reserva a la lista
                                reservas.add(fila + String.valueOf(columna));
                            } else {
                                System.out.println("Columna no válida, por favor intente nuevamente.");
                            }
                        } else {
                            System.out.println("Fila no válida, por favor intente nuevamente.");
                        }
                        
                }catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un número válido.");
                    
                }
            } while (!opcionValidas);
                break;
        }
    }

    private static void ordenarPorPrioridad() { // Implementa la lógica para ordenar por prioridad aquí
        System.out.println("Ha seleccionado ordenar por prioridad.");

        // Ordenar la lista de reservas
        Collections.sort(reservas, new Comparator<String>() {
            @Override
            public int compare(String reserva1, String reserva2) {
                char letra1 = reserva1.charAt(0);
                char letra2 = reserva2.charAt(0);
                int num1 = Integer.parseInt(reserva1.substring(1));
                int num2 = Integer.parseInt(reserva2.substring(1));

                if (letra1 == letra2) {
                    return Integer.compare(num1, num2); // Si las letras son iguales, compara por número
                } else {
                    return Character.compare(letra1, letra2); // Si las letras son diferentes, compara por letra
                }
            }
        });

        // Imprimir la lista ordenada
        System.out.println("Lista de reservas ordenada:");
        for (String reserva : reservas) {
            System.out.println(reserva);
            try {
                Thread.sleep(2000); // Retraso de 2 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private static void verAsientosDisponibles() {
        // Imprimir la matriz de asientos
        System.out.println("Asientos disponibles:");
        for (int i = 0; i < matrizAsientos.length; i++) {
            for (int j = 0; j < matrizAsientos[i].length; j++) {
                if (i == 0 || j == 0) {
                    System.out.print(matrizAsientos[i][j] + " ");
                } else {
                    System.out.print(matrizAsientos[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static void ingresoAlConcierto() {
        // Implementa la lógica para el ingreso al concierto aquí
        System.out.println("Ha seleccionado ingreso al concierto.");
    }

    private static void devolucionDeTicket() {
        Scanner scanner = new Scanner(System.in);
         // Implementa la lógica para la devolución de ticket aquí
        System.out.println("Ha seleccionado devolución de ticket.");

        // Imprimir la lista de reservas para que el usuario vea las reservas actuales
        System.out.println("Lista de reservas:");
        for (String reserva : reservas) {
            System.out.println(reserva);
        }

        // Pedir al usuario la fila y columna de la reserva a devolver
        System.out.print("Ingrese la fila de la reserva a devolver (A-Z): ");
        String filaStr = scanner.next().toUpperCase();
        scanner.nextLine(); // Limpiar el buffer de entrada

        char fila = filaStr.charAt(0);
        int filaIndex = fila - 'A' + 1; // Calcular el índice de la fila en la matriz
        int opcion = 0;
            boolean opcionValida1 = false;
        do {
            System.out.print("Ingrese la columna de la reserva a devolver (0-9): ");
            try {
                int columna = scanner.nextInt();
            
                
                scanner.nextLine(); // Limpiar el buffer de entrada
                 opcionValida1 = true;
                // Validar que la fila sea válida
                if (fila >= 'A' && fila <= 'Z') {
                    // Validar que la columna sea válida
                    if (columna >= 0 && columna <= 9) {
                        // Verificar si la reserva existe en la lista
                        String reserva = fila + String.valueOf(columna);
                        if (reservas.contains(reserva)) {
                            // Cambiar el valor de la matriz a "0" en la fila y columna de la reserva
                            matrizAsientos[filaIndex][columna + 1] = '0';
                            System.out.println("Se ha devuelto el asiento " + reserva + " exitosamente.");

                            // Eliminar la reserva de la lista
                            reservas.remove(reserva);
                        } else {
                            System.out.println("La reserva no existe, por favor intente nuevamente.");
                        }
                    } else {
                        System.out.println("Columna no válida, por favor intente nuevamente.");
                    }
                } else {
                    System.out.println("Fila no válida, por favor intente nuevamente.");
                }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un número válido.");
                    scanner.nextLine(); // Limpiar el buffer de entrada en caso de error
                }
            } while (!opcionValida1);
        }


    private static void mostrarReservasConRetraso() {
        // Imprimir la lista de reservas con un retraso de 2 segundos entre elementos
        System.out.println("Lista de reservas:");
        for (String reserva : reservas) {
            System.out.println(reserva);
            try {
                Thread.sleep(2000); // Retraso de 2 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
