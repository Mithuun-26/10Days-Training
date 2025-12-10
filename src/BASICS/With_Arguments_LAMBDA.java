package BASICS;
//@ functional Interface
interface Contract1{
	void sim1(int a,int b);
	public static void rule0() {
		System.out.println("Rule 0");
	}
	public default void rule1() {
		System.out.println("Rule 1");
	}
}
public class With_Arguments_LAMBDA {
	public static void main(String []args) {
		 Contract1 Cc1 = (a,b) ->{
			System.out.println("Function Inteface"); 
		 };
		 Cc1.sim1(10, 20);
		 Contract1.rule0();
		 Cc1.rule1();
	}

}
