package practice;

import java.util.Scanner;

public class Exxercise152 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int num1 = in.nextInt();
		System.out.println("Enter the second number:");
		int num2 = in.nextInt();
		System.out.println("Enter the third number:");
		int num3 = in.nextInt();
		System.out.println("Enter the fourth number:");
		int num4 = in.nextInt();
		
		if(num1 == num2 && num2 == num3 && num3 == num4 && num4 == num1) {
			System.out.println("Numbers are equal!");
		}
			
			else {
				System.out.println("Numbers are not equal!");
		}



		

	}

}
