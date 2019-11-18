package linkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		list.print();
		System.out.println("\n");
		list.deleteData(3);
		list.print();
		System.out.println("\n");
		list.deleteNode(3);
		list.print();
	}
}
