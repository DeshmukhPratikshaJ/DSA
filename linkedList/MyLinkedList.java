package linkedList;

public class MyLinkedList<T> {

	//data members-HEAD
	private Node head;
	
	//default ctor for linked list
	public MyLinkedList(){
		this.head=null;
	}

	//getter and setter of head
	public Node<T> getHead(){
		return this.head;
	}
	
	//insert into LL(AT END)
	public boolean insertIntoLL(T data) {
		System.out.println("in insertion");
		Node newNode=new Node<T>(data);
		if(head==null) {
			head=newNode;
			return true;
		}
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		return true;
	}
	
	//insert at ith position
	public boolean insertIntoLL(T data,int position) {
        Node newNode=new Node<T>(data);
        
        if(position<=0||(position>1 && head==null)) {
        	System.out.println("cannot insert");
        	return false;
        }
        
        if(position==1 && head==null) {
        	head=newNode;	
        	return true;
        }
        
        if(position==1 && head!=null) {
        	 newNode.setNext(head); 
        	 head=newNode;
        	 return true;
        }
        
        Node prevNode=head;
        for(int i=1;i<position-1;i++) {
        if(prevNode.getNext()!=null) 
        	prevNode=prevNode.getNext();
        else 
        	return false;
        }
        newNode.setNext(prevNode.getNext());
        prevNode.setNext(newNode);
		return true;
	}
	
	//display the linked list
	public void displayLL(Node head) {
		//System.out.println(head);
		if(head==null)
			return;
		System.out.print(head.getData()+" ");
		this.displayLL(head.getNext());
		System.out.println();
		
	}
	//display in reverse
	public void displayRev(Node head) {
		if(head!=null) {
			displayRev(head.getNext());
			System.out.println(head.getData()+" ");
			System.out.println();
		}
		else 
			return;
		
	}
	//delete from ith position
	public boolean deleteFromIthposition(int position)
	{
		if(head==null || position<=0) {
			System.out.println("can't delete");
			return false;
		}
		if(position==1) {
			System.out.println("element to delete:"+head.getData());
			head=head.getNext();
			System.out.println("new head:"+head.getData());
		}
		Node prev=head;
		for(int i=1;i<position-1;i++) {
			if(prev.getNext()!=null)
				prev=prev.getNext();
			else
				return false;
		}
		Node ith=prev.getNext();
		System.out.println("previous node:"+prev.getData());
		System.out.println("element of deletion:"+ith.getData());
		prev.setNext(ith.getNext());
		return true;
	}
	//count total length of linked list
	public int countNodes() {
		int count=0;
		
			Node last=head;
			while(last!=null) {
				count++;
				last=last.getNext();
			}
		return count;
	}
	//sort the linked list(for String and Integer type data only)
	
	
	
	//private node class
	private class Node<T>{
		private T data;
		private Node<T> next;
		
		//ctor for node
		private Node(T data){
			System.out.println("node creation");
			this.data=data;
			this.next=null;
		}
		//getter,setter for data and next

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			System.out.println("in setting next");
			this.next = next;
		}

		public T getData() {
			return data;
		}
		
	}
}
