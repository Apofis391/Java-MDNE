/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_7;
import java.util.*;
/**
 *
 * @author 123
 */
public class MinTree {
    public void createGraph(MGraph graph, int verxs, char data[], int[][] weight) {
        int i, j;
        for (i = 0; i < verxs; i++) {// Vertex graph.data [i] = data [i];
            for (j = 0; j < verxs; j++) {
                graph.weight[i][j] = weight[i][j];
            }
        }
    }

    // Mostrar la matriz de adyacencia del gráfico
    public void showGraph(MGraph graph) {
        for (int[] link : graph.weight) {
            System.out.println(Arrays.toString(link));
        }
    }

    // Escribe el algoritmo prim para obtener el árbol de expansión mínimo

    /**
           * gráfico gráfico @param
           * @param v significa generar'A '-> 0'B' -> 1 ...
     */
    public void prim(MGraph graph, int v) {
        // visitado [] marca si el nodo (vértice) ha sido visitado
        int visited[] = new int[graph.verxs];
        // visitado [] El valor del elemento predeterminado es 0, lo que significa que no ha sido visitado
        /*for (int i = 0; i < graph.verxs; i++) {
            visited[i] = 0;
        }*/

        // Marcar el nodo actual como visitado
        visited[v] = 1;
        // h1 y h2 registran los subíndices de los dos vértices
        int h1 = -1;
        int h2 = -1;
        int minWeight = 10000; // Inicializar minWeight a un número grande, que será reemplazado más adelante en el proceso transversal
        for (int k = 1; k < graph.verxs; k++) {// Debido a que hay vértices graph.verxs, después de que finaliza el algoritmo de Plim, hay bordes graph.verxs-1
            // Esto es para determinar cada subgrafo generado, qué nodo es el más cercano
            for (int i = 0; i < graph.verxs; i++) {// i nodo representa el nodo que se ha visitado
                for (int j = 0; j < graph.verxs; j++) {// j nodo significa un nodo que no ha sido visitado
                    if (visited[i] == 1 && visited[j] == 0 && graph.weight[i][j] < minWeight) {
                        // Reemplazar minWeight (encuentra el borde con el menor peso entre el nodo que se ha visitado y el nodo que no se ha visitado)
                        minWeight = graph.weight[i][j];
                        h1 = i;
                        h2 = j;
                    }
                }
            }
            // Encuentra una arista que sea la más pequeña
            System.out.println("Lado <" + graph.data[h1] + "," + graph.data[h2] + "> Peso:" + minWeight); // Marcar el nodo actual como visitado
            visited[h2] = 1;
            // minWeight se restablece al valor máximo de 10000
            minWeight = 10000;
        }
    }
}
