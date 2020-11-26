package practice;

import java.util.Scanner;

public class TrailingZerosInFact {

	public static void main(String[] args) {
		
		
        Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = in.nextInt();
		int ctr = 0;
		
		while(n != 0) {
			ctr = ctr + n/5;
			n = n/5;
		}
		
		System.out.println("Number of trailing zeros of the factorial is: "+ctr);


	}

}
