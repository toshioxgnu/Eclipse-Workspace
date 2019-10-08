package stack;

import java.util.Stack;

public class Notas {
	public static void main(String[] args) {
		Stack notas = new Stack();
		
		notas.push(5.7);
		notas.push(2.3);
		notas.push(4.3);
		notas.push(4.1);
		
		System.out.println("Notas: ");
		for(int i=0; i<notas.size();i++) {
			System.out.println(notas.get(i));
		}
	}
}
