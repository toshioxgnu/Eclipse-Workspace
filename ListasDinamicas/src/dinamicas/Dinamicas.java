package dinamicas;


import java.util.*;

public class Dinamicas {
	Queue <Integer> colas = new LinkedList();
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Dinamicas col = new Dinamicas();
		col.Ingresa();
		col.muestra();
		col.elimina();
		
	}
	public void Ingresa() {
		int elem,n;
		
		System.out.println("Ingrese cuantos elementos agregara");
		n=sc.nextInt();
		System.out.println("Ingrese elementos");
		for (int  i= 0 ; i < n;i++) {
			
			elem=sc.nextInt();
			colas.add(elem);
		}
	}
	
	public void muestra(){
		int i=1;
		for (Integer elem : colas) {
			System.out.println("elemento "+i);
			System.out.println(elem);
			i++;
		}
	}
	public void elimina() {
		int e;
		System.out.println("Ingrese cuantos elementos eliminara");
		e=sc.nextInt();
		for (int i = 0; i < e; i++) {
			colas.poll();
			System.out.println("Eliminado "+colas);
		}
		System.out.println("Nueva Cola "+colas);
	}

}
