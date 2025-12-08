package BASICS;

public class Variables {
	int b=26;
	static int c=18;
	public static void main(String args[]) {
		int a = 45;
		System.out.println("Local "+ a);
		Variables obj= new Variables();
		System.out.println("Instance "+ obj.b);
		System.out.println("Static "+ c);
	}

}
