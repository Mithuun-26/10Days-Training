package BASICS;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		        final String correctPassword = "Prince123";
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter Your Name:");
		        String userName = sc.nextLine();

		        String userInput;

		        do {
		            System.out.print("Enter your password: ");
		            userInput = sc.nextLine();

		            if (!userInput.equals(correctPassword)) {
		                System.out.println("Incorrect password! Please try again.\n");
		            }

		        } while (!userInput.equals(correctPassword));

		        System.out.println("Login successful!");
		        sc.close();
		    }
	}