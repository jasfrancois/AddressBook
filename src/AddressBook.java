
public class AddressBook {
	
	//declare variables
	private Node head;
	
	//constructor
	public AddressBook() {
		this.head = null;
	}
	
	//insertion function will create new contact
	public void insert(String firstName, String lastName, String phone, String email, String address) {
		Contact newContact = new Contact(firstName, lastName, phone, email, address);
		Node node = new Node(newContact, null);
		
		if (head == null) {
			head = node;
			return;
		}
		
		else {
			Node next = head.getNext();
			if (next == null) {
				head.setNext(node);
				sort();
				return;
			}
			else {
				while (next.getNext() != null) {
					next = next.getNext();
				}
				next.setNext(node);
			}
		}	
	}
	
	//insert function using existing contact
	public void insert(Contact contact) {
		Node node = new Node(contact, null);
				
				if (head == null) {
					head = node;
					return;
				}
				
				else {
					Node next = head.getNext();
					if (next == null) {
						head.setNext(node);
						sort();
						return;
					}
					else {
						while (next.getNext() != null) {
							next = next.getNext();
						}
						next.setNext(node);
					}
				}
	}
	
	//delete contact by last name
	public void delete(String lastName) {
		Contact deleteMe = search(lastName);
		if (deleteMe != null) {
			Node current = head;
			String currentLast = current.getContact().getLastName();
			
			if (currentLast.equals(lastName)) {
				current.setNext(current.getNext());
			}
			else {
				Node next = current.getNext();
				String nextLast = next.getContact().getLastName();
				
				if (nextLast.equals(lastName)) {
					current.setNext(next.getNext());
				}
				else {
					current = next;
				}
			}
		}
		else {
			System.out.println("Could not delete contact " + lastName);
		}
	}
	
	//search for contact by last name
	public Contact search(String lastName) {
		Node current = head;
		String currentLast = current.getContact().getLastName();
		
		while (current != null) {
			if (currentLast.equals(lastName)) {
				return current.getContact();
			}
			else {
				current = current.getNext();
			}
		}
			System.out.println("Could not find contact "+ lastName);
			return null;		
	}
	
	//update information for contact
	public Contact update(String lastName, String updateCategory, String updateInfo) {
		//search for contact then update using setters
		Contact updateMe = search(lastName);
		if (updateMe != null) {
			switch (updateCategory.toLowerCase()) {
				case "firstName": 
					updateMe.setFirstName(updateInfo);
					break;
				case "lastName": 
					updateMe.setLastName(updateInfo);
					break;
				case "phone": 
					updateMe.setPhone(updateInfo);
					break;
				case "email": 
					updateMe.setEmail(updateInfo);
					break;
				case "address":
					updateMe.setAddress(updateInfo);
					break;
			}		
		}
		else {
			System.out.print("Could not update " + updateCategory + " for contact " + lastName);
		}
		return updateMe;
	}
	
	//sort method: insertion sort
	public void sort() {
		
		
	}

	public void display() {
		
	}
}
