package Basicpart2;

import java.util.Scanner;

public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int n1 = in.nextInt();
		System.out.println("Enter the first number: ");
		int n2 = in.nextInt();
		
		System.out.println("GCD is: "+gcd(n1, n2));
		
		
	}
	public static int gcd(int n1, int n2) {
		
		/*if(n1 == 0 || n2 == 0)
			return 0;
		if(n1 == n2)
			return n1;
		if(n1 > n2)
			return gcd(n1-n2,n2);
		else
			return gcd(n1,n2-n1);*/
		if(n1 == 0)
			return n2;
		return gcd(n2%n1,n1);
	}

}
