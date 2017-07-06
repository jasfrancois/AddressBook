
public class AddressBook {
	
	//declare variables
	private Node head;
	
	//constructor
	public AddressBook() {
		this.head = null;
	}
	
	//insertion function will create new contact
	public void insert(String firstName, String lastName, int phone, String email, String address) {
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
	
	public void delete(String lastName) {
		
	}
	
	public Contact search(String lastName) {
		
	}
	
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
	
	public void sort() {
		
	}
}
