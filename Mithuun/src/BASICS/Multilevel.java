package BASICS;
import java.util.Scanner;
		class Multilevel1 {
		    protected String name;
		    protected int age;
		    protected int salary;

		    Scanner sc = new Scanner(System.in);

		    public void display() {
		        System.out.println("Enter the name:");
		        name = sc.nextLine();

		        System.out.println("Enter the age:");
		        age = sc.nextInt();

		        System.out.println("Enter the salary:");
		        salary = sc.nextInt();
		    }
		}
		class Salary_Details extends Multilevel1 {
		    protected int savingPerMonth;

		    public void calcSaving() {
		        System.out.println("Enter the saving amount per month:");
		        savingPerMonth = sc.nextInt();

		        int months = 0;
		        if (savingPerMonth != 0) {
		            months = salary / savingPerMonth;
		        }

		        System.out.println("The saving in months is: " + months);
		    }
		}
		class Employee_Details extends Salary_Details {
		    public void print() {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("Salary: " + salary);
		        System.out.println("Thank you");
		    }
		}
		public class Multilevel {
		    public static void main(String[] args) {
		        Employee_Details obj = new Employee_Details();
		        obj.display();     
		        obj.calcSaving();  
		        obj.print();       
		    }
	}