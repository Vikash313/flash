package practice;

import java.util.Scanner;

public class HourMinuteSecond {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the second: ");
		int second = in.nextInt();
		int p1 = second % 60;
		int p2 = second / 60;
		int p3 = p2 % 60;
		p2 = p2 / 60;
		
		System.out.println(p2+ ":"+p3+ ":" +p1);
		

	}

}
