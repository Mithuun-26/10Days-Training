package BASICS;
import java.util.Scanner;
public class ScholarshipStatus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mark Percent : ");
		int marks = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Attendance Percentage : ");
		int attendence = sc.nextInt();
		sc.nextLine();
		if (marks >= 90) {
			if (attendence >= 95) {
				System.out.println("Full Scholarship");
			}
			else {
				System.out.println("You have below 95% Attendence");
			}
		} else if (marks >= 80 && marks < 90) {
			if (attendence >= 90) {
				System.out.println("Partial Scholarship");
			}
			else {
				System.out.println("You have below 90% Attendence");
			}
		} else if (marks >= 70 && marks < 80) {
			if (attendence >= 85) {
				System.out.println("Consideration(Maybe Eligible");
			}
			else {
				System.out.println("You have below 85% Attendence");
			}
		} else if (marks <= 80) {
			System.out.println("Not Eligible");
		}sc.close();
	}
}