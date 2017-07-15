/**
 * AddressBook class creates book and performs action upon contacts. Methods
 * include insert, delete, update, search, sort, and display.
 * 
 * @author Jasmine Francois
 */
public class AddressBook {

	// declare variables
	private Node head;

	/**
	 * Creates empty address book
	 */
	public AddressBook() {
		this.head = null;
	}

	/**
	 * Insert method creates entirely new contact from user input and inserts
	 * contact into address book.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param email
	 * @param address
	 */
	public void insert(String firstName, String lastName, String phone, String email, String address) {
		Contact newContact = new Contact(firstName, lastName, phone, email, address);
		Node node = new Node(newContact, null);

		if (head == null) {
			head = node;
			System.out.println("Contact " + lastName + " has been added.");
			return;
		}

		else {
			Node next = head.getNext();
			if (next == null) {
				head.setNext(node);
				System.out.println("Contact " + lastName + " has been added.");
				return;
			} else {
				while (next.getNext() != null) {
					next = next.getNext();
				}
				next.setNext(node);
				System.out.println("Contact " + lastName + " has been added.");
			}
		}
	}

	/**
	 * Insert method takes in existing contact and adds contact to address book.
	 * 
	 * @param contact
	 */
	public void insert(Contact contact) {
		Node node = new Node(contact, null);

		if (head == null) {
			head = node;
			System.out.println("Contact " + contact.getLastName() + " has been added.");
			return;
		}

		else {
			Node next = head.getNext();
			if (next == null) {
				head.setNext(node);
				System.out.println("Contact " + contact.getLastName() + " has been added.");
				return;
			} else {
				while (next.getNext() != null) {
					next = next.getNext();
				}
				next.setNext(node);
				System.out.println("Contact " + contact.getLastName() + " has been added.");
			}
		}
	}

	/**
	 * Delete method removes contact from address book and returns the deleted
	 * node.
	 * 
	 * @param lastName
	 * @return current
	 */
	public Node delete(String lastName) {
		Contact deleteMe = search(lastName);
		Node current = head;

		while (deleteMe != null) {
			String currentLast = current.getContact().getLastName();
			Node next = current.getNext();
			String nextLast = next.getContact().getLastName();
			if (currentLast.equals(lastName)) {
				head = next;
				System.out.println("Contact " + lastName + " has been deleted.");
				return current;
			} else if (nextLast.equals(lastName)) {
				current.setNext(next.getNext());
				System.out.println("Contact " + lastName + " has been deleted.");
				return current;
			} else {
				current = next;
			}
		}
		return null;
	}

	/**
	 * Search method looks for contacts and returns contact if found.
	 * 
	 * @param lastName
	 * @return Contact
	 */
	public Contact search(String lastName) {
		Node current = head;
		// String currentLast = current.getContact().getLastName();

		while (current != null) {
			String currentLast = current.getContact().getLastName();
			if (currentLast.equals(lastName)) {
				return current.getContact();
			} else {
				current = current.getNext();
			}
		}
		System.out.println("Could not find contact " + lastName);
		return null;
	}

	/**
	 * Update method updates Contact information and returns updated contact.
	 * 
	 * @param lastName
	 * @param updateCategory
	 * @param updateInfo
	 * @return Contact
	 */
	public Contact update(String lastName, String updateCategory, String updateInfo) {
		// search for contact then update using setters
		Contact updateMe = search(lastName);
		if (updateMe != null) {
			switch (updateCategory.toLowerCase()) {
			case "firstname":
				updateMe.setFirstName(updateInfo);
				System.out.println("Contact " + lastName + " has been updated.");
				break;
			case "lastname":
				updateMe.setLastName(updateInfo);
				System.out.println("Contact " + lastName + " has been updated.");
				break;
			case "phone":
				updateMe.setPhone(updateInfo);
				System.out.println("Contact " + lastName + " has been updated.");
				break;
			case "email":
				updateMe.setEmail(updateInfo);
				System.out.println("Contact " + lastName + " has been updated.");
				break;
			case "address":
				updateMe.setAddress(updateInfo);
				System.out.println("Contact " + lastName + " has been updated.");
				break;
			default:
				System.out.println("Could not update contact");
			}
		} else {
			System.out.print("Could not update " + updateCategory + " for contact " + lastName);
		}
		return updateMe;
	}

	private Node getMiddle(Node contact) {
		if (contact.getNext() == null) {
			return contact;
		}
		Node fast = contact.next;
		Node slow = contact;

		while (fast != null) {
			fast = fast.next;
			if (fast != null) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	}

	/**
	 * Sort method allows user to call sort with no parameter and returns the
	 * sorted head node.
	 * 
	 * @return Node
	 */
	public Node sort() {
		Node sorted = sort(head);
		return sorted;
	}

	// Sort methods works with merge sort to obtain alphabetized head node. sort
	// cuts linked list into halves.
	private Node sort(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node middle = getMiddle(head);

		// if (middle.next == null) {
		// return middle;
		// }

		Node rightHalf = middle.next;
		middle.next = null;

		Node left = sort(head);
		Node right = sort(rightHalf);

		Node sortedlist = mergeSort(left, right);
		return sortedlist;
	}

	// mergeSort works with sort to obtain alphabetized head node. mergeSort
	// compares names and reorders as necessary.
	private Node mergeSort(Node left, Node right) {
		Node result = null;

		while (left != null && right != null) {
			String leftName = left.getContact().getLastName();
			String rightName = right.getContact().getLastName();

			if (leftName.compareTo(rightName) < 0) {
				result = left;
				left = left.getNext();
			} 
			else if (leftName.compareTo(rightName) > 0) {
				if (result == null) {
					head = right;
					right = right.getNext();
					head.next = left;
					result = head;
				} 
				else {
					result.next = right;
					right = right.getNext();
					result.next.next = left;
					result = result.next;
				}
			}
			else {
				System.out.println("error during sort");
				return null;
			}
		}
		if (right != null) {
			result.next = right;
			right = right.getNext();
		}
		return head;
	}

	/**
	 * Display method prints all contacts in address book.
	 */
	public void display() {
		System.out.println("Here are all of your contacts!");
		Node current = head;
		while (current != null) {
			System.out.println(current.getContact().toString());
			current = current.getNext();
		}
		System.out.println();

	}

}
