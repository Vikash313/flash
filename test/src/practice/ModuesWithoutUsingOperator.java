package practice;

import java.util.Scanner;

public class ModuesWithoutUsingOperator {

	public static void main(String[] args) {


       Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        
        int c = a / b;
        int m = a-b*c;
        System.out.println("Modules is: "+m);
        


	}

}
