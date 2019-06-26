/**
 * 
 */
package telcatalog;

import java.util.Scanner;
/**
 * @author Evangelos Vergis
 *
 */
public class WeeklyProject1 {
	public int x;
	public int y;
	public static boolean a;
	public static boolean b;
	

	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String s = null;
		
		do {
			
		// Prompt user to enter 2 numbers.
		System.out.println("Welcome!\nPlease enter a number.");
		int x = userInput.nextInt();
		
		System.out.println("Please enter a second number");
		int y = userInput.nextInt();
	
		// Initializing boolean values based on user choices.
		if (x >= 0) {
			a = true;
			}
			else {
				a = false;
			}
		if (y >= 0) {
			b = true;
			}
		else {
			b = false;
			}
		// Condition #1
		System.out.println();
		if (a == false && b == false) {
			System.out.println("Condition #1\nBoth numbers were negative.\nThe result from their addittion is: " + (x+y) + ".\n");	
		}
		
		
		// Prompting user to continue.
		System.out.println("Do you want to continue? (Y/N)");
		s = userInput.next();	
		
		}
		while (s.equalsIgnoreCase("Y"));
		
		
		if (s.equalsIgnoreCase("N")) {
			System.out.println("\nProgram is terminated.\nThank you for your participation.");	
		}
		userInput.close();
	}

}

