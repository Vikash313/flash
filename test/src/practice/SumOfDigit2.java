package practice;

import java.util.Scanner;

public class SumOfDigit2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a positive number: ");
		int n = in.nextInt();
		
		int rem = 0;
		int sum = 0;
		
		while(n != 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("The single digit number is: "+sum);

	}

}
