/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Trabajo_5;
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
  class Node {
	int key, height;
	Node left, right;
	Node(int d) {
	  key = d;
	  height = 1;
	}
    }
  class  Trabajo_5 {
      Node root;
	int height(Node N) {
		if (N == null)
			return 0;

		return N.height;
	}
	int max(int a, int b) {
		return (a > b) ? a : b;
	}
	Node rightRotate(Node y) {
		Node x = y.left;
		Node T2 = x.right;
		x.right = y;
		y.left = T2;
		y.height = max(height(y.left), height(y.right)) + 1;
		x.height = max(height(x.left), height(x.right)) + 1;
		return x;
	}
	Node leftRotate(Node x) {
		Node y = x.right;
		Node T2 = y.left;
		y.left = x;
		x.right = T2;
		x.height = max(height(x.left), height(x.right)) + 1;
		y.height = max(height(y.left), height(y.right)) + 1;
		return y;
	}
	int getBalance(Node N) {
		if (N == null)
			return 0;

		return height(N.left) - height(N.right);
	}
	Node insert(Node node, int key) {
		if (node == null)
			return (new Node(key));
		if (key < node.key)
			node.left = insert(node.left, key);
		else if (key > node.key)
			node.right = insert(node.right, key);
		else 
			return node;
		node.height = 1 + max(height(node.left),height(node.right));
		int balance = getBalance(node);
		if (balance > 1 && key < node.left.key)
	        return rightRotate(node);
		if (balance < -1 && key > node.right.key)
                return leftRotate(node);
		if (balance > 1 && key > node.left.key) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		if (balance < -1 && key < node.right.key) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}
	void preOrder(Node node) {
		if (node != null) {
		   System.out.print(node.key + " ");
		   preOrder(node.left);
		   preOrder(node.right);
		}
	}
        void InOrder(Node node){
        if(node!=null){
            InOrder(node.left);
            System.out.print(node.key +" ");
            InOrder(node.right);
        }
        }
        void InPos(Node reco){
        //Nodo reco=raiz;
        if(reco!=null){
            InPos(reco.left);
            InPos(reco.right);
            System.out.print(reco.key +" ");
        }
    }
    public static void main(String[] args) {
         metodosArboles ma=new metodosArboles();
          int min = 1;
          int max = 5000;
          int numero=100;
          Trabajo_5 tree = new Trabajo_5();
          int A[]=new int[numero];
          for(var i=0;i<numero;i++){
            A[i]=(int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println(i+1+"="+A[i]);
            tree.root=tree.insert(tree.root, A[i]);
            ma.insertar(A[i]);
          }
         System.out.println("ABB");
         System.out.println("");
         System.out.println("Recorrido Preorden");
         ma.imprimePre();
         System.out.println("Recorrido Inorden");
         ma.imprimeIn();
         System.out.println("Recorrido Postorden");
         ma.imprimePos();
         System.out.println("La cantidad de nodos del arcbol es: "+ma.cantidadNodos());
         System.out.println("La altura del arbol es: "+ma.retornaAltura());
         System.out.println("La cantidad de hojas del arbol es: "+ma.cantidadHojas());
         System.out.println("");
         System.out.println("AVL:"); 
         System.out.println("");
         System.out.println("Recorrido Preorden");
         tree.preOrder(tree.root);
         System.out.println("");
         System.out.println("Recorrido Inorden");
         tree.InOrder(tree.root);
         System.out.println("");
         System.out.println("Recorrido Postorden");
         tree.InPos(tree.root);
         System.out.println("");
        
 }    
}

	
 
 




