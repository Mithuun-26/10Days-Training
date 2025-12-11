package BASICS;

public class Employee_Salary {

	public static void main(String[] args) {
		        String[] names = {"Amit", "Riya", "John", "Sara"};
		        double[] salary = {40000, 55000, 30000, 70000};
		        int[] ratings = {9, 6, 8, 4};
		        System.out.println("Employee Salary Hike Details:\n");
		        for (int i = 0; i < ratings.length; i++) {
		            double hike = 0;
		            if (ratings[i] >= 9) {
		                hike = salary[i] * 0.40;   
		            } else if (ratings[i] >= 7) {
		                hike = salary[i] * 0.25;   
		            } else if (ratings[i] >= 5) {
		                hike = salary[i] * 0.10;   
		            } else {
		                hike = 0;                  
		            }
		            double newSalary = salary[i] + hike;
		            System.out.println(
		                names[i] + " | Rating: " + ratings[i] +
		                " | Old Salary: " + salary[i] +
		                " | Hike: " + hike +
		                " | New Salary: " + newSalary);
		        }
		    }
	}