package BASICS;
interface Vehicle{
	void start();
	abstract void new2();
	default void normal() {
		System.out.println("Default");
	}
	static void n3() {
		System.out.println("Static Method");
	}
}
class Car implements Vehicle{
	public void start() {
		System.out.println("Car is Starting");
	}
	public void new1() {
		
	}
}
class Intro_Interface {
	public static void main(String[] args) {
		Vehicle v =new Car();
		v.start();
		Car c =new Car();
		c.start();
		c.normal();
	}
}