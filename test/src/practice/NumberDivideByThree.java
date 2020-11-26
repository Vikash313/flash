package practice;

public class NumberDivideByThree {

	public static void main(String[] args) {
		System.out.println("\nDivide by 3: ");
            for(int i = 1; i<=100;i++) {
            	if(i%3 == 0) {
            		System.out.println(i+",");
            	}
            }
            
         System.out.println("\nDivide by 5: ");	
            for(int i = 1; i<=100;i++) {
            	if(i%5 == 0){
            		System.out.println(i+",");
            	}
            }
            
          System.out.println("\nDivide by 3 and 5: ");
          for(int i = 1; i<=100;i++) {
          	if(i%3 == 0 && i%5 == 0){
          		System.out.println(i+",");
          	}
		

	}

	}
}