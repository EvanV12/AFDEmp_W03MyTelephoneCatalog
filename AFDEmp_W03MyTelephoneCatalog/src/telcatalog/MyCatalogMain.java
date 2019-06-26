package telcatalog;

import java.util.Scanner;


/**
 * @author Evangelos.Vergis
 *
 */
public class MyCatalogMain {
	
	public static void main(String[] args) {
		int option = 0;
		MyCatalog catalog = new MyCatalog();
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.println("Welcome to the phone catalog main menu.");
		
		
		catalog.readFile("telcatalog.txt");
		try {
		do {
		System.out.print("\n\nPlease select an option.\n" + "\n1. Display phone catalog" + "\n2. Search phone catalog for a name" + 
							" \n3. Search phone catalog for a phone number" + "\n4. Create a new entry" + "\n5. Update a name" + "\n6. Update a phone number" +
								" \n7. Delete a name" + "\n8. Delete a phone number" + "\n0. Exit program\n\n" + "You are selecting option # ");
		option = userInput.nextInt();		
		
		//  3. Get from each line the NAME, TEL and store them to an array
		if (option == 1) {
			catalog.printEntries();
		}
		
		// 4. Create the method SearchArray(String name) that searches the array based on name
		else if (option == 2) {
			catalog.searchArrayName(catalog.getName());	
		}
		
		// 5. Create the method SearchArray(String tel) that searches the array based on tel
		else if (option == 3) {
			catalog.searchArrayTel(catalog.getTel());
		}
		
		//  6. Create the method CreateEntry(String name, String tel) that inserts a new name,tel entry
		else if (option == 4) {
			catalog.createEntry(catalog.getName(), catalog.getTel());
		}
		
		//  7. Create the method UpdateEntry(String name) that returns true if the method did the update
		else if (option == 5) {
			catalog.updateEntryName(catalog.getName());
		}
		
		//  8. Create the method UpdateEntry(String tel) that returns true if the method did the update
		else if (option == 6) {
			catalog.updateEntryTel(catalog.getTel());
		}
		
		//  9. Create the method DeleteEntry(String name) that returns true if the method did the delete
		else if (option == 7) {
			catalog.deleteEntryName(catalog.getName());
		}
		
		// 10. Create the method DeleteEntry(String tel) that returns true if the method did the delete
		else if (option == 8) {
			catalog.deleteEntryTel(catalog.getTel());
			
		}
		}
		while (option != 0);
		
		if (option == 0) {
			System.out.println("\nProgram is terminated. Goodbye.");
		}

		//catalog.printEntries();
		
		userInput.close();
		
	}
		catch (Exception e) {
			System.out.println("Problem in main menu");
		//e.printStackTrace();
	}
	
		

}
}








