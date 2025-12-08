package BASICS;

import java.util.Scanner;

public class Scannercls {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Surname:");
		char Surname = sc.next().charAt(0);
		sc.nextLine();

		System.out.print("Enter Your Name:");
		String Name = sc.nextLine();

		System.out.print("Enter Your Age:");
		int age = Integer.parseInt(sc.nextLine());

		System.out.println("SurName: " + Surname);
		System.out.println("Name: " + Name);
		System.out.println("Age: " + age);
		sc.close();
	}

}
