/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo_7;
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
public class Trabajo_7 {

    /**
     * @param args the command line arguments
     */
    // Numero de vertices en el grafo
	public static void main(String args[])
	{
		int nver;
    	Scanner valores = new Scanner(System.in);
                System.out.println("Dijktra");
                System.out.println("");
		System.out.print("  De el numero de vertices del Grafo: ");
		nver=valores.nextInt();
		dijks grafo=new dijks(nver);
		grafo.leetecl(nver);
		grafo.infin(nver);
		grafo.dijks1(nver);
		grafo.Imprime(nver);
                System.out.println("");
                System.out.println("Kruskal");
                System.out.println("");
                List<Edge> edges = Arrays.asList(
                new Edge(0, 1, 7), new Edge(1, 2, 8), new Edge(0, 3, 5),
                new Edge(1, 3, 9), new Edge(1, 4, 7), new Edge(2, 4, 5),
                new Edge(3, 4, 15), new Edge(3, 5, 6), new Edge(4, 5, 8),
                new Edge(4, 6, 9), new Edge(5, 6, 11));
 
                // número total de nodos en el graph (etiquetados de 0 a 6)
                int n = 7;
                // construir grafo
                List<Edge> e = DisjointSet.runKruskalAlgorithm(edges, n);
                System.out.println(e);
                System.out.println("");
                System.out.println("prim");
                System.out.println("");
                char[] data = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};
                int verxs = data.length;
                // La relación de la matriz de adyacencia está representada por una matriz bidimensional. El gran número de 10000 indica que los dos puntos no están conectados
                int[][] weight = new int[][]{{10000, 5, 7, 10000, 10000, 10000, 2}, {5, 10000, 10000, 9, 10000, 10000, 3}, {7, 10000, 10000, 10000, 8, 10000, 10000}, {10000, 9, 10000, 10000, 10000, 4, 10000}, {10000, 10000, 8, 10000, 10000, 5, 4}, {10000, 10000, 10000, 4, 5, 10000, 6}, {2, 3, 10000, 10000, 4, 6, 10000},};
                // Crear objeto MGraph
                MGraph graph = new MGraph(verxs); // Crea un objeto MinTree
                MinTree minTree = new MinTree();
                minTree.createGraph(graph, verxs, data, weight); //Salida
                minTree.showGraph(graph);
                // Prueba el algoritmo de Plim
                minTree.prim(graph, 0);//
	}
        
}
