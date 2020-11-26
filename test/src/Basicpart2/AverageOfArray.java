package Basicpart2;

import java.util.Arrays;

public class AverageOfArray {

	public static void main(String[] args) {
		
		int[] arr = {1,4,17,7,25,3,100};
		System.out.println("Original Array is : "+Arrays.toString(arr));
	
		
		int avg, sum = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		
		System.out.println("\nAverage of the given Array is :"+avg);
		System.out.println("\nThe number greater than the average of the given array are: ");
		
		for(int i = 0; i < arr.length; i++) 
			if(arr[i] > avg)
		System.out.println(arr[i]);
				
	}

}
