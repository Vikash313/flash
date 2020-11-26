package practice;

import java.util.Arrays;

public class Exercise78 {

	public static void main(String[] args) {
		
		int[] array = {4,5};
		System.out.println("Original Arrays: "+Arrays.toString(array));
		
		System.out.println(array[0] == 4 || array[0] == 7 && array[1] == 4 || array[1] == 7);
		
		/*if(array[0] == 4 || array[0] == 7 && array[1] == 4 || array[1] == 7) {
			System.out.println("true");
			}
		else {
			System.out.println("false");
			
		}*/

	}

}
