package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Colas {
	public Queue ListaPrecios() {
		Queue listaPrecios = new LinkedList();

		listaPrecios.add(1000);
		listaPrecios.add(3000);
		listaPrecios.add(2500);
		listaPrecios.add(1500);
		listaPrecios.add(1800);
		return listaPrecios;
	}

	public static void main(String[] args) {
		Colas cola = new Colas();
		Queue recibeLista = cola.ListaPrecios();

		System.out.println("Lista de Precios: $" + recibeLista);

	}

}
