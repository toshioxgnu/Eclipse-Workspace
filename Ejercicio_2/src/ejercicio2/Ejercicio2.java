package ejercicio2;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio2 {
	public Queue Numeros() {
		Queue Numeros = new LinkedList();
		
		Numeros.add(3);
		Numeros.add(5);
		Numeros.add(6);
		Numeros.add(43);
		Numeros.add(44);
		return Numeros;
		

	}
	
	public void recorre(Queue cola) {
		while(!cola.isEmpty()){
			System.out.println(cola.remove());
			
			
		}
		System.out.println(cola);
	}
	
	public static void main(String[] args) {
		Ejercicio2 numeros = new Ejercicio2();
		Queue setnums = numeros.Numeros();
		
		System.out.println(setnums);
		
		numeros.recorre(setnums);
		
		
	}
}
