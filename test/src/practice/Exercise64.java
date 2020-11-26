package practice;

import java.util.Scanner;

public class Exercise64 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        
        System.out.println("Result: "+common_digit(a,b));
        
     }
	    public static boolean common_digit(int p, int q) {
	    	if(p<25 || q>75)
	    		return false;
	    	int x = p % 10;
	    	int y = q % 10;

	    	p /=10;
	    	q /=10;
	    	
	    	return(p==q || p==y || q==y || x==y );
	    }
	  

}
