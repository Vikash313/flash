package practice;

import java.util.Scanner;

public class Exercise153 {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		double num1 = in.nextDouble();
		System.out.println("Enter the second number:");
		double num2 = in.nextDouble();
		
		if(0 < num1 && num2 < 1) {
			System.out.println(true);
		}
		else
			System.out.println(false);


	}

}
