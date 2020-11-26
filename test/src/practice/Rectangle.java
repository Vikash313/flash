package practice;
import java.util.Scanner;

public class Rectangle {
	
	//private static final int length = 5;
	
	//private static final int breadth = 6;
			

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle: ");
		int length = s.nextInt();
		System.out.println("Enter the breadth of rectangle: ");
		int breadth = s.nextInt();
		
		int area = length * breadth;
		int perimeter = 2 * (length + breadth);
		
		System.out.println("Area of rectangle is: "+area);
		System.out.println("Perimeter of rectangle is: "+perimeter);

	}

}
