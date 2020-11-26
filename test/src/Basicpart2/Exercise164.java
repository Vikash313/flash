package Basicpart2;

import java.util.Scanner;

public class Exercise164 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the dividend: ");
		int n1 = in.nextInt();
		System.out.println("Enter the divisor: ");
		int n2 = in.nextInt();
		
		int ctr = 0;
		while(n1 != 0) {
			n1 = n1-n2;
			ctr++;
		}
		System.out.println("\nQuotient is: "+ctr);

	}

}
