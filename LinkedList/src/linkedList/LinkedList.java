package linkedList;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			Node n = head;

			while (n.next != null) {
				n = n.next;

			}
//			Travel to the next node
			n.next = node;
		}

	}

	public void print() {
		Node node = head;

		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

//	Borra el nodo que contiene determinada data
	public void deleteData(int data) {
		Node temp = head, prev = null;
		
		if(temp != null && temp.data == data) {
			head = temp.next;
			
		}

//		recorre la lista hasta donde esta la data 
		while (temp != null && data != temp.data) {
			prev = temp;
			temp = prev.next;

		}

		prev.next = temp.next;
		

	}

// Borra el nodo ubicado en determinada posicion
	public void deleteNode(int posicion) {
		Node temp = head, prev = null;
		int i = 0;

//		Si la posicion es 0 elimina la cabeza
		if (posicion == 0) {
			head = temp.next;

		}
//		recorre la lista hasta el anterior
		while (temp != null && i < posicion - 1) {
			prev = temp;
			temp = prev.next;
			i++;

		}

		prev.next = temp.next;

	}
}
