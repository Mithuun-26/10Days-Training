package BASICS;
import java.util.Scanner;

public class ATM_notes {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter amount: ");
		        int amount = sc.nextInt();
		        int n_2000 = 0, n_500 = 0, n_200 = 0, n_100 = 0;		 
		        if (amount >= 2000) {
		            n_2000 = amount / 2000;
		            amount = amount % 2000;
		        }if (amount >= 500) {
		            n_500 = amount / 500;
		            amount = amount % 500;
		        }if (amount >= 200) {
		            n_200 = amount / 200;
		            amount = amount % 200;
		        }if (amount >= 100) {
		            n_100 = amount / 100;
		            amount = amount % 100;
		        }		        
		        System.out.println("Notes required for your Amount "+ amount);
		        System.out.println("2000 : " + n_2000);
		        System.out.println("500  : " + n_500);
		        System.out.println("200  : " + n_200);
		        System.out.println("100  : " + n_100);
		        sc.close();
		    }
	}