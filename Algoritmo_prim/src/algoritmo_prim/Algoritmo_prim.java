/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo_prim;

/**
 *
 * @author 123
 */
public class Algoritmo_prim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { int n = g.getNumberOfVertices();
 
        Entry[] table = new Entry [n];
        for (int v = 0; v < n; ++v)
            table [v] = new Entry ();
        table [s].distance = 0;
 
        PriorityQueue queue =
            new BinaryHeap (g.getNumberOfEdges());
 
        queue.enqueue (
            new Association (new Int (0), g.getVertex (s)));
 
        while (!queue.isEmpty ())
        {
            Association assoc = (Association) queue.dequeueMin();
            Vertex v0 = (Vertex) assoc.getValue ();
 
            int n0 = v0.getNumber ();
            if (!table [n0].known)
            {
                table [n0].known = true;
                Enumeration p = v0.getEmanatingEdges ();
                while (p.hasMoreElements ())
                {
                    Edge edge = (Edge) p.nextElement ();
                    Vertex v1 = edge.getMate (v0);
                    int n1 = v1.getNumber ();
                    Int wt = (Int) edge.getWeight ();
                    int d = wt.intValue ();
                    if (!table[n1].known && table[n1].distance>d)
                    { 
                        table [n1].distance = d;
                        table [n1].predecessor = n0;
                        queue.enqueue (
                            new Association (new Int (d), v1));
                    }
                }
            }
        }
        Graph result = new GraphAsLists (n);
        for (int v = 0; v < n; ++v)
            result.addVertex (v);
        for (int v = 0; v < n; ++v)
        {
            if (v != s)
                result.addEdge (v, table [v].predecessor);
        }
        return result;
    }
    }
    
}
