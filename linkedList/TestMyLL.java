package linkedList;

public class TestMyLL {

	public static void main(String[] args) {
		MyLinkedList<Integer> l1=new MyLinkedList<>();
		
		System.out.println(l1.insertIntoLL(10));
		System.out.println(l1.insertIntoLL(40));
		System.out.println(l1.insertIntoLL(60));
		System.out.println(l1.insertIntoLL(30));
		
//		l1.displayLL(l1.getHead());
//		System.out.println("is inserted:"+l1.insertIntoLL(100, 1));
//		l1.displayLL(l1.getHead());
//		System.out.println("is inserted:"+l1.insertIntoLL(90, 2));
		l1.displayLL(l1.getHead());
//		System.out.println("is inserted (outside range):"+l1.insertIntoLL(100, 10));
//		l1.displayLL(l1.getHead());
//		
//		MyLinkedList<String> l2=new MyLinkedList<>();
//		System.out.println("is inserted in empty linked list at pos!=1 :"+l2.insertIntoLL("A",2));
//		System.out.println("is inserted:"+l2.insertIntoLL("A"));
//		l2.displayLL(l2.getHead());
		
//		System.out.println("length of l1:"+l1.countNodes());
		
		
		MyLinkedList<String> l3=new MyLinkedList<>();
		System.out.println("is deleted from empty list:"+l3.deleteFromIthposition(4));
		
		l1.displayLL(l1.getHead());
		System.out.println("deleting from 1st position:"+l1.deleteFromIthposition(1));
		System.out.println("deleting from 3rd position:"+l1.deleteFromIthposition(3));
		l1.displayLL(l1.getHead());
		System.out.println("deleting from outof range position:"+l1.deleteFromIthposition(8));
		
		
	}

}
