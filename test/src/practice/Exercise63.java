package practice;

import java.util.Scanner;

public class Exercise63 {

	public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        
        System.out.println("Result: "+result(a,b));
        
	}
	
     public static int result(int x, int y){
        if(x == y)
        	return 0;
        if(x % 6 == y % 6)
        	return (x<y)?x:y;
        return(x>y)?x:y;
          }

}
