package practice;

import java.util.Scanner;

public class EvenOrOddChecker {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(1);
			}
		else {
			System.out.println(0);
		}

	}

}
