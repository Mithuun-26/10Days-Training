package BASICS;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int Salary = 50000;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter How Many Days You Take Leave:");
		int leave = obj.nextInt();
		if (leave >= 5) {
			for (int i = 4; i <= leave; i++) {
				int new_Salary = Salary - 500;
				Salary = new_Salary;
			}
		} else {
			System.out.println("No Salary Dedution for Leave");
		}
		int NewSalary = Salary;
		System.out.println("Enter Your Performance Rating:");
		int rating = obj.nextInt();
		if (rating > 90) {
			System.out.println("No Salary Dedution " + Salary);
		} else if (rating >= 75) {
			Salary = (Salary * 2) / 100;
			int New_Salary = NewSalary - Salary;
			System.out.println("Salary for your Performance " + New_Salary);
		} else if (rating < 75) {
			Salary = (Salary * 5) / 100;
			int New_Salary = NewSalary - Salary;
			System.out.println("Salary for your Performance " + New_Salary);
		} else {
			System.out.println("Enter Your Performance Rating:");
		}obj.close();
	}
}
