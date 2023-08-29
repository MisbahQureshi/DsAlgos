package LinkedListLec;

public class Main {

	public static void main(String[] args) {
		NodeLL list = new NodeLL();
		//insert at first
		list.insertFirst(3);
		list.insertFirst(2);
		list.insertFirst(8);
		list.insertFirst(17);
		
		//insert at last
		list.insertLast(7);
		
		//insert other
		list.insertOther(13, 3);
		list.display();
		
		//delete first
		System.out.println();
		System.out.println(list.deleteFirst());
		list.display();
		
		//delete Last
		System.out.println();
		System.out.println(list.deleteLast());
		list.display();
		
		//delete other
		System.out.println();
		System.out.println(list.deleteOther(2));
		list.display();
		
		System.out.println(list.findIt(3));
	}

}
