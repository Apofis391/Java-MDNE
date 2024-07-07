/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *        ⢀⡤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀
    ⠀⠀⠀⠀⠀⢀⡏⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⣀⠴⠋⠉⠉⡆⠀⠀⠀⠀⠀
    ⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠈⠉⠉⠙⠓⠚⠁⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀
    ⠀⠀⠀⠀⢀⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣄⠀⠀⠀⠀
    ⠀⠀⠀⠀⡞⠀⠀⠀⠀⠀⠶⠀⠀⠀⠀⠀⠀⠦⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀
    ⢠⣤⣶⣾⣧⣤⣤⣀⡀⠀⠀⠀⠀⠈⠀⠀⠀⢀⡤⠴⠶⠤⢤⡀⣧⣀⣀⠀
    ⠻⠶⣾⠁⠀⠀⠀⠀⠙⣆⠀⠀⠀⠀⠀⠀⣰⠋⠀⠀⠀⠀⠀⢹⣿⣭⣽⠇
    ⠀⠀⠙⠤⠴⢤⡤⠤⠤⠋⠉⠉⠉⠉⠉⠉⠉⠳⠖⠦⠤⠶⠦⠞⠁⠀
 * @MarceloNarváez
 */
class QuickSort
{
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
      int num = 2 * i + 1;
      int num1 = 2 * i + 2;
      if (num < n && arr[num] > arr[largest])
        largest = num;
      if (num1 < n && arr[num1] > arr[largest])
        largest = num1;
      if (largest != i) {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
        heapify(arr, n, largest);
      }
    }
    static void printArray(int arr[]) {
      int num3 = arr.length;
      for (int i = 0; i < num3; ++i)
        System.out.print(arr[i] + " ");
      System.out.println();
    } 
    public void AlgoritmoQuickshort(int[] array){
            array=quicksort1(array);
    }
    public int[] quicksort1(int numeros[]){
        return quicksort2(numeros,0,numeros.length-1);
    }
    public int[] quicksort2(int[] num4, int izquierda, int derecha){
        if(izquierda>=derecha)
            return num4;
        int i=izquierda,d=derecha;
        if(izquierda!=derecha){
            int pivote;
            int aux;
            pivote=izquierda;
            while (izquierda!=derecha){
                while (num4[derecha]>=num4[pivote] && izquierda<derecha)
                    derecha--;
                if(derecha!=izquierda){
                    aux=num4[derecha];
                    num4[derecha]=num4[izquierda];
                    num4[izquierda]=aux;
                }
            }
            if(izquierda==derecha){
                quicksort2(num4,i,izquierda-1);
                quicksort2(num4,izquierda+1,d);
            }
            }else{
               return num4; 
            }
            return num4;
        }
    public void mostrar(int[] v){
        for(int i=0;i<v.length;i++){
            System.out.println(v[i]);
        }
    } 
    
}

