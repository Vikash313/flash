package practice;

import java.util.Arrays;

public class Exercise80 {

	public static void main(String[] args) {
		
		int[] array = {20,30,40};
		System.out.println("Original Array: "+Arrays.toString(array));
		
		int x = array[0];
		array[0] = array[array.length-1];
		array[array.length-1] = x;
		
		System.out.println("New array after swapping the first and last element: "+Arrays.toString(array));

	}

}
