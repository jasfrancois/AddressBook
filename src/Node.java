
public class Node {
	
	//declare variables
	Contact data;
	Node next;

	//default constructor
	public Node() {
		
	}
	
	//node constructor
	public Node(Contact data, Node next) {
		this.data = data;
		this.next = next;
	}

	//getters
	public Contact getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	
	//setters
	public void setData(Contact data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
