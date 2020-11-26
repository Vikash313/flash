package test;

import java.util.Scanner;

public class Exercise85 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		int ctr = 0;
		
		while(n != 1) {
			System.out.println(n);
			if(n % 2 ==0) {
				n = n/2;
				ctr+= 1;
			}
			else {
				n = (3 * n + 1)/2;
				ctr += 1;
			}
		}
		System.out.println(ctr);
		in.close();
}
}
