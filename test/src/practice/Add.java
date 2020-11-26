package practice;
import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
        
		
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the first number: ");
	  int num1 = input.nextInt();
	  System.out.println("Enter the Second number: ");
	  int num2 = input.nextInt();
	 // int sum = num1 + num2;
	 // System.out.println("Sum: "+sum);
	  System.out.println(num1 + " + " + num2 +  " = " + (num1 + num2));
	  System.out.println(num1 + " -" + num2 +  " = " + (num1 - num2));
	  System.out.println(num1 + " + " + num2 +  " = " + (num1 * num2));
	  System.out.println(num1 + " + " + num2 +  " = " + (num1 / num2));
	  System.out.println(num1 + " mod"+ num2 +  " = " + (num1 % num2));

	}
}