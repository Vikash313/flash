package practice;

import java.util.Scanner;

public class AddWihoutOpr {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int x = in.nextInt();
		System.out.println("Enter second number: ");
		int y = in.nextInt();
		
		
		while(y != 0) {
			int carry = x & y;
			x = x^y;
			y = carry << y;		
		}
		System.out.println("Sum: "+x);
		

	}

}
