/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryanzambranoexamenestructuradedatos;
/**
 *
 * @author Bryan Zambrano
 */
public class HeapSort {
    public void sort(int arr[]) {
      int n = arr.length;
      for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
      }
      for (int i = n - 1; i >= 0; i--) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        heapify(arr, i, 0);
      }
    }
    void heapify(int arr[], int n, int i) {
      int largest = i;
      int l = 2 * i + 1;
      int r = 2 * i + 2;
      if (l < n && arr[l] > arr[largest])
        largest = l;
      if (r < n && arr[r] > arr[largest])
        largest = r;
      if (largest != i) {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
        heapify(arr, n, largest);
      }
    }
    static void printArray(int arr[]) {
      int n = arr.length;
      for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
      System.out.println();
    } 
    public void AlgoritmoQuick(int[] array){
            array=quicksort1(array);
    }
    public int[] quicksort1(int numeros[]){
        return quicksort2(numeros,0,numeros.length-1);
    }
    public int[] quicksort2(int numeros[], int izq, int der){
        if(izq>=der)
            return numeros;
        int i=izq,d=der;
        if(izq!=der){
            int pivote;
            int aux;
            pivote=izq;
            while (izq!=der){
                while (numeros[der]>=numeros[pivote] && izq<der)
                    der--;
                if(der!=izq){
                    aux=numeros[der];
                    numeros[der]=numeros[izq];
                    numeros[izq]=aux;
                }
            }
            if(izq==der){
                quicksort2(numeros,i,izq-1);
                quicksort2(numeros,izq+1,d);
            }
            }else{
               return numeros; 
            }
            return numeros;
        }
    public void mostrar(int[] v){
        for(int i=0;i<v.length;i++){
            System.out.println(v[i]);
        }
    } 
    
   
}

    
