package practice;
import java.util.Scanner;

public class Circle {
	
	//private static final double radius = 7.5;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
	    System.out.println("Enter the radius of Circle: ");
	    
	    double radius = in.nextDouble();
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius *radius;
		
		System.out.println("Perimeter of the Circle is: "+perimeter);
		System.out.println("Area of the Circle is: "+area);

	}

}
