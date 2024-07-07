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
public class Edge {
    int src, dest, weight;
 
    public Edge(int src, int dest, int weight)
    {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
 
    @Override
    public String toString() {
        return "(" + src + ", " + dest + ", " + weight + ")";
    }
}
 
// Una clase para representar un conjunto disjunto
class DisjointSet
{
    Map<Integer, Integer> parent = new HashMap<>();
 
    // realizar la operación MakeSet
    public void makeSet(int n)
    {
        // crea `n` conjuntos disjuntos (uno para cada vértice)
        for (int i = 0; i < n; i++) {
            parent.put(i, i);
        }
    }
 
    // Encuentra la raíz del conjunto al que pertenece el elemento `k`
    private int find(int k)
    {
        // si `k` es root
        if (parent.get(k) == k) {
            return k;
        }
 
        // recurre para el padre hasta que encontramos la raíz
        return find(parent.get(k));
    }
 
    // Realizar Unión de dos subconjuntos
    private void union(int a, int b)
    {
        // encontrar la raíz de los conjuntos a los que pertenecen los elementos `x` e `y`
        int x = find(a);
        int y = find(b);
 
        parent.put(x, y);
    }
 
    // Función para construir MST usando el algoritmo de Kruskal
    public static List<Edge> runKruskalAlgorithm(List<Edge> edges, int n)
    {
        // almacena los bordes presentes en MST
        List<Edge> MST = new ArrayList<>();
 
        // Inicializa la clase `DisjointSet`.
        // crea un conjunto singleton para cada elemento del universo.
        DisjointSet ds = new DisjointSet();
        ds.makeSet(n);
 
        int index = 0;
 
        // ordena los bordes aumentando el peso
        Collections.sort(edges, Comparator.comparingInt(e -> e.weight));
 
        // MST contiene exactamente los bordes `V-1`
        while (MST.size() != n - 1)
        {
            // considera el siguiente borde con peso mínimo del graph
            Edge next_edge = edges.get(index++);
 
            // encuentra la raíz de los conjuntos a los que pertenecen dos extremos
            // los vértices de la siguiente arista pertenecen
            int x = ds.find(next_edge.src);
            int y = ds.find(next_edge.dest);
 
            // si ambos extremos tienen diferentes padres, pertenecen a
            // diferentes componentes conectados y se pueden incluir en MST
            if (x != y)
            {
                MST.add(next_edge);
                ds.union(x, y);
            }
        }
 
        return MST;
    } 
}
