package practice;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int sum = 0, remainder;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		while(n != 0) {
			remainder = n % 10;
			sum += remainder;
			n/=10;	
		}
		System.out.println("Sum: "+sum);
		

	}

}
