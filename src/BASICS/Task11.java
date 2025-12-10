package BASICS;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		float baseticketPrice = 500;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter your Passenger Count:");
		int PassengerCount = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Passenger Type:");
		String PassengerType = sc2.nextLine();
		switch (PassengerType) {
		case "Senior":
			float Discount1 = (baseticketPrice * PassengerCount * 40)/100;
			System.out.println("Passenger Count: " + PassengerCount);
			System.out.println("Amount Should Paid: $" + Discount1);
			break;
		case "Female":
			float Discount2 = (baseticketPrice * PassengerCount * 20)/100;
			System.out.println("Passenger Count: " + PassengerCount);
			System.out.println("Amount Should Paid: $" + Discount2);
			break;
		case "Child":
			float Discount3 = (baseticketPrice * PassengerCount * 50)/100;
			System.out.println("Passenger Count: " + PassengerCount);
			System.out.println("Amount Should Paid: $" + Discount3);
			break;
		case "Student":
			float Discount4 = (baseticketPrice * PassengerCount * 40)/100;
			System.out.println("Passenger Count: " + PassengerCount);
			System.out.println("Amount Should Paid: $" + Discount4);
			break;
		default :
			System.out.println("No Discount for You !");
			System.out.println("Amount Should Paid: $"+ (baseticketPrice*PassengerCount));
		}
		sc1.close();
		sc2.close();
	}
}