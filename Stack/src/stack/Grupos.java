package stack;

import java.util.Stack;

public class Grupos {
	public static void main(String[] args) {
		Stack musica = new Stack();
		musica.push("TWICE");
		musica.push("Iron Maiden");
		musica.push("Tulkas");
		musica.push("L'Arc~En~Ciel");
		
		System.out.println("El tamaño de la lista es de: "+musica.size());
		System.out.println("Cima: "+musica.peek());
		System.out.println("¿Cual es la posicion de tulkas?: "+musica.search("Tulkas"));
		System.out.println("Eliminando la banda "+musica.pop());
		System.out.println("Esta vacia la pila?");
		if (musica.empty()) {
			System.out.println("Si la pila esta vacia");
		}
		else {
			System.out.println("No, no esta vacia y los elementos que quedan son "+musica);
		}
	}

}
