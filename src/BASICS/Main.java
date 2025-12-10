package BASICS;

import java.util.Scanner;
class Ticket {
 double baseFare = 500;
 double discount = 0;
 int age;
 char gender;
 String student;
 Ticket(int age, char gender, String student) {
     this.age = age;
     this.gender = gender;
     this.student = student.toLowerCase();
 }
 public void calculateDiscount() {
     if (age > 60) {
         discount += 0.40;
     }if (gender == 'F' || gender == 'f') {
         discount += 0.20;
     }if (age < 12) {
         discount += 0.50;
     }if (student.equals("yes")) {
         discount += 0.15;
     }
 }
 public double getFinalFare() {
     return baseFare - (baseFare * discount);
 }
 public void printDetails() {
     System.out.println("Total Discount: " + (discount * 100) + "%");
     System.out.println("Final Ticket Fare: ₹" + getFinalFare());
 }
}
public class Main {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter age: ");
     int age = sc.nextInt();

     System.out.print("Enter gender (M/F): ");
     char gender = sc.next().charAt(0);

     System.out.print("Are you a student? (yes/no): ");
     String student = sc.next();
     Ticket t = new Ticket(age, gender, student);
     t.calculateDiscount();
     t.printDetails();
     sc.close();
 }
}

