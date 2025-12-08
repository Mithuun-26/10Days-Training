package BASICS;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Data Percent : ");
		int data = sc.nextInt();
		if (data < 50) {
			System.out.println("Low Usage!");
		} else if (data >= 50 && data <= 80) {
			System.out.println("Moderate Usage!");
		} else if (data >= 81 && data < 100) {
			System.out.println("High Usage - Warning!");
		} else {
			System.out.println("Data Limited Exceeded - Please Recharge!!!");
		}
		sc.close();

	}

}