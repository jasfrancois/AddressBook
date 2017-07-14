/**
 * Contact class creates contacts using input from user. Methods include getters
 * and setters.
 * 
 * @author Jasmine Francois
 *
 */
public class Contact {
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String address;

	/**
	 * Creates new contact
	 */
	public Contact() {

	}

	/**
	 * Creates new contact
	 * 
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param email
	 * @param address
	 */
	public Contact(String firstName, String lastName, String phone, String email, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	/**
	 * toString method displays all information about a contact.
	 */
	public String toString() {
		return lastName + ", " + firstName + ": <" + phone + ">, <" + email + ">, <" + address + ">";
	}

	// getters
	/**
	 * Retrieves first name of contact
	 * 
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Retrieves last name of contact
	 * 
	 * @return LastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Retrieves phone number of contact
	 * 
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Retrieves email address of contact
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Retrieves address of contact
	 * 
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	// setters

	/**
	 * Assigns first name of contact
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Assigns last name of contact
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Assigns phone number of contact
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Assigns email address of contact
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Assigns address of contact
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
