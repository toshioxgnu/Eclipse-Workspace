package linkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(3);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		
		list.print();
		
		list.deleteNode(3);
		list.print();
	}
}
