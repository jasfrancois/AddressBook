
public class Node {
	
	//declare variables
	Contact contact;
	Node next;

	//default constructor
	public Node() {
		
	}
	
	//node constructor
	public Node(Contact contact, Node next) {
		this.contact = contact;
		this.next = next;
	}

	//getters
	public Contact getContact() {
		return contact;
	}
	
	public Node getNext() {
		return next;
	}
	
	//setters
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
