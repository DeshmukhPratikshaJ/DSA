package linkedList;

public class TestMyLL {

	public static void main(String[] args) {
		MyLinkedList<Integer> l1=new MyLinkedList<>();
		
		//-----------insertion at last
		
		System.out.println(l1.insertIntoLL(10));
		System.out.println(l1.insertIntoLL(40));
		System.out.println(l1.insertIntoLL(60));
		System.out.println(l1.insertIntoLL(30));
		
		//----------display
		l1.displayLL(l1.getHead());
		//----------display in reverse
		l1.displayRev(l1.getHead());
		
		//-----------insertion at ith position
		System.out.println("is inserted:"+l1.insertIntoLL(100, 1));
		l1.displayLL(l1.getHead());
		System.out.println("is inserted:"+l1.insertIntoLL(90, 2));
		l1.displayLL(l1.getHead());
		System.out.println("is inserted (outside range):"+l1.insertIntoLL(100, 10));
		l1.displayLL(l1.getHead());
		
		MyLinkedList<String> l2=new MyLinkedList<>();
		System.out.println("is inserted in empty linked list at pos!=1 :"+l2.insertIntoLL("A",2));
		System.out.println("is inserted:"+l2.insertIntoLL("A"));
		l2.displayLL(l2.getHead());
		
		//------------counting total nodes
		
		System.out.println("length of l1:"+l1.countNodes());
		
		//-----------deletion from ith position
		MyLinkedList<String> l3=new MyLinkedList<>();
		System.out.println("is deleted from empty list:"+l3.deleteFromIthposition(4));
		l1.displayLL(l1.getHead());
		System.out.println("deleting from 3rd position:"+l1.deleteFromIthposition(3));
		l1.displayLL(l1.getHead());
		System.out.println("deleting from last position:"+l1.deleteFromIthposition(l1.countNodes()));
		l1.displayLL(l1.getHead());
		System.out.println("deleting from outof range position:"+l1.deleteFromIthposition(8));
		l1.displayLL(l1.getHead());
		
	}

}
