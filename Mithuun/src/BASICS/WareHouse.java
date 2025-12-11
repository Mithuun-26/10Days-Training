package BASICS;

public class WareHouse {
		    public static void main(String[] args) {		        int[] expected = {10, 20, 30, 40};
		        int[] actual   = {10, 18, 35, 38};
		        System.out.println("Warehouse Stock Mismatch:\n");
		        for (int i = 0; i < expected.length; i++) {
		            if (expected[i] != actual[i]) {
		                int difference = actual[i] - expected[i];
		                System.out.println("Box " + (i + 1) +
		                    " | Expected: " + expected[i] +
		                    " | Actual: " + actual[i] +
		                    " | Difference: " + difference);
		            }
		        }
		    }
	}