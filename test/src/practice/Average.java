package practice;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = in.nextInt();
		System.out.println("Enter the value of b: ");
		int b = in.nextInt();
		System.out.println("Enter the value of c: ");
		int c = in.nextInt();
		System.out.println("Enter the value of d: ");
		int d = in.nextInt();
		System.out.println("Enter the value of e: ");
		int e = in.nextInt();
		
		System.out.println("Average of number is: " +(a + b + c + d + e) / 5);

	}

}
