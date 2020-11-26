package practice;

import java.util.Scanner;

public class AreaOfHexagon {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of side of Hexagon: ");
		int s = input.nextInt();
		
		double area = (6 * (s*s))/(4 * Math.tan(Math.PI/6));
		
		System.out.println("Area of Hexagon is: "+area);

	}

}
