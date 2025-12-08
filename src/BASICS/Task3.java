package BASICS;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter Your Shopping Amount: ₹");
		int Amount= obj1.nextInt();
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Enter Your MemberShip Type");
		String M_Type=obj2.nextLine();
		/*if(M_Type =="Yes") {
			float Discount=(Amount*5)/100;
			System.out.println("Your Discount Amount: "+Discount);
			System.out.println("Amount Want to Pay: "+(Amount-Discount));
		}else {
			System.out.println("No Discount!..");
			System.out.println("Amount Want to Pay: "+Amount);
		}*/
		switch(M_Type) {
		case "Yes":
			float Discount=(Amount*5)/100;
			System.out.println("Your Discount Amount: "+Discount);
			System.out.println("Amount Want to Pay: "+(Amount-Discount));
			break;
		default :
			System.out.println("No Discount!..");
			System.out.println("Amount Want to Pay: "+Amount);
		
		}
		obj1.close();obj2.close();
	}

}
