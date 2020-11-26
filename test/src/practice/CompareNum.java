package practice;

import java.util.Scanner;

public class CompareNum {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		num1 = s.nextInt();
		System.out.println("Enter the second number: ");
		num2 = s.nextInt();
		
		if(num1 > num2)
		{
			System.out.println(num1 + " ! = "+num2);
			System.out.println(num1 + " > "+num2);
			System.out.println(num1 + " > = "+num2);
		}
		else if(num1 < num2) 
		{
			System.out.println(num1 + " ! = "+num2);
			System.out.println(num1 + " < "+num2);
			System.out.println(num1 + " < = "+num2);
		}
		
		else {
			System.out.println(num1 + " = "+num2);
		}

	}

}
