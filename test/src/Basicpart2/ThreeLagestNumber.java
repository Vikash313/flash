package Basicpart2;

import java.util.Arrays;
import java.util.Collections;

public class ThreeLagestNumber {

	public static void main(String[] args) {
		
		Integer arr[] = new Integer[] {1, 4, 17, 7, 25, 3, 100};
		int k = 4;
		System.out.println("Original Array:");
		System.out.println(Arrays.toString(arr));
		System.out.println(k +"largest element of the given array is: ");
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i = 0; i < k; i++)
			System.out.println(arr[i] + " ");

	}

}
