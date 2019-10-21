package holaMundo;

import java.util.Stack;

public class Hola {
	public static void main(String[] args) {
		Stack pila = new Stack();
		pila.push(5);
		pila.push("Hola");
		pila.push("Holi");
		System.out.println(pila);
		System.out.println("Tamaño "+pila.size());
	}

}
