package BASICS;

public class ToppersList {

	public static void main(String[] args) {
		int[] marks = { 45, 78, 89, 90, 67, 89 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > first) {
				third = second;
				second = first;
				first = mark;
			} else if (mark > second && mark != first) {
				third = second;
				second = mark;
			} else if (mark > third && mark != first && mark != second) {
				third = mark;
			}
		}
		System.out.println("Top 3 Students:");
		System.out.println("Highest: " + first);
		System.out.println("Second Highest: " + second);
		System.out.println("Third Highest: " + third);
	}
}
