package Basicpart2;

import java.util.Arrays;

public class Exercise165 {

	public static void main(String[] args) {
		
		int[] arr = {-2,3,4,-1,-3,1,2,-4,0};
		int temp = 0; 
		int j = 0;
		
		System.out.println("Original Array is: "+Arrays.toString(arr));
		for(int i = arr.length; i > 0; i--)
			for( j = 1; j <= i; j++)
			    temp = arr[j-1];
		        arr[j-1] = arr[j];
		        arr[j] = temp;
		/*Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));*/

	}

}
