package telcatalog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import java.util.Scanner;

/**
 * @author Evangelos.Vergis
 *
 */
public class MyCatalog {
	public String name;
	public String tel;
	static String[] telCatalogNames = new String[20];
	static String[] telCatalogTels = new String[20];
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public static String[] getTelCatalogNames() {
		return telCatalogNames;
	}
	public static void setTelCatalogNames(String[] telCatalogNames) {
		MyCatalog.telCatalogNames = telCatalogNames;
	}


	public static String[] getTelCatalogTels() {
		return telCatalogTels;
	}
	public static void setTelCatalogTels(String[] telCatalogTels) {
		MyCatalog.telCatalogTels = telCatalogTels;
	}


	public MyCatalog() { }

	
	//	String fileName = new String();
	//  1. Read the file telcatalog.txt
	//	readFile("telcatalog.txt");
	//  2. The structure of the file is NAME,TEL
		// A. Do we need to create any new classes?
		// B. Do we have to create any new classes?
		
		
		
	
	//  3. Get from each line the NAME, TEL and store them to an array
	public static void readFile(String fileName) {
		try {
            File f = new File(fileName);

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";
            int index = 0;
            while ((readLine = b.readLine()) != null) {
                //System.out.println(readLine);
                telCatalogNames[index] = readLine.substring(0, readLine.indexOf(","));
                telCatalogTels[index] = readLine.substring(readLine.indexOf(",") + 1, readLine.length());
                index++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	
	static void printEntries() {
		int i = 0;
		
		for(i = 0; i < 20; i++) {
			System.out.println(telCatalogNames[i] + " - " + telCatalogTels[i]);
		}
		System.out.println("\n\nReturning to main menu...");
	}
	
	
	
	// 4. Create the method SearchArray(String name) that searches the array based on name
	static void searchArrayName(String name) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("\nEnter name to search: ");
		name = userInput.next();
		
		boolean b;
	
		try {
		for (int i = 0; i < 20; i++) {	
			if (telCatalogNames[i].equalsIgnoreCase(name)) {
				b = true;
				break;
			}
			else {
				b = false;
			}
		}
		if (b = true) {
			System.out.println("\nName found");
		}
			else {
				System.out.println("\nName not found");
			}
		
		System.out.println("\nReturning to main menu...");
		
		//userInput.close();
		}catch (Exception e) {
			System.out.println("\nResult not found\nUnexpected Problem\n\nReturning to main menu...");
			// e.printStackTrace();
		}
	}
	
	// 5. Create the method SearchArray(String tel) that searches the array based on tel
	static void searchArrayTel(String tel) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter phone number to search: ");
		tel = userInput.next();
		
		boolean b;
	
		try {
		for (int i = 0; i < 20; i++) {
			if (telCatalogTels[i].equals(tel)) {
				b = true;
				break;
			}
			else {
				b = false;
			}
		}
		if (b = true) {
			System.out.println("\nPhone number found");
		}
			else {
				System.out.println("\nPhone number not found");
			}
		
		System.out.println("\nReturning to main menu...");
		
		//userInput.close();
		}catch (Exception e) {
			System.out.println("\nResult not found\nUnexpected Problem\n\nReturning to main menu...");
			// e.printStackTrace();
		}
	}
	
	
	//  6. Create the method CreateEntry(String name, String tel) that inserts a new name,tel entry
	static void createEntry(String name, String tel) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("\nLet's create a new entry.\nEnter new name: ");
		name = userInput.next();
		System.out.print("\nEnter new phone number: ");
		tel = userInput.next();
		
		try {
			for (int i = 0; i < 50; i++) {
				if (telCatalogNames[i] == null) {
				telCatalogNames[i] = name;
				
				if (telCatalogTels[i] == null)
				telCatalogTels[i] = tel;
				break;
				}
			}
			
			System.out.println("\nNew entry successfully created.\nReturning to main menu...");
			
		}catch (Exception e) {
			System.out.println("\nResult not found\nUnexpected Problem\n\nReturning to main menu...");
			// e.printStackTrace();
		}
	}
	
	//  7. Create the method UpdateEntry(String name) that returns true if the method did the update
	static void updateEntryName(String name) {
		
			Scanner userInput = new Scanner(System.in);
			System.out.print("\nLet's update an existing name.\nEnter name to update: ");
			name = userInput.next();
			System.out.print("\nEnter new name: ");
			String newname = userInput.next();
			
			boolean b;
			
			try {
				for (int i = 0; i < telCatalogNames.length; i++) {
					if (telCatalogNames[i].equalsIgnoreCase(name)) {
						telCatalogNames[i] = newname;
						b = true;
						break;
					}
					else {
						b = false;
					}
				}
				if (b = true) {
					System.out.println("\nName updated successfully.");
				}
				System.out.println("\nReturning to main menu...");
				
				//userInput.close();
		}catch (Exception e) {
			System.out.println("\nResult not found\nUnexpected Problem\n\nReturning to main menu...");
			// e.printStackTrace();
		}
	}
	
	//  8. Create the method UpdateEntry(String tel) that returns true if the method did the update
	static void updateEntryTel(String tel) {
		
			Scanner userInput = new Scanner(System.in);
			System.out.print("\nLet's update an existing phone number.\nEnter phone number to update: ");
			tel = userInput.next();
			System.out.print("\nEnter new phone number: ");
			String newtel = userInput.next();
			
			boolean b;
			
			try {
				for (int i = 0; i < telCatalogNames.length; i++) {
					if (telCatalogNames[i].equalsIgnoreCase(tel)) {
						telCatalogNames[i] = newtel;
						b = true;
					}
					else {
						b = false;
					}
				}
				if (b = true) {
					System.out.println("\nPhone number updated successfully.");
				}
				
			System.out.println("\nReturning to main menu...");
			
			//userInput.close();
		}catch (Exception e) {
			System.out.println("\nResult not found\nUnexpected Problem\n\nReturning to main menu...");
		    // e.printStackTrace();
		}
	}
	
	//  9. Create the method DeleteEntry(String name) that returns true if the method did the delete
	static void deleteEntryName(String name) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("\nEnter name to delete: ");
		name = userInput.next();
		
		boolean b;
		
		try {
			for (int i = 0; i < telCatalogNames.length; i++) {
			if (telCatalogNames[i].equalsIgnoreCase(name)) {
				telCatalogNames[i] = null;
				b = true;
			}
				else {
					b = false;
				}
			}
			if (b = true) {
				System.out.println("\nName deleted successfully.");
			}
			
			System.out.println("\nReturning to main menu...");
			
		}catch (Exception e) {
			System.out.println("\nResult not found\nUnexpected Problem\n\nReturning to main menu...");
		       // e.printStackTrace();
		    }
	}
	
	// 10. Create the method DeleteEntry(String tel) that returns true if the method did the delete
	static void deleteEntryTel(String tel) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("\nEnter tel to delete: ");
		tel = userInput.next();
		
		boolean b;
		
		try {
			for (int i = 0; i < telCatalogTels.length; i++) {
				//a = true;
			if (telCatalogTels[i].equalsIgnoreCase(tel)) {
				telCatalogTels[i] = null;
				b = true;	
			}
			else {
				b= false;
			}
			
			}
			if (b = true) {
				System.out.println("\nPhone number deleted successfully.");
			}
			
			System.out.println("\nReturning to main menu...");
			
		}catch (Exception e) {
			System.out.println("\nResult not found\nUnexpected Problem\n\nReturning to main menu...");
		    // e.printStackTrace();
		}
	}


	
	
}





















