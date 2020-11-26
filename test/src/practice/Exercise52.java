package practice;

import java.util.Scanner;

public class Exercise52 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = in.nextInt();
		System.out.println("Enter the second number: ");
		int b = in.nextInt();
		System.out.println("Enter the third number: ");
		int c = in.nextInt();
		
		/*if( c ==  a +  b) {
			System.out.println("The result is: True");
		}*/
	    
	    System.out.println("The result is: "+sumoftwo(a,b,c));

	}
	public static boolean sumoftwo(int x, int y, int z) {
		return((x + y) == z || (y + z) == x || (z + x) == y);
	}

}
