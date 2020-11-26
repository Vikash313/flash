package Basicpart2;

import java.util.Arrays;

public class ThreeSmallestNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,4,17,7,25,3,100};
		int k = 3;
		System.out.println("Original Array is:");
		System.out.println(Arrays.toString(arr));
		System.out.println(k + " smallest number of the given array is: ");
		Arrays.sort(arr);
		for(int i = 0; i < k; i++)
			System.out.println(arr[i] + " "); 

	}

}
