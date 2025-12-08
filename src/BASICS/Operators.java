package BASICS;

public class Operators {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;

		//Arithmetic operator
		System.out.println("*Arithmetic*");
		System.out.println("Add = " + (a + b));
		System.out.println("Sub = " + (a - b));
		System.out.println("Mul = " + (a * b));
		System.out.println("Div = " + (a / b));
		System.out.println("Mod = " + (a % b));
		System.out.println();

		//Relational operator
		System.out.println("*Relational*");
		System.out.println("Greater = " + (a > b));
		System.out.println("Less = " + (a < b));
		System.out.println("Greater Than = " + (a >= b));
		System.out.println("Less Than = " + (a <= b));
		System.out.println("Equal = " + (a == b));
		System.out.println("Not Equal = " + (a != b));
		System.out.println();

		boolean condition1 = true;
		boolean condition2 = false;

		//Logical operator
		System.out.println("*Logical*");
		System.out.println("Condition1 && Condition2 : " + (condition1 && condition2));
		System.out.println("Condition1 || Condition2 : " + (condition1 || condition2));
		System.out.println("!Condition1 : " + (!condition1));
		System.out.println("!Condition2 : " + (!condition2));
		System.out.println();

		//Assignment operator
		int num = 10;
		System.out.println("*Assignment*");
		num += 5;
		System.out.println("Add = " + num);
		num -= 2;
		System.out.println("Sub = " + num);
		num *= 3;
		System.out.println("Mul = " + num);
		num /= 6;
		System.out.println("Div = " + num);
		num %= 5;
		System.out.println("Mod = " + num);
		System.out.println();

		//Ternary operator
		int score = 50;
        String result = (score >= 50) ? "Pass" : "Fail";
        System.out.println("*Ternary*");
        System.out.println("Result: " + result);
	}
}
