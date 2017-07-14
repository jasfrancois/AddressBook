/**
 * Node class is used for holding contacts and pointing to another contact in
 * list. Methods include getters and setters.
 * 
 * @author Jasmine Francois
 *
 */
public class Node {

	// declare variables
	Contact contact;
	Node next;

	/**
	 * Creates new node
	 */
	public Node() {

	}

	/**
	 * Creates new node
	 * 
	 * @param contact
	 * @param next
	 */
	public Node(Contact contact, Node next) {
		this.contact = contact;
		this.next = next;
	}

	// getters
	/**
	 * Retrieves contact
	 * 
	 * @return contact
	 */
	public Contact getContact() {
		return contact;
	}

	/**
	 * Retrieves node
	 * 
	 * @return next
	 */
	public Node getNext() {
		return next;
	}

	// setters
	/**
	 * Assigns contact information to contact
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	/**
	 * Assigns next node to contact
	 */
	public void setNext(Node next) {
		this.next = next;
	}

}
