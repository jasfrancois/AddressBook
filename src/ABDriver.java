/**
 * ABDriver class utilizes and demonstrates the functionality of the AddressBook
 * program.
 * 
 * @author Jasmine Francois
 *
 */
public class ABDriver {

	public static void main(String[] args) {
		// create new Address book
		AddressBook newBook = new AddressBook();

		// insert completely new contacts
		newBook.insert("Tim", "Rutherford", "6524756743", "trutherford@gmail.com", "146 7th St");
		newBook.insert("Jasmine", "Francois", "5153460435", "jfrancois@dmacc.edu", "123 4th St");
		newBook.insert("Michael", "Parker", "5153573542", "mparker@dmacc.edu", "456 7th Ave");
		newBook.insert("Barack", "Obama", "5551234680", "barack@obama.com", "1600 Pennsylvania Ave");
		newBook.insert("Buzz", "Aldrin", "1112223333", "buzz@nasa.net", "555 Moon Road");

		// create contacts and add them to address book
		Contact SuzyClark = new Contact("Suzy", "Clark", "5154678901", "sclark@dmacc.edu", "567 8th Ct");
		newBook.insert(SuzyClark);
		Contact LuanneLopez = new Contact("Luanne", "Lopez", "7024789456", "llopez@gmail.com", "456 3rd Lane");
		newBook.insert(LuanneLopez);
		Contact GeorgeWashington = new Contact("George", "Washington", "no number", "george@washing.ton",
				"100 Cherry Tree Lane");
		newBook.insert(GeorgeWashington);

		System.out.println();

		// display all contacts
		newBook.display();

		// search for contact by last name
		System.out.println(newBook.search("Clark"));
		System.out.println(newBook.search("Obama"));
		System.out.println();

		// update contacts
		System.out.println(newBook.search("Rutherford")); // original contact
		newBook.update("Rutherford", "lastName", "Curry"); // update first name
		System.out.println(newBook.search("Rutherford")); // updated contact
		System.out.println();

		System.out.println(newBook.search("Washington")); // original contact
		newBook.update("Washington", "phone", "5151234567"); // update phone
		System.out.println(newBook.search("Washington")); // updated contact
		System.out.println();

		// delete contacts
		newBook.delete("Clark");
		newBook.delete("Lopez");
		newBook.display();

		// sort contacts and display them
		newBook.sort();
		newBook.display();

	}

}
