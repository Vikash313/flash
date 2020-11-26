package practice;
import java.util.Scanner;

public class Exercise54 {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = in.nextInt();
		System.out.println("Enter the second number: ");
		int b = in.nextInt();
		System.out.println("Enter the third number: ");
		int c = in.nextInt();
		
		System.out.println("The result: "+test_last_digit(a, b, c, true));
		
	}
	public static boolean test_last_digit(int x, int y, int z, boolean xyz) {
		return (x % 10 == y % 10 || y % 10 == z % 10 || z % 10 == x % 10);
	}

}
