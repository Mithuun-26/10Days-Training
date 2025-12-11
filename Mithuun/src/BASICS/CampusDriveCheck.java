package BASICS;
import java.util.ArrayList;
import java.util.Scanner;
class Student{
	int id;
	String name;
	double percentage;
	Student(int id , String name , double percentage){
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
}
public class CampusDriveCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <Student> eligibleList = new ArrayList<>();
		ArrayList <Student> noteligibleList = new ArrayList<>();
		System.out.println("Enter Number Student : ");
		int no = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < no ; i++) {
			System.out.println("Enter Details for Student "+(i+1));
			System.out.println("Enter ID : ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name : ");
			String name = sc.nextLine();
			System.out.println("Enter Percentage : ");
			double percentage = sc.nextDouble();
			Student s = new Student(id , name , percentage);
			if (percentage>=60) {
				eligibleList.add(s);			
			}else {
				noteligibleList.add(s);
			}
		}
		System.out.println("------ELIGIBLE STUDENT LIST------");
		for (Student s: eligibleList) {
			System.out.println("ID : "+s.id+"\n Name : "+s.name+"\n Percentage : "+s.percentage);
		}
		System.out.println("------NOT ELIGIBLE STUDENT LIST------");
		for (Student s: noteligibleList) {
			System.out.println("ID : "+s.id+"\n Name : "+s.name+"\n Percentage : "+s.percentage);
		}		
	}
}
