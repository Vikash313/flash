package practice;

import java.util.Arrays;

public class Exercise92 {

	public static void main(String[] args) {
		
		int ctr_even = 0, ctr_odd = 0;
		
		int[] num = {5,7,2,4,9};
		System.out.println("Original Array: "+Arrays.toString(num));
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				ctr_even++;
			}
			else
				ctr_odd++;
		}
		System.out.println("Number of even elements in the array is: "+ctr_even);
		System.out.println("Number of odd elements in the array is: "+ctr_odd);

	}

}
