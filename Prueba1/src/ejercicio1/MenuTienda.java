package ejercicio1;

import java.util.Scanner;
import java.util.Stack;


public class MenuTienda {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack Productos = new Stack();
		Productos.push("Aceite "+"$"+ 1990);
		Productos.push("Toallitas Higienicas $"+ 2090);

		Productos.push("Six Pack Escudo $"+3990);

		Productos.push("Six Pack Baltica $"+1990);
		Productos.push("Disco Iron Maiden $"+9990);
		Productos.push("Hallulla Corriente $"+1290+" kg");
		int op=1;
		do{
			System.out.println("===========MENU=========== \n"
				+ "1.- Agregar Producto.\n"
				+ "2.- Consultar Producto.\n"
				+ "3.- Retirar Producto.\n"
				+ "0.- salir.");
		
			System.out.println("Ingrese la opcion que desea ");
			op=sc.nextInt();
		
			switch(op) {
			case 1:
				agregarProducto(Productos);
				break;
			case 2:
				consultarProducto(Productos);
				break;
			case 3:
				retirarProducto(Productos);
				break;
			}	
		}while(op!=0);
		
	}
	
	public static void agregarProducto(Stack Products) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de productos a ingresar ");
		int n=sc.nextInt();

		sc.nextLine();
		for (int i=0;i<n;i++) {
			System.out.println(i+1+"°"+" Producto:");
			String S=sc.nextLine();

		for (int i=0;i<n;i++) {
			System.out.println(i+1+"°"+" Producto:");
			String S=sc.next();

			Products.push(S);
			
		}
	}
	
	private static void consultarProducto(Stack Products) {
		if (Products.empty()) {
			System.out.println("Sin Stock");
		}else {
			System.out.println("=====PRODUCTOS EN STOCK=====\n");
			for (int i =0;i<Products.size();i++) {
				System.out.println(Products.get(i)+"\n");
			}
		}

	}
	
	private static void retirarProducto(Stack Products) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese cantidad de datos a eliminar");
		int n=sc.nextInt();
		if (n>Products.size()) {
			System.out.println("Solo puede retirar "+Products.size()+" o menos productos");
		}else {
			for(int i = 0;i<n;i++) {
				Products.pop();
			}
		}

	} 
}
