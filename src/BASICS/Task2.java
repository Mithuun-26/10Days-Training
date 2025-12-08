package BASICS;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Color(Red,Yellow,Green)");
		String color=obj.nextLine();
		switch(color){
		case "Red":
		System.out.println("Stop the Process!..");
		break;
		case "Yellow":
		System.out.println("Wait for the Process!..");
		break;
		case "Green":
		System.out.println("Start the Process!..");
		break;
		default: 
		System.out.println("Enter Valid Color!");
		}
		obj.close();
	}

}
