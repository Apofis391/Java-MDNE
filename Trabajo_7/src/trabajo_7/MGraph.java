/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_7;

/**
 *
 * @author 123
 */
public class MGraph {
    int verxs; // Indica el número de nodos en el gráfico
    char[] data;// Almacenar datos del nodo
    int[][] weight; // Almacenar bordes, que es nuestra matriz de adyacencia

    public MGraph(int verxs) {
        this.verxs = verxs;
        data = new char[verxs];
        weight = new int[verxs][verxs];
    }
}
