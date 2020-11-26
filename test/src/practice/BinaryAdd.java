package practice;

import java.util.Scanner;

public class BinaryAdd {

	public static void main(String[] args) {
		String b1,b2;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first binary number: ");
		b1 = in.next();
		System.out.println("Enter the second binary number: ");
		b2 = in.next();
		
		int n1 = Integer.parseInt(b1, 2);
		int n2 = Integer.parseInt(b2, 2);
		int sum = n1 + n2;
		String result = Integer.toBinaryString(sum);
		
		System.out.println("sum of two binary numbers: " +result);

	}

}
