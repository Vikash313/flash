package practice;

import java.util.Scanner;

public class Swap {
	
	int x, y;
	static int z;
	 

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int x = in.nextInt();
		System.out.println("Enter the second number: ");
		int y = in.nextInt();
		
	    z = x; 
		x = y;
		y = z;
		
		System.out.println("Swapped values are: " + x + " and " +y);
		
		

	}

}
