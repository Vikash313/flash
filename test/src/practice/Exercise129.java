package practice;

import java.util.Arrays;

public class Exercise129 {

	public static void main(String[] args) {
		
		int[] nums = {10,20,10,20,30,40,40,30,50};
		System.out.println("Source Array is: "+Arrays.toString(nums));
		
		if(nums == null || nums.length ==0) {
			System.out.println("Cannot be Obtained");
		}
		
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
		}
		System.out.println(+result+" appears only once");
	}

}
